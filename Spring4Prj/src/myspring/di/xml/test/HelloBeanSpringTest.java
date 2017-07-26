package myspring.di.xml.test;


import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.xml.Hello;

@RunWith(SpringJUnit4ClassRunner.class)	//스프링이 Junit을 확장해서 실행한다는 의미이다
@ContextConfiguration(locations="classpath:config/beans.xml")	//bean을 설정한 xml파일명을 써준다.
public class HelloBeanSpringTest {
	
	@Autowired	//autowired선언을 하면 factory.getBean("");으로 객체를 주입시킬 필요없이 자동으로 주입된다
	ApplicationContext factory;
	
	@Autowired
	Hello hello;
	
	
	@Autowired
	Hello helloC;
	
	
	@Test
	public void setCollection() {
		hello.getNamesSet().stream().forEach(System.out::println);
	}
	@Test
	public void collection() {
		hello.getNames().stream().forEach(System.out::println);
	}
	
	
	@Test @Ignore
	public void constructor() {
		Assert.assertEquals("Hello 생성자", helloC.sayHello());
		System.out.println(helloC.getPrinter().getClass().getName());
	}
	
	
	@Test @Ignore
	public void bean1() {
		//System.out.println(factory.getClass().getName());
		//Hello hello = factory.getBean("hello",Hello.class);
		Assert.assertEquals("Hello 길동아", hello.sayHello());
	}
	
	
}

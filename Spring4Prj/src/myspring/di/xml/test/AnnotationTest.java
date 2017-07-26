package myspring.di.xml.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.annotation.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/annot.xml")
public class AnnotationTest {
	
	@Autowired
	Hello hello;
	
	@Test
	public void bean() {
		Assert.assertEquals("Hello ȫ�浿", hello.sayHello());
		hello.print();
		Assert.assertEquals("Hello ȫ�浿", hello.getPrinter().toString());
	}
	
}

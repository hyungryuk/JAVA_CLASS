package myspring.di.xml;

import java.util.List;
import java.util.Set;

public class Hello {
	private String name;
	private Printer printer;
	private List<String> names;
	private Set<String> namesSet;
	
	public Hello() {
		System.out.println("Hello Default Constructor ȣ���!");
	}
	
	
	public Hello(String name, Printer printer) {
		System.out.println("overloading �� constructor ȣ���");
		this.name = name;
		this.printer = printer;
	}

	public Printer getPrinter() {
		return printer;
	}
	
	public Set<String> getNamesSet() {
		return namesSet;
	}
	
	public void setNamesSet(Set<String> namesSet) {
		this.namesSet = namesSet;
	}
	
	public List<String> getNames() {
		return names;
	}


	public void setNames(List<String> names) {
		this.names = names;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello " + this.name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}

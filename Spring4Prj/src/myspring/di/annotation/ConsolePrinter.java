package myspring.di.annotation;

import org.springframework.stereotype.Component;

@Component("cPrinter")
public class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}

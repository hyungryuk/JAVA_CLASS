package myspring.di.annotation;

import org.springframework.stereotype.Component;

@Component("sPrinter")
public class StringPrint implements Printer {
	private StringBuilder sb = new StringBuilder();	
	
	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		this.sb.append(message);
	}

	@Override
	public String toString() {
		return this.sb.toString();
	}	

}

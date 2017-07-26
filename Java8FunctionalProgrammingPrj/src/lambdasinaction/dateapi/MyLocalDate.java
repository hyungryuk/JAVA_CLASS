package lambdasinaction.dateapi;

import java.time.LocalDate;

public class MyLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate today2 = LocalDate.now();
		System.out.println(today.compareTo((today2))==0);
		
		System.out.println("��" + today.getYear());
		System.out.println("��:" + today.getMonthValue() + " " +today.getMonth());
		System.out.println("��" + today.getDayOfMonth());
		System.out.println(today.getDayOfYear()	);
		System.out.println("����" + today.getDayOfWeek() +" "+today.getDayOfWeek().getValue());
		System.out.println(today.plusDays(165));
		System.out.println(today.minusMonths(10));
	
		LocalDate lastDate = LocalDate.of(2017, 12, 31);
		System.out.println(lastDate);
	}
	}
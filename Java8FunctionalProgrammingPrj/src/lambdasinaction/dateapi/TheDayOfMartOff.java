package lambdasinaction.dateapi;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;

public class TheDayOfMartOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate dayofMartoff = today.with(new TemporalAdjuster() {

			@Override
			public Temporal adjustInto(Temporal temporal) {
				//���س�¥ ��������
				LocalDate theDay = LocalDate.from(temporal);
				System.out.println("���س�¥ : " + theDay);
				//�ι�° �Ͽ���
				LocalDate secondSun = theDay.with(dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
				System.out.println(secondSun);
				//�׹�° �Ͽ���
				LocalDate forthSun = theDay.with(dayOfWeekInMonth(4, DayOfWeek.SUNDAY));
				System.out.println(forthSun);
				//���س�¥�� �ι�° �Ͽ��Ϻ��� �����̸� �ι�° �Ͽ���
				//���س�¥�� �ι�° �Ͽ��ϰ� 4��° �Ͽ��� �����̸�
				//���س�¥�� 4��° �Ͽ��Ϻ��� �ڿ����� ���
				
				
				
				return null;
			}
		});
		System.out.println("�̹��� ��Ʈ ���³��� : "+dayofMartoff+" �Դϴ�");
	}
	
}
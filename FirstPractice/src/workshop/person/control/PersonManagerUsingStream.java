package workshop.person.control;

import java.util.List;

import workshop.person.entity.PersonEntity;

public class PersonManagerUsingStream {

	public PersonManagerUsingStream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonManager pManager = new PersonManager();
		PersonEntity[ ] persons = new PersonEntity[10];
		pManager.filePersons(persons);
		pManager.printTitle("@@@ �ι� ���� ��ȸ �ý��� @@@");
		pManager.printTitleLine();
		pManager.showPerson(persons);
		pManager.findyGender(persons,'��');
		pManager.printTitleLine();
		pManager.showPerson(persons,"���ϴ�");

	}
	
	public void filePersons(List<PersonEntity> persons){
		persons.add(new PersonEntity("�̼�ȣ","7212121028102", "��õ ��籸", "032-392-2932"));
		persons.add(new PersonEntity("���ϴ�","7302132363217", "���� ������", "02-362-1932")); 
		persons.add(new PersonEntity("�ڿ���","7503111233201", "���� ���ϱ�", "02-887-1542"));
		persons.add(new PersonEntity("���μ�","7312041038988", "���� ������", "032-384-2223"));
		persons.add(new PersonEntity("ȫ����","7606221021341", "���� ��õ��", "02-158-7333"));
		persons.add(new PersonEntity("�̹̼�","7502142021321", "���� ������", "02-323-1934"));
		persons.add(new PersonEntity("�ڼ���","7402061023101", "���� ���α�", "02-308-0932"));
		persons.add(new PersonEntity("������","7103282025101", "���� ����", "02-452-0939"));
		persons.add(new PersonEntity("Ȳ����","7806231031101", "��õ �߱�", "032-327-2202")); 
		persons.add(new PersonEntity("��ö��","7601211025101", "��õ ��籸", "032-122-7832"));
	}
	
	public void showPerson(List<PersonEntity> persons) {
		persons.stream()
				.forEach(System.out::println);
	}
	
	public void findyGender(List<PersonEntity> persons, char gender) {
		long cnt = persons.stream()
					.filter(p -> p.getGender()=='��')
					.count();
					
		System.out.println("���� : \'"+gender+ "\'(��)��"+cnt+"�� �Դϴ�.");
	}
	
	public void showPerson(List<PersonEntity> persons,String name) {
		System.out.println("-- �̸� : \'"+name+"\'(��)�� ã�� ����Դϴ�. --");
		printItemLine();
		
		PersonEntity person =null;
				persons.stream()	
								.filter(d->d.getName().equals(name))
								.findFirst()
								.get();
		
		System.out.println("[�̸�] "+person.getName()+"\n"+"[����] "+person.getGender()+"\n"+"[��ȭ��ȣ] "+person.getPhone()+"\n"+"[�ּ�] "+person.getAddress());
				
			
		
	}
	
	public void printTitle(String title) {
		System.out.println(title);
	}
	
	public void printTitleLine() {
		System.out.println("==============================================================================================");
	}
	
	public void printItemLine() {
		System.out.println("-----------------------------------------------------------------------------------------------");
	}

	public Object findByGender(List<PersonEntity> persons, char c) {
		// TODO Auto-generated method stub
		return null;
	}
}
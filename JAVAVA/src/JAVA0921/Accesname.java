package JAVA0921;

public class Accesname {

	public static void main(String[] args) {
		AccessModifier ac = new AccessModifier();
		ac.age =30;
		System.out.println(ac.age);//��������
		
		int getAge = ac.getAge();//���������� �԰�
		System.out.println(getAge);

	}

}

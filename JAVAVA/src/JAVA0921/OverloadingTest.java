package JAVA0921;

public class OverloadingTest {
	public int method(int a) {
		return  a+10;
	}
	public double method(double a) {
		return a+10;
	}

	public static void main(String[] args) {
		OverloadingTest over = new OverloadingTest();
		System.out.println(over.method(10));//�żҵ� �̸��� ������ �Ķ������ ���¿� ���� �Է°��� �˸��� ���°� ��µȴ�.
		System.out.println(over.method(1.414));

	}

}

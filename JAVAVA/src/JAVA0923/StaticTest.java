package JAVA0923;

public class StaticTest {
	int i =10;
	
	public void go() {
		int i=1;
		System.out.println(this.i);
		System.out.println(i);
	}
	public static int goStatic() {
		//this.i =10;//�����Ұ�
		int j =2;//���� ���� �������ȵȴٴ��ǹ�
		System.out.println(j);
		return j;
		
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.go();
		System.out.println(goStatic());//ù2��  �޼ҵ� ���ప�̰�  ���Ϲ޾Ƽ� ���� gostatic�� 2�� ���Ϲ޾Ƽ�
		//2�� �ι������Ե�
		//System.out.println(go());
		//System.out.println(this.i);

	}

}

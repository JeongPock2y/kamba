package JAVA0923;

public class StaticBlockPrint {
	public  static  int  i;
	
	static {
		System.out.println("ù��° static ��");
		i=10;
		
	}
	static {
		System.out.println("�ι�° static ��");
		i =300;
	}
	static {
		System.out.println("3��° static ��");
		i =500;
	}
}

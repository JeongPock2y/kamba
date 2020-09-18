public class Student {
	
	String name;						//�л� �̸�
	int kor;								//���� ����
	int eng;								//���� ����
	int mat;							//���� ����
	
	/*
	 * �޼ҵ� �̸� : setName
	 * �Ķ��Ÿ : �Է¹��� �л� �̸�
	 * ����Ÿ�� : ����
	 * ���� : �Է¹��� �л� �̸��� Student��ü�� �л� �̸� ��������� �����Ͻÿ�.
	 * */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * �޼ҵ� �̸� : getName
	 * �Ķ��Ÿ : ����
	 * ����Ÿ�� : ����� �л� �̸�
	 * ���� : Student��ü�� ����� �л� �̸��� ��ȯ�Ͻÿ�. 
	 * */
	public String getName() {
		return name;
	}
	
	/*
	 * �޼ҵ� �̸� : setKor
	 * �Ķ��Ÿ : �Է¹��� ���� ����
	 * ����Ÿ�� : ����
	 * ���� : �Է¹��� ���� ������ Student��ü�� ���� ���� ��������� �����Ͻÿ�.
	 * */
	public void setKor(int kor) {
		this.kor= kor;
	}
	
	/*
	 * �޼ҵ� �̸� : setEng
	 * �Ķ��Ÿ : �Է¹��� ���� ����
	 * ����Ÿ�� : ����
	 * ���� : �Է¹��� ���� ������ Student��ü�� ���� ���� ��������� �����Ͻÿ�.
	 * */
	public void setEng(int eng) {
		this.eng=eng;
	}
	
	/*
	 * �޼ҵ� �̸� : setMat
	 * �Ķ��Ÿ : �Է¹��� ���� ����
	 * ����Ÿ�� : ����
	 * ���� : �Է¹��� ���� ������ Student��ü�� ���� ���� ��������� �����Ͻÿ�.
	 * */
	public void setMat(int mat) {
		this.mat=mat;
	}
	
	/*
	 * �޼ҵ� �̸� : getTotal
	 * �Ķ��Ÿ : ����
	 * ����Ÿ�� : ����,����,���� ������ �հ�
	 * ���� : �Է¹��� ����,����,���� ������ �հ踦 ��ȯ�Ͻÿ�.
	 * */
	public int getTotal() {
		return kor+eng+mat;
	}
	
	/*
	 * �޼ҵ� �̸� : getAverage
	 * �Ķ��Ÿ : ����
	 * ����Ÿ�� : ����,����,���� ������ ���
	 * ���� : �Է¹��� ����,����,���� ������ ��ո� ��ȯ�Ͻÿ�.
	 * */
	public double getAverage() {
		return (kor+eng+mat)/3.0;
	}
	
}
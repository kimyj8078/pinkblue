//[����]���ڿ��� �Ǽ��� ��ȯ�ϱ�
//(2021.07.31) 
//��ó: Java200��

public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat="37.52127220511242  ";	 
		//������ ���� ����� �Բ� ���Եȴ�.
		//string slat="hello";
		//���� ���� �� double�� Ÿ�� ��ȯ
		
		double latitude=Double.parseDouble(slat.trim());
		//trim()�� ���� ������ �����ؼ� "37.52127220511242"�� ����
		//Double ���� Ŭ������ �̿��ؼ� 37.52127220511242�� Ÿ�Ժ�ȯ��.
		System.out.println(latitude);
	}
}
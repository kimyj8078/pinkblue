//�������� �̿��Ͽ� �Ҽ� �Ǻ��ϱ�
//(2021.07.13) 
//��ó: Java200��

public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS=true;
		for (int i =2;i <=(int)Math.sqrt(n); i++) {
			if(n%i==0) {
				isS=false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[]args) {
		int number=1234567;
		boolean ifPrime=isPrime(number);  //�Ҽ��ΰ��� Ȯ���Ѵ�.
		if(ifPrime) {
			System.out.printf("%�� 1�� �ڽ����θ� ������������ �Ҽ���.", number);
		} else {
			System.out.printf("%d�� �Ҽ��� �ƴϴ�.",number);
		}
	}
}
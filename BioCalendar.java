//MathŬ������ ����ؼ� ��ü ���� ���ϱ� (2021.06.03) 
//��ó: Java200��

public class BioCalendar {
	//���, ������� ���� �Ұ�.
	public static final int PHYSICAL=23; //���(������ ����)
	public static void main(String[] args) {
		int index=PHYSICAL;		//������� ������ ����
		int days=1200;
		double phyval=100*Math.sin((days % index)*2*Math.PI/index);
		System.out.printf("���� ��ü ���� %1$.2f�Դϴ�.\n",phyval);
	}
}
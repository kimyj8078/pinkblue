//[����]���� �����ϱ�
//(2021.07.31) 
//��ó: Java200��

public class Grad {
	public static void main(String[] args) {
		int kor=90;
		int eng=80;
		int math=89;	//������ ������ ����Ÿ�� ������ ���� ������.
		int tot=kor+eng+math;	//�������հ� (259)
		int average=tot/3;		//������ ���=>����(���� ������ ���� 86.3333->86)
		System.out.printf("����%d��,����%d��,����%d��=>\t",kor,eng,math);
		System.out.printf("����%d��,���%d��\n",tot,average);
	}
}
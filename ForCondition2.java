import java.util.ArrayList;
import java.util.List;

//for�� if�� �̿��ؼ� Ȧ���� ���� ������ �� ���ϱ�
//(2021.07.28) 
//��ó: Java200��

public class ForCondition2 {
	public static void main(String[]args) {
		List<Integer>ilist=new ArrayList<>();
		int s=0;
		for(int i=1; i<=10;i++) {
			ilist.add(i);
		}
		for(int m:ilist) {
			if(m%2==1) {
				s+=m*m;
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.println("1~10������ Ȧ���� ���� ������:"+s);
	}
}
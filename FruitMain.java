//����� ���� Ŭ���� enum ����ϱ� (2021.06.04) 
//��ó: Java200��
public class FruitMain{
	public static void main(String[] args) {
		FRUIT pear=FRUIT.APPLE;
		FRUIT pear2=FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal()); //����� �� ����0
		System.out.println(pear2.ordinal());  //����� �� ����2
		FRUIT[] fruits=FRUIT.values();
		System.out.println(fruits[0]);
	}
}
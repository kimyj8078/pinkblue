//상수의 묶음 클래스 enum 사용하기 (2021.06.04) 
//출처: Java200제
public class FruitMain{
	public static void main(String[] args) {
		FRUIT pear=FRUIT.APPLE;
		FRUIT pear2=FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal()); //선언될 때 순서0
		System.out.println(pear2.ordinal());  //선언될 때 순서2
		FRUIT[] fruits=FRUIT.values();
		System.out.println(fruits[0]);
	}
}
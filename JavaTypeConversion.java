//[복습]문자열을 실수로 변환하기
//(2021.07.31) 
//출처: Java200제

public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat="37.52127220511242  ";	 
		//위도의 값이 공백과 함께 대입된다.
		//string slat="hello";
		//공백 제거 후 double로 타입 변환
		
		double latitude=Double.parseDouble(slat.trim());
		//trim()은 양쪽 공백을 제거해서 "37.52127220511242"로 만듦
		//Double 랩퍼 클래스를 이용해서 37.52127220511242로 타입변환함.
		System.out.println(latitude);
	}
}
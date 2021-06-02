//Math클래스를 사용해서 신체 지수 구하기 (2021.06.03) 
//출처: Java200제

public class BioCalendar {
	//상수, 상수값은 변경 불가.
	public static final int PHYSICAL=23; //상수(개발자 정의)
	public static void main(String[] args) {
		int index=PHYSICAL;		//상수값을 변수에 대입
		int days=1200;
		double phyval=100*Math.sin((days % index)*2*Math.PI/index);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
	}
}
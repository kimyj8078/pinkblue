//[복습]정수 연산하기
//(2021.07.31) 
//출처: Java200제

public class Grad {
	public static void main(String[] args) {
		int kor=90;
		int eng=80;
		int math=89;	//국영수 점수를 정수타입 변수에 각각 대입함.
		int tot=kor+eng+math;	//국영수합계 (259)
		int average=tot/3;		//세과목 평균=>정수(정수 연산은 정수 86.3333->86)
		System.out.printf("국어%d점,영어%d점,수학%d점=>\t",kor,eng,math);
		System.out.printf("총점%d점,평균%d점\n",tot,average);
	}
}
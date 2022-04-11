package co.edu.variable;

public class VarExample2 {

	public static void main(String[] args) {
		// 국어 80, 영어, 70, 수학 63
		// 평균 변수 선언.
		int kor = 85;
		int eng = 75;
		int math = 60;
		int avg2 = (kor + eng + math) / 3;
		double avg = (kor + eng + math) / 3.0;
		
		System.out.println("국어, 영어, 수학 평균 : " + avg2);
		System.out.println("국어, 영어, 수학 평균 : " + avg);
	}

}

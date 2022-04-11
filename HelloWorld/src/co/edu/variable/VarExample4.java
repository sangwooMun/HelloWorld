package co.edu.variable;

public class VarExample4 {

	public static void main(String[] args) {
		// 영어 80, 수학 70, 영어 > 수학
		int eng = 80;
		int math = 70;
		
		boolean isTrue = true;
		isTrue = false;
		isTrue = eng > math;
		
		if(isTrue) {
			System.out.println("영어점수가 수학점수보다 높나요.");
			System.out.println(isTrue);
		}
	}

}

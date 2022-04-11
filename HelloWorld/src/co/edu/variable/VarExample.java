package co.edu.variable;

public class VarExample {
	public static void main(String[] args) {
		// 변수의 선언.
		int age = 20; //오른쪽의 값을 왼쪽 변수에 할당.
		double height = 173.3;
		String myName = "문상우";
		
		
		
		System.out.println("이름은" + myName);
		System.out.println("나이는" + age + "살 입니다.");
		System.out.println("키는" + height + "입니다.");
		
		int eng = 80;
		int math = 70;
		
		int result = eng + math;
		
		System.out.println("영어점수" + eng + "와 수학점수" + math + "의 합은" + result + "입니다.");
		
		
	}
}

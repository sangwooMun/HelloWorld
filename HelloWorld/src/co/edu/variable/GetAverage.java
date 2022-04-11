package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		// 입력값을 num1, num2, num3
		Scanner scanner = new Scanner(System.in);
		
		// 정수 연산 => 정수 10, 15, 15 / 3 => 40/3.0 => 13.33
		
		// 결과값 : 입력한 세 정수는 10, 15, 15 이고 평균은 13.333
		int num1, num2, num3 = 0;
		String myName = "문상우";
		int age = 26;
		num1 = scanner.nextInt();
		System.out.println("첫값 :" + num1);
		num2 = scanner.nextInt();
		System.out.println("두값 :" + num1);
		num3 = scanner.nextInt();
		System.out.println("셋값 :" + num1);
		double avg = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("이름은 %s며, 나이는 %2d살", myName, age);
		System.out.println();
		System.out.println("첫값은" + num1 + " 두값은" + num2 + " 세값은" + num3 + " 이다.");
		System.out.printf("평균 값은 : " + avg);
		
		scanner.close();
		
	}

}

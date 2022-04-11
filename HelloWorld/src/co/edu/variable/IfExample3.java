package co.edu.variable;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scanner.nextInt();
		System.out.println("첫 입력값은 " + num1 + "입니다.");
		
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scanner.nextInt();
		System.out.println("두번째 입력값은 " + num2 + "입니다.");
		
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println("차이는 " + result);
		scanner.close();
	}

}

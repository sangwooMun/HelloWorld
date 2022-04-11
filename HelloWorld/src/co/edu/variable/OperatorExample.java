package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지: %
		// 6/4 => 몫: 1, 나머지: 2
//		int result = 6 / 4;
//		int result2 = 6 % 4;
//		System.out.println(result);
//		System.out.println(result2);
		
//		int val = 5;
//		if(val % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		// 75300 원.
		// 5만원 -> ?개, 1만원 -> ?개, 5천원 -> ?개
		// 1천원 -> ?개, 5백원 -> ?개, 백원 -> ?개\
		// 75300원 5만원 1개, 1만원 2개, 오천원 1개, 1백원 3개.
		int num1 = 75300;
		int n1 = 50000;
		int n2 = 10000;
		int n3 = 5000;
		int n4 = 100;

		System.out.println("5만원 : " + num1/n1 + "장");
		System.out.println("만원 : " + num1%n1/n2 + "장");
		System.out.println("오천원 : " + num1%n1%n2/n3 + "장");
		System.out.println("백원 : " + num1%n1%n2%n3/n4 + "장");
		System.out.println();
		
		int oren = 127;
		int box1 = 10;
		int box2 = 5;
		System.out.println("10개씩 담을 수 있는 상자는 " + oren/box1 + "상자");
		System.out.println("5개씩 담을 수 있는 상자는 " + oren/box1/box2 + "상자");
		System.out.println();
		
		int max = 10000;
		int m1 = 7500;
		int m2 = 10;
		System.out.println("물건의 가격은 " + m1 + "원");
		System.out.println("물건의 부가세는 " + m1/m2 + "원");
		System.out.println("거스름돈은 " + (max - m1) + "원");
		
		

	}
}

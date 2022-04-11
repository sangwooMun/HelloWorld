package co.edu.variable;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int orenge = 127;
		int box1 = 10;
		int box2 = 5;
		
		System.out.println("10개씩 담을 수 있는 상자 : " + orenge/box1 + "상자");
		System.out.println("5개씩 담을 수 있는 상자 : " + orenge/box1/box2 + "상자");
		
		int won = 10000;
		int price = 7500;
		int surtax = 10;
		
		System.out.println("가지고 있는 돈 : " + won + "원");
		System.out.println("물건의 가격 : " + price + "원");
		System.out.println("부가세 : " + price/surtax + "원");
		System.out.println("잔돈 : " + (won - price) + "원");
		
		
		System.out.println("물건의 가격");
		int price1 = scanner.nextInt();
		System.out.println("내가 지불 할 금액");
		int won1 = scanner.nextInt();
		int surtax1 = 10;
		
		System.out.println("부가세 : " + price/surtax);
		System.out.println("거스름돈 : " + (won - price1));
		
		scanner.close();
		
		
	}

}

package co.edu.variable;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Fe = 0;
		System.out.println("화씨온도");
		Fe = scanner.nextInt();
		
		double Chan = 5/9.0 * (Fe-32);
		System.out.printf("섭씨온도는 %.1f", Chan);
		
		scanner.close();
		
	}

}

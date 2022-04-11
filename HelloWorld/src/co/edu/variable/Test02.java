package co.edu.variable;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math = 0;
		
		System.out.println("한국어 점수");
		kor = scanner.nextInt();
		System.out.println("영어 점수");
		eng = scanner.nextInt();
		System.out.println("수학 점수");
		math = scanner.nextInt();
		
		double sum = (kor + eng + math) / 3;
		System.out.printf("평균은 %.1f", sum);
		System.out.println();
		
		int max = kor;
		if(max < eng) {
			max = eng;
		}
		if(max < math) {
			max = math;
		}
		System.out.printf("최고점은 %3d", max);
		scanner.close();
	}
}

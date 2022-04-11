package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {

	public static void main(String[] args) {
//		// 표준입출력. System.in, System.out
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("세개의 단어를 입력하세요. 예) 안녕 방가 잘가");
//		while (scanner.hasNext()) {
//			String string = scanner.next();
//			System.out.println(string);
//			
//			if(string.equals("exit")) {
//				break;
//			}
//		}
			System.out.println("숫자를 입력하세요.");
			while(true) {
				int readByte;
				try {
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == -1)
					break;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		
		System.out.println("end of program");
	}

}

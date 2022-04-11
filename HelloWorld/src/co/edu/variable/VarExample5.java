package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {
		int val = 2147483647; //4 * 1byte => 4byte = 8bit; 값이 on/off
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		long val2 = 2147483648L; // 2147483648은 long 타입이기 때문에 L을 붙임.
		long val3 = 10; // 10을 long 타입으로 변환.(promotion).
		
		int val4 = (int)2147483648L; // long 을 int 타입으로 변환(casting : 강제형변환).
		
		int result = (int)100L /5;
		
		long val5 = 10000000000L;
		long val6 = 10L;
		result = (int) (val5 - val6); // casting;
		System.out.println(result);
		
		char charLit = 97; // 0 ~ 65535 까즈이 정수값중 a의 값.
		System.out.println(charLit);
		charLit = 44032;
		for(int i=0; i < 10; i++)
		System.out.println(charLit++);
//		System.out.println((int)charLit);
	}

}

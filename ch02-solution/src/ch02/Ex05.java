package ch02;

public class Ex05 {
	public static void main(String[] args) {
		// 문자열 + 문자열 = 문자열 12
		System.out.println("1" + "2");
		
		// boolean + 문자열 = 문자열 + 문자열 = 문자열 "true"
		System.out.println(true + "");
		
		// 문자 + 문자 = 정수 + 정수 = 65 + 66 = 131
		System.out.println('A' + 'B');
		
		// 문자 + 정수 = 정수 + 정수 = 49 + 2 = 51
		System.out.println('1' + 2);
		
		// 문자 + 문자 = 정수 + 정수 = 49 + 50 = 99
		System.out.println('1' + '2');
		
		// 문자 + 문자열 = "J" + "ava" = "Java"
		System.out.println('J' + "ava");
		
		// + 연산자의 메소드의 파라미터로 boolean, null을 넣을 수 있는
		// 메소드가 존재하지 않기 때문에 오류가 발생
		//System.out.println(true + null);
	}
}

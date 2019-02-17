package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		// 1. 문자 10개를 저장하는 배열
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		// 2. 입력받은 문자열 배열을 문자 배열로 변경
		char[] result = new char[alphabets.length];
		for (int i = 0; i < alphabets.length; i++) {
			// 1. alphabets String 배열에 들어있는 알파벳 문자열 하나를 끄집어 낸다.
			String tmp = alphabets[i];
			
			// 2. 1번에서 끄집어 낸 문자열을 char 형으로 변경한다.
			char tmp2 = tmp.charAt(0);
			
			// 3. 2번에서 char형으로 변경한 값을 result 배열에 집어넣는다.
			result[i] = tmp2;
		}
		
		// 3. 문자들이 담긴 result 배열에 들어있는 값을 출력하기
		System.out.println(result);	// char형 배열은 for문을 이용하지 않고 그대로 배열명을
									// println 메소드에 넣어주기만 해도 배열값들이 출력된다.
	}
}

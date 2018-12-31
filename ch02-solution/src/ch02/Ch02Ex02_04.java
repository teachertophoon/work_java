package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		// 2.3번 응용
		
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 정수 2개를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 입력받은 정수 2개를 정수(int)형으로 변경하기
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		// 4. 정수형으로 변경한 두 변수 num1과 num2를 이용하여 계산
		int result = num1 - num2;
		
		// 5. num1, num2, result를 출력
		System.out.printf("%d - %d = %d", num1, num2, result);
	}
}

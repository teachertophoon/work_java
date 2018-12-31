package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성 (System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 두 개의 정수를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 두 개의 정수를 정수(int)형으로 변경하기
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		// 4. num1과 num2를 이용하여 계산하기
		int result = num1 + num2;
		
		// 5. num1, num2, result 변수를 이용하여 출력하기
		System.out.printf("%d + %d = %d", num1, num2, result);
	}
}

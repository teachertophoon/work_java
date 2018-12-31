package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 정수 하나와 실수 하나를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 입력받은 값을 정수(int)형, 실수(double)형으로 변경하기
		int num1 = Integer.parseInt(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// 4. num1, num2 변수를 이용하여 계산하기
		double result = num1 * num2;
		
		// 5. 위 변수들을 이용하여 출력하기
		System.out.printf("%.2f * %d = %.0f", num2, num1, result);
	}
}

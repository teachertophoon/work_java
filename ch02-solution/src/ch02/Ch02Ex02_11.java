package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 실수 두 개를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 입력받은 두 실수를 실수(double)형으로 변경하기
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// 4. num1, num2 변수를 이용하여 계산하기
		double result = num1 + num2;
		
		// 5. printf()를 이용하여 출력하기
		System.out.printf("%10.2f%10.2f%10.2f", num1, num2, result);
	}
}

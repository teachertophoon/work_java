package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 하나의 정수와 하나의 실수를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 입력받은 두 문자열을 각각 정수(int)와 실수(float)로 변경하기
		int num1 = Integer.parseInt(strNum1);
		float num2 = Float.parseFloat(strNum2);
		
		// 4. num1, num2 변수를 이용하여 계산하기
		float result = num1 * num2;
		
		// 5. num1, num2, result 변수를 이용하여 출력하기
		System.out.printf("%d * %.6f = %.6f", num1, num2, result);
	}
}

package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 실수(float)형 2개와 실수(double) 한개를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		
		// 3. 실수(float)형 2개와 실수(double) 한개를 각각 float과 double형으로 변경
		float num1 = Float.parseFloat(strNum1);
		float num2 = Float.parseFloat(strNum2);
		double num3 = Double.parseDouble(strNum3);
		
		// 4. 위 변수들을 소수점 3째 자리까지 출력하기
		System.out.printf("%.3f%n", num1);
		System.out.printf("%.3f%n", num2);
		System.out.printf("%.3f", num3);
	}
}

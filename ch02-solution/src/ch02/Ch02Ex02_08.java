package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
	public static void main(String[] args) {
		// 2.2번 응용
		
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 스캐너를 이용하여 실수 2개와 한 개의 문자를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strChar = scanner.nextLine();
		
		// 3. 입력받은 실수 2개를 실수(double)형으로 변경
		// 단, 문자는 굳이 문자로 변경할 필요가 없다.
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// 4. printf() 이용하여 실수 2개와 문자 출력
		System.out.printf("%.2f%n", num1);
		System.out.printf("%.2f%n", num2);
		
		char firstChar = strChar.charAt(0);
		System.out.printf("%s", firstChar);
	}
}

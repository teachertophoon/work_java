package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 실수 2개를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		// 3. 입력받은 실수 2개를 실수(double)형으로 변경하기
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		// 4. num1과 num2 변수를 이용하여 계산하기
		double fromYard = num1 * 91.44;
		double fromInch = num2 * 2.54;
		
		// 5. 위에서 생성했던 변수들을 이용하여 출력하기
		System.out.printf("%4.1fyd = %5.1fcm%n", num1, fromYard);
		System.out.printf("%4.1fin = %5.1fcm", num2, fromInch);
	}
}

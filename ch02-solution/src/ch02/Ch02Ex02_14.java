package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성 (System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 1-1. yard값 입력하라는 안내 문구 출력하기
		System.out.print("yard? ");
		
		// 2. 실수 하나를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		
		// 3. 입력받은 실수를 실수(double)형으로 변경하기
		double num1 = Double.parseDouble(strNum1);
		
		// 4. num1 변수를 이용하여 계산하기
		double result = num1 * 91.44;
		
		// 5. 위 변수들을 이용하여 출력하기
		System.out.printf("%.1fyard = %.1fcm", num1, result);
	}
}

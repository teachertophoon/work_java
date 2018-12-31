package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 정수 세 개를 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		String strNum3 = scanner.nextLine();
		
		// 3. 입력받은 정수를 정수(int)형으로 변경하기
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3);
		
		// 4. num1, num2, num3 변수를 이용하여 합과 평균 계산하기
		int sum = num1 + num2 + num3;
		int avg = sum / 3;
		
		// 5. 위 변수들을 이용하여 출력하기
		System.out.printf("sum = %d%n", sum);
		System.out.printf("avg = %d", avg);
	}
}

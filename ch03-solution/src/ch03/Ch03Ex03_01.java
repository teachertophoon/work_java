package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		// 1. 두개의 실수를 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double num1 = Double.parseDouble(numbers[0]);
		double num2 = Double.parseDouble(numbers[1]);
		
		// 2. 두 수를 먼저 곱하고 정수로 변환(int형변환)
		int res1 = (int)(num1 * num2);
		
		// 3. 두 수를 각각 정수로 변환하여 곱을 구하기
		int res2 = (int)num1 * (int)num2;
		
		// 4. 결과 출력
		System.out.printf("%d %d%n", res1, res2);
	}
}

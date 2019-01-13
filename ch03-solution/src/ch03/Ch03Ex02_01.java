package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		// 1. 두 정수를 가로로 입력받기 (배열 필요)
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		// 2. 나눈 몫, 나머지 구하기
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		// 3. 출력하기
		System.out.printf("%d / %d = %d...%d%n", num1, num2, quotient, remainder);
	}
}

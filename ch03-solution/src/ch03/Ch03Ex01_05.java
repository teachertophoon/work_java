package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
	public static void main(String[] args) {
		// 1. 두 개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 4가지 관계연산자의 결과 출력
		System.out.printf("%d > %d --- %b%n", num1, num2, num1 > num2);
		System.out.printf("%d < %d --- %b%n", num1, num2, num1 < num2);
		System.out.printf("%d >= %d --- %b%n", num1, num2, num1 >= num2);
		System.out.printf("%d <= %d --- %b%n", num1, num2, num1 <= num2);
	}
}

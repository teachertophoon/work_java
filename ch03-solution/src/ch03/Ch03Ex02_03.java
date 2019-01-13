package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {
	public static void main(String[] args) {
		// 1. 두 정수를 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		// 2. 전치증가연산자, 후치감소연산자 사용하여 출력
		System.out.printf("%d %d%n", ++num1, num2--);
		System.out.printf("%d %d%n", num1, num2);
	}
}

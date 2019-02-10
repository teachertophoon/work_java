package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		// 1. 두 정수를 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		// 2. 큰 수에서 작은 수를 빼기
		if (num1 > num2) {
			System.out.println(num1 - num2);
		}
		else {
			System.out.println(num2 - num1);
		}
		
		// 번외: 메소드 이용해서 구하는 방법
		// Math.abs(): 절대값 리턴하는 메소드
		System.out.println(Math.abs(num1 - num2));
	}
}

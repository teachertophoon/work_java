package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		// 1. 두 개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 0이 아니면 참, 0이면 거짓
		boolean res1 = num1 != 0;
		boolean res2 = num2 != 0;
		
		// 3. 결과 출력하기
		System.out.printf("%b %b%n", res1 && res2, res1 || res2);
	}
}

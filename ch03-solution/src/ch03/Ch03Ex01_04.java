package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String[] args) {
		// 1. 정수 2개 입력받기
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 첫번째 줄은 두 정수의 값이 같으면 true, 아니면 false
		System.out.println(num1 == num2);
		
		// 3. 두번째 줄은 두 정수의 값이 다르면 true, 아니면 false
		System.out.println(num1 != num2);
	}
}

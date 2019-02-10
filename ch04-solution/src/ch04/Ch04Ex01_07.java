package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		// 1. 문자열 하나를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		char grade = scanner.nextLine().charAt(0);
		
		// 2. switch문을 이용하여 등급에 맞는 문자열 출력
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Good");
			break;
			
		case 'C':
			System.out.println("Usually");
			break;
			
		case 'D':
			System.out.println("Effort");
			break;
			
		case 'F':
			System.out.println("Failure");
			break;
			
		default:
			System.out.println("error");
		}
	}
}

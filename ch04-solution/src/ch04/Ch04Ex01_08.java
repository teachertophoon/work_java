package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {
	public static void main(String[] args) {
		// 1. 실수 하나 입력받기
		Scanner scanner = new Scanner(System.in);
		double score = Double.parseDouble(scanner.nextLine());
		
		// 2. switch문을 이용하여 각 성적에 맞는 문자열 출력
		switch ( (int)score ) {
		case 4:
			System.out.println("scholarship");
			break;
			
		case 3:
			System.out.println("next semester");
			break;
			
		case 2:
			System.out.println("seasonal semester");
			break;
			
		default:
			System.out.println("retake");
		}
	}
}

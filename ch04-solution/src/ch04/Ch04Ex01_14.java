package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		// 1. 월을 입력받기
		Scanner scanner = new Scanner(System.in);
		int month = Integer.parseInt(scanner.nextLine());
		
		// 2. 1~12 사이의 정수인지 확인
		if (1 <= month && month <= 12) {
			boolean isOdd = month % 2 != 0;	// 홀수이면 true
			boolean is9OrLess = month <= 9;	// 9월 이하이면 true
			boolean isOctDec = month == 10 || month == 12; // 10월이거나 12월이면 true
			
			if (isOdd && is9OrLess || isOctDec) {
				System.out.println(31);
			}
			else if (month == 2) {
				System.out.println(28);
			}
			else {
				System.out.println(30);
			}
		}
	}
}

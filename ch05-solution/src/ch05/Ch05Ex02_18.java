package ch05;

import java.util.Scanner;

public class Ch05Ex02_18 {
	public static void main(String[] args) {
		// 3행 5열 2차원 문자배열을 선언
		char[][] chars = new char[3][5];
		
		// 문자배열에 대문자를 입력하기
		for (int i = 0; i < chars.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			for (int j = 0; j < numbers.length; j++) {
				chars[i][j] = numbers[j].charAt(0);
			}
		}
		
		// 소문자로 바꾸어서 출력하기
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				// 대문자 + 32를 계산하면 소문자 아스키 코드값이 나오고
				// 이를 다시 char형으로 형변환하면 소문자를 출력할 수 있다.
				System.out.print((char)(chars[i][j] + 32) + " ");
			}
			System.out.println();
		}
	}
}

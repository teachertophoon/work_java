package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		// 1. 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		// 2. 첫 번째 문자 출력
		System.out.print(alphabets[0] + " ");
		
		// 3. 네 번째 문자 출력
		System.out.print(alphabets[3] + " ");
		
		// 4. 일곱 번째 문자 출력
		System.out.print(alphabets[6] + " ");
	}
}

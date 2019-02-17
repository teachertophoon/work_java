package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		// 0. 대문자의 개수를 저장할 배열 선언
		int[] counter = new int[26];

		// 4. 무한 반복
		while (true) {
			// 1. 한줄에 하나씩 입력받기
			Scanner scanner = new Scanner(System.in);
			char ch = scanner.nextLine().charAt(0);

			// 2. 1번에서 입력받은 문자를 검사하여 개수 세기
			if ('A' <= ch && ch <= 'Z') {
				counter[ch - 'A']++;
			}
			// 5. 반복문을 빠져나갈 조건문 작성
			else {
				break;
			}
		}

		// 3. 대문자 개수를 저장한 배열 출력하기
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%c : %d%n", i + 'A', counter[i]);
			}
		}
	}
}

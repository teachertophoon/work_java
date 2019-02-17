package ch05;

import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		// 1. 십의 자리 숫자의 개수를 저장하는 배열 생성
		int[] counter = new int[10];	// 십의 자리수는 0~9까지 이므로
		
		// 무한 반복
		while (true) {
			// 2. 한줄에 하나씩 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			// 4. 0이 입력되면 반복문 종료
			if (num == 0) {
				break;
			}

			// 3. 십의 자리 수 구하기
			int ten = num / 10;
			counter[ten]++;
		}
		
		// 5. 결과 출력하기
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%d : %d%n", i, counter[i]);
			}
		}
	}
}

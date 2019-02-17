package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		// 2. 100개의 정수를 저장할 배열 선언
		int[] numbers = new int[100];

		for (int i = numbers.length - 1; i >= 0; i--) {
			// 1. 한 줄에 하나씩 입력받기
			Scanner scanner = new Scanner(System.in);
			String num = scanner.nextLine();

			// 3. 입력받은 정수를 배열에 저장
			numbers[i] = Integer.parseInt(num);

			// 4. 정수 0을 입력받으면 반복을 종료
			if (Integer.parseInt(num) == 0) {
				break;
			}
		}
		
		// 5. 나중에 입력된 정수부터 차례대로 출력
		for (int i = 0; i < numbers.length; i++) {
			int tmp = numbers[i];
			if (tmp != 0) {
				System.out.print(tmp + " ");
			}
		}
	}
}

package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		
		// 3. 무한히 반복하도록 반복문 작성
		while (true) {
			// 0. 입력 문구 출력
			System.out.print("정수를 입력하세요. (0: 종료) > ");

			// 1. 정수 한개 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 2. 양수인지 음수인지 판단하기
			if (num > 0) {
				System.out.println("positive integer");
			}
			else if (num < 0) {
				System.out.println("negative integer");
			}
			
			// 4. 종료 조건 만들기
			if (num == 0) {
				break;
			}
		}
	}
}

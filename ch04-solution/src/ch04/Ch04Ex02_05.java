package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		
		// 3. 특정 조건을 만족하기 전까지 무한히 반복한다.
		while (true) {
			// 1. 정수 한개를 입력받는다.
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 2. 3의 배수일 경우에는 3으로 나눈 몫을 출력한다.
			if (num % 3 == 0) {
				System.out.println(num / 3);
			}
			
			// 4. -1이 입력되면 종료
			if (num == -1) {
				break;
			}
		}
	}
}

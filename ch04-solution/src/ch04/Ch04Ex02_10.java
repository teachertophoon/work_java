package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		// 1. 3의 배수와 5의 배수가 아닌 수의 개수를 저장하는 변수 선언 및 초기화
		int count = 0;
		
		// 4. 무한히 반복
		while (true) {
			// 2. 정수 1개 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 3. 입력받은 수가 3의 배수인지 5의 배수인지 확인 후 아니면 count 1 증가
			if (!(num % 3 == 0 || num % 5 == 0)) {
				count++;
			}
			
			// 5. 특정 조건일 경우 while문 종료
			if (num == 0) {
				break;
			}
		}
		
		System.out.println(count);
	}
}

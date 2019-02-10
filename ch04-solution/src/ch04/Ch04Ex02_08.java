package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		
		// 2. 홀수 개수를 저장하는 변수와 짝수 개수를 저장하는 변수 선언 및 초기화
		// 6. while문 안에 선언된 변수들은 while문 바깥에서 사용할 수 없으므로
		// 아래와 같이 while문 바깥으로 빼내었다.
		int odd = 0;
		int even = 0;
		
		// 5. 특정 조건을 만족하기 전까지 무한히 반복
		while (true) {
			// 1. 정수 한개 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 3. 홀수이면 odd 변수 1 증가, 짝수이면 even 변수 1 증가
			// 홀수이면
			if (num % 2 != 0) {
				odd++;
			}
			// 짝수이면
			else {
				if (num != 0) {
					even++;
				}
			}
			
			// 7. 특정조건 (0 입력)이 되었을 때 while문 종료
			if (num == 0) {
				break;
			}
		}
		
		// 4. 홀수와 짝수의 개수 출력
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}

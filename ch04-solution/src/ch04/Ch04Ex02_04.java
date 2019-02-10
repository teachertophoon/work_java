package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		// 3. 반복문에서 계속적으로 변수를 사용하기 위해 반복문 바깥쪽에 변수를 선언
		int sum = 0;	// 총합을 저장하는 변수
		int count = 0;	// 현재 합한 수의 개수
		
		// 2. 특정 조건을 만족하기 전까지 무한히 반복하기
		while (true) {
			// 1. 정수 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			// 4. 입력받은 숫자 더하기
			sum += num;
			
			// 5. 카운트 증가
			count++;
			
			// 6. 100 이상의 수가 입력되면 반복을 종료
			if (num >= 100) {
				break;
			}
		}
		
		// 7. 결과 출력
		System.out.printf("%d%n%.1f", sum, sum / (double)count);
	}
}

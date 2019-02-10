package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		// 1. 자연수 1개 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 입력조건을 검사
		if (num > 6) {
			System.out.println("INPUT ERROR!");
			return;	// 특정 값을 리턴할 경우 사용하는 키워드
			// 지금은 리턴 타입이 void 이므로 특정 값이 없는경우
			// main 메소드를 리턴하면 프로그램 종료와 같다.
		}
		
		// 3. 별을 역삼각형으로 찍기
		char alphabet = 'A';
		int count = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				int limit = num - i;
				if (j < limit) {
					System.out.print(alphabet + " ");
					alphabet++;
				}
				else {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}
}

package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		// 1. 자연수 하나 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 3. 숫자를 출력할 변수 선언 및 초기화
		int count = 1;
		
		// 2. 틀 작성
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j >= i) {
					System.out.print((count % 10) + " ");
					count++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

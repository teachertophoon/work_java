package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		// 1. 자연수 하나 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 틀 작성 (2n-1행, n열)
		for (int i = 0; i < num * 2 - 1; i++) {
			if (i < num) {
				for (int j = 0; j <= i; j++) {
					System.out.print("#");
				}
			}
			else {
				for (int j = 0; j < num; j++) {
					int limit = i % num + 1;
					if (j < limit) {
						System.out.print(" ");
					}
					else {
						System.out.print("#");
					}
				}
			}
			System.out.println();
		}
	}
}

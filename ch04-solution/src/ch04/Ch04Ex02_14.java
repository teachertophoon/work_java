package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		// 1. 두개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num01 = Integer.parseInt(numbers[0]);
		int num02 = Integer.parseInt(numbers[1]);
		
		// 2. 단순하게 코드를 두 부분으로 나누기
		// 2.1. 첫번째 수가 작고 두번째 수가 클 경우
		if (num01 < num02) {
			// 3. 틀 작성
			for (int i = 1; i <= 9; i++) {
				for (int j = num01; j <= num02; j++) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
		// 2.2. 첫번째 수가 크고 두번째 수가 작은 경우
		else if (num01 > num02) {
			// 3. 틀 작성
			for (int i = 1; i <= 9; i++) {
				for (int j = num01; j >= num02; j--) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}

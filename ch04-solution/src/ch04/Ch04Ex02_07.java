package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {

		// 1. 정수를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 입력받은 정수까지 1씩 증가하여 출력한다.
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		
	}
}










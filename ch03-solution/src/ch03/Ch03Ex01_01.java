package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. 정수 2개 입력 받기
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 첫 번째 수에는 100을 증가, 두 번째 수는 10으로 나눈 나머지 저장
		int res1 = num1 + 100;
		int res2 = num2 % 10;
		
		// 3. 결과 출력
		System.out.printf("%d %d%n", res1, res2);
	}
}

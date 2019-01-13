package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		// 1. 두 개의 정수 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		// 2. 첫 번째 수를 두 번째 수로 나눈 몫을 출력
		int res1 = num1 / num2;
		
		// 3. 첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값 구하기
		double res2 = (double)num1 / num2;
		
		// 4. 결과 출력
		System.out.printf("%d %.2f", res1, res2);
	}
}

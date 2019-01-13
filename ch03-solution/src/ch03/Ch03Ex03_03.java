package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
		// 1. 정수 3개 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int num3 = Integer.parseInt(numbers[2]);
		
		// 2. 3과목 정수를 입력받아 평균을 구하기
		double avg = (num1 + num2 + num3) / 3.0;
		
		// 3. 결과 출력
		System.out.printf("%.1f", avg);
	}
}

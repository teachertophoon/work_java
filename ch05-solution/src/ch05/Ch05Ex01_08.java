package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		// 1. 10개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 1-1. 짝수 번째 입력된 값의 합을 저장하는 변수 선언 및 초기화
		int sum = 0;
		
		// 1-2. 홀수 번째 입력된 값의 평균을 저장하는 변수 선언 및 초기화
		int avg = 0;
		int count = 0;	// 홀수 번째 입력된 값의 개수
		
		// 2. 배열 전체를 탐색한다.
		for (int i = 0; i < numbers.length; i++) {
			// 홀수 번째 입력된 값일 경우
			if (i % 2 == 0) {
				avg += Integer.parseInt(numbers[i]);
				count++;
			}
			// 짝수 번째 입력된 값일 경우
			else {
				sum += Integer.parseInt(numbers[i]);
			}
		}
		
		// 3. 결과 출력하기
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f%n", avg / (double)count);
	}
}

package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 홀수번째 합과 짝수번째 합을 저장할 변수 선언 및 초기화
		int odd = 0;
		int even = 0;
		
		// numbers 배열에서 값을 하나씩 꺼낸다.
		for (int i = 0; i < numbers.length; i++) {
			// 만약 홀수번째 값이면
			if (i % 2 == 0) {
				// 홀수번째 합을 저장하는 변수에 더하기
				odd += Integer.parseInt(numbers[i]);
			}
			// 만약 짝수번째 값이면
			else {
				// 짝수번째 합을 저장하는 변수에 더하기
				even += Integer.parseInt(numbers[i]);
			}
		}
		
		// 홀수번째와 짝수번째 각각의 합을 출력하기
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}

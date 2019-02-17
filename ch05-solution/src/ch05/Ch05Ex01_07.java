package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		// 1. 10개의 정수를 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		// 1-1. 전체 배열을 검사해서 1 이상 10,000 미만의 정수가 발견되면 프로그램 종료
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);

			// 만약 1000 이상의 정수가 발견되면
			if (!(1 <= num && num < 10000)) {
				// main 메소드를 return 시켜 프로그램 종료
				return;
			}
		}

		// 2. 100 미만의 수 중 가장 큰 수를 저장하는 변수 max 선언
		int max = 100;

		// 3. 100 이상의 수 중 가장 작은 수를 저장하는 변수 min 선언
		int min = 100;

		// 4. numbers 배열의 수를 하나씩 꺼내면서 비교하기
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);

			if (num < 100) {
				if (max == 100) {
					max = num;
				}
				else {
					max = max > num ? max : num;
				}
			}
			else {
				if (min == 100) {
					min = num;
				}
				else {
					min = min < num ? min : num;
				}
			}
		}

		// 5. 출력하기
		System.out.println(max + " " + min);

	}
}

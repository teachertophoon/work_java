package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		// 1. 두개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);

		// 5. 무한히 반복
		while (true) {
			System.out.print("Base = ");
			int base = Integer.parseInt(scanner.nextLine());

			System.out.print("Height = ");
			int height = Integer.parseInt(scanner.nextLine());

			// 2. 입력받은 정수를 이용하여 삼각형 넓이 출력
			System.out.printf("Triangle area = %.1f%n", base * height / 2.0);

			// 3. 계속 반복할 것인지를 물어보기
			System.out.print("Continue? ");

			// 4. 문자열 입력받기
			String answer = scanner.nextLine();
			
			// 6. 특정조건("Y" 혹은 "y"가 아닐경우)일 경우 반복문 종료
			// equalsIgnoreCase(): 괄호 안의 문자열의 대소문자 구별없이
			// 변수와 값이 같다면 true, 아니면 false 리턴
			if (!answer.equalsIgnoreCase("Y")) {
				break;
			}
		}
	}
}

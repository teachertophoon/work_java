package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		// 2.4 문제 참고
		int[] numbers = new int[2];
		
		int i = 0;
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if (i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			
			numbers[i] = num;
			if (numbers[i] == 0) {
				break;
			}
			
			i++;
		}
		// 2.4 문제 참고 끝
		
		// 현재 i 값은 배열에 입력된 정수의 개수와 같으므로 i 값을 출력
		System.out.println(i);
		
		// numbers 배열에 입력된 값을 하나씩 끄집어낸다.
		for (int j = 0; j < numbers.length; j++) {
			// 끄집어 낸 값이 0일 경우는 반복문을 종료
			if (numbers[j] == 0) {
				break;
			}
			
			// 홀수일 경우는 곱하기 2, 짝수일 경우는 나누기 2한 몫을 출력
			System.out.print((numbers[j] % 2 != 0 ? numbers[j] * 2 : numbers[j] / 2) + " ");
		}
	}
}




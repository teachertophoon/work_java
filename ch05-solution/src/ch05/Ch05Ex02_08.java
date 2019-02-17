package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		
		// 2.4번 예제 참고
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
		// 2.4번 예제 참고 끝
		
		// 5의 배수 개수를 저장하는 변수
		int multiplesOfFive = 0;
		
		// 5의 배수 합계를 저장하는 변수
		int sum = 0;
		
		// numbers 배열을 처음부터 탐색한다.
		for (int j = 0; j < numbers.length; j++) {
			// 만약 0을 만나게 되면 반복문 종료
			if (numbers[j] == 0) {
				break;
			}
			
			// 만약 5의 배수라면
			if (numbers[j] % 5 == 0) {
				// 5의 배수 개수를 저장하는 변수 1증가
				multiplesOfFive++;
				
				// 총합을 저장하는 변수에 값 저장
				sum += numbers[j];
			}
		}
		
		// 결과 출력
		System.out.println("Multiples of 5 : " + multiplesOfFive);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f%n", sum / (double)multiplesOfFive);
	}
}





package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
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
		
		// 점수대별 학생 수를 저장하는 배열
		// 9번 인덱스 : 100점대 학생
		// 8번 인덱스 : 90점대 학생
		// 0번 인덱스 : 10점대 학생
		int[] counter = new int[10];
		
		// 현재 i변수의 값은 입력받은 점수(0포함)의 개수와 같다.
		// 0번부터 입력받은 점수 개수까지 반복
		for (int j = 0; j < i; j++) {
			// 실제 점수에 나누기 10을 한 몫에 -1을 하면 인덱스 번호와 일치한다.
			int index = numbers[j] / 10 - 1;
			
			// 해당 인덱스에 값을 1 증가시킨다.
			counter[index]++;
		}
		
		// 출력 예에서는 100점대부터 출력하므로
		// 배열의 뒤에서부터 차례대로 출력하면 된다.
		for (int j = counter.length - 1; j >= 0; j--) {
			if (counter[j] != 0) {
				System.out.printf("%d : %d person%n", (j + 1) * 10, counter[j]);
			}
		}
	}
}






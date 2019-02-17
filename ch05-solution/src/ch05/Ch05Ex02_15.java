package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		// 제기차기 한 개수를 저장하는 배열 score
		// 행은 반을 뜻하고, 열은 사람 수를 뜻한다.
		int[][] score = new int[4][3];
		
		// 각 반에서 제기 찬 횟수를 score 배열에 저장한다.
		for (int i = 0; i < score.length; i++) {
			// 1. 입력 예와 같이 문구 출력
			System.out.printf("%dclass? ", i + 1);
			
			// 2. 띄어쓰기로 구분하여 세 명의 제기 찬 횟수를 입력받는다.
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			// 3. score 배열의 열 인덱스 번호는 numbers 배열의 인덱스 번호와 일치한다.
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = Integer.parseInt(numbers[j]);
			}
		}
		
		// score 배열에 저장된 제기 찬 횟수를 이용하여 각 반별 총합을 출력한다.
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.printf("%dclass : %d%n", i + 1, sum);
		}
	}
}

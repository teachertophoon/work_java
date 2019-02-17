package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		// 사람의 수를 입력받기
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		
		// 입력받은 사람의 수가 20 초과일 경우는 프로그램 종료
		if (count > 20) {
			return;
		}
		
		// 입력받은 사람의 수를 이용하여 점수를 저장할 배열 생성
		int[] score = new int[count];
		
		// 점수들을 입력받기
		String[] tmp = scanner.nextLine().split(" ");
		
		// tmp 배열은 타입이 String이므로 int형으로 변경하여 score 배열에 저장한다.
		for (int i = 0; i < tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i]);
		}
		
		// ArrayEx10 예제 참고 (버블정렬 - Bubble Sort)
		for (int i = 0; i < score.length - 1; i++) {
			boolean changed = false;
			
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					changed = true;
				}
			}
			
			if (!changed) break;
		}
		
		// 버블정렬이 끝나면 오름차순으로 정렬되기 때문에 배열을 뒤에서부터 출력하면
		// 내림차순(점수가 높은 순서)으로 출력된다.
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}
	}
}

package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		// 주사위를 던져 나온 수들을 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 주사위를 던져 나온 수들의 개수를 저장하는 배열
		// 인덱스 0번부터 1~6의 개수를 저장
		int[] counter = new int[6];
		
		// 입력받은 주사위 수들을 하나씩 꺼낸다.
		for (int i = 0; i < numbers.length; i++) {
			// 꺼낸 문자열을 정수로 변환
			int num = Integer.parseInt(numbers[i]);
			
			// 주사위 눈의 수 - 1 한 것은 인덱스 번호와 일치
			// 해당 counter 배열 인덱스에 1 증가
			counter[num - 1]++;
		}
		
		// counter 배열 내용 출력하기
		for (int i = 0; i < counter.length; i++) {
			// 인덱스 번호 + 1은 주사위 눈과 동일
			System.out.println(i + 1 + " : " + counter[i]);
		}
	}
}

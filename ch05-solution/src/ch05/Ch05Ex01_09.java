package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		// 1. 10개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 2. 편의상 numbers에 저장된 문자열들을 정수형으로 바꾼 값을 저장할 배열 생성
		int[] sort = new int[numbers.length];
		
		// 3. numbers 배열에 저장된 문자열들을 정수형으로 변환 후 sort 배열에 집어넣기
		for (int i = 0; i < numbers.length; i++) {
			sort[i] = Integer.parseInt(numbers[i]);
		}
		
		// 4. sort 배열을 이용하여 버블정렬 (책대로 오름차순 정렬하기)
		for (int i = 0; i < sort.length - 1; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지를 체크한다.
			
			for (int j = 0; j < sort.length - 1 - i; j++) {
				if (sort[j] > sort[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					changed = true;	// 자리바꿈이 발생했으니 changed를 true로.
				}
			}
			
			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.
		}
		
		// 5. 오름차순 정렬된 배열을 거꾸로 출력하기 (내림차순 출력)
		for (int i = sort.length - 1; i >= 0; i--) {
			System.out.print(sort[i] + " ");
		}
		
	}
}

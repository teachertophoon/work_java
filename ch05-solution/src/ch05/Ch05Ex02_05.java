package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 총합을 저장할 변수 선언 및 초기화
		double sum = 0;
		
		// 입력받은 값들을 하나씩 꺼낸다.
		for (int i = 0; i < numbers.length; i++) {
			// 배열에 담긴 값 하나를 꺼내어 double 형으로 변경한다.
			// 그 후 sum 변수에 더한다.
			sum += Double.parseDouble(numbers[i]);
		}
		
		// 총합은 sum 변수 값이고, 입력한 값의 개수는 배열의 크기로 알 수 있으므로
		// 총합에서 배열의 크기를 나누면 평균을 구할 수 있다.
		System.out.printf("%.1f%n", sum / numbers.length);
	}
}

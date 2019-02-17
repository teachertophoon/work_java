package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		// 1. 반별 평균 점수를 저장하는 배열
		double[] avgs = {85.6, 79.5, 83.1, 80.0, 87.2, 75.0};
		
		// 2. 두 반의 반 번호를 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] classes = scanner.nextLine().split(" ");
		
		// 3. 입력받은 번호를 이용하여 각 반의 평균값 배열에서 끄집어내기
		double num01 = avgs[Integer.parseInt(classes[0]) - 1];
		double num02 = avgs[Integer.parseInt(classes[1]) - 1];
		
		// 4. 두 반의 평균점수의 합
		double sum = num01 + num02;
		
		// 5. 소수 첫째자리까지 출력하기
		System.out.printf("%.1f", sum);
	}
}

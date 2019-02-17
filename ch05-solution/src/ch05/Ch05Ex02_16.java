package ch05;

import java.util.Scanner;

public class Ch05Ex02_16 {
	public static void main(String[] args) {
		// 2행 3열 배열 두개 선언
		int[][] a1 = new int[2][3];
		int[][] a2 = new int[2][3];
		
		// 첫번째 배열 a1에 값을 입력받기
		System.out.println("first array");
		
		for (int j = 0; j < a1.length; j++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			for (int i = 0; i < numbers.length; i++) {
				a1[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 두번째 배열 a2에 값을 입력받기
		System.out.println("second array");
		
		for (int j = 0; j < a2.length; j++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");
			
			for (int i = 0; i < numbers.length; i++) {
				a2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 새로운 배열을 선언하고 새로운 배열에 곱한 결과를 저장한다.
		int[][] result = new int[2][3];
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				result[i][j] = a1[i][j] * a2[i][j];
			}
		}
		
		// 새로운 배열 result의 내용을 출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}





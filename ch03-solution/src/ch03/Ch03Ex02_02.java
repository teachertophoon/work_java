package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		// 1. 두 정수 가로로 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int width = Integer.parseInt(numbers[0]);
		int length = Integer.parseInt(numbers[1]);
		
		// 2. 가로의 길이는 5증가, 세로의 길이는 2배하여 저장
		width += 5;
		length *= 2;
		
		// 3. 넓이 구하기
		int area = width * length;
		
		// 4. 출력하기
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
	}
}

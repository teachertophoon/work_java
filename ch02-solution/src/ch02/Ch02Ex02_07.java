package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 1-1. 무엇을 입력받을지 안내하는 문구 출력하기
		System.out.print("height = ");
		
		// 2. 정수 하나 문자열로 입력받기
		String strNum1 = scanner.nextLine();
		
		// 3. 입력받은 정수를 정수(int)형으로 변경하기
		int height = Integer.parseInt(strNum1);
		
		// 4. height 변수를 이용하여 출력하기
		System.out.printf("Your height is %dcm.", height);
	}
}

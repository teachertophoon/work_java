package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성(System.in은 키보드)
		Scanner scanner = new Scanner(System.in);
		
		// 2. 스캐너를 이용하여 정수 하나 문자열로 입력받기
		String strNum = scanner.nextLine();
		
		// 3. 문자열로 입력받은 값을 정수(int)형으로 변경
		int num = Integer.parseInt(strNum);
		
		// 4. 변수 num 출력
		System.out.printf("%d", num);
	}
}

package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		
		// 3. 특정 조건을 만족하기 전까지 무한히 반복
		while (true) {
			// 1. 나라 목록을 출력한다.
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");

			// 2. 나라에 대한 번호를 입력받는다.
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			// 4. 특정 조건을 만족할 경우 참, 거짓을 저장하는 flag 변수
			boolean flag = false;
			
			// 3. 입력받은 번호를 이용하여 해당 나라의 수도를 출력
			switch (num) {
			case 1:
				System.out.println("Seoul");
				break;

			case 2:
				System.out.println("Washington");
				break;

			case 3:
				System.out.println("Tokyo");
				break;

			case 4:
				System.out.println("Beijing");
				break;

			default:
				System.out.println("none");
				flag = true;
			}
			
			// 5. 특정조건(flag값이 true일때)에 while문 반복 끝내기
			if (flag == true) {
				break;
			}
		}
	}
}










package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		// 문제에서 주어진 배열 선언 및 초기화
		char[] alphabets = {'A', 'P', 'P', 'L', 'E', '!'};
		
		// 문자 하나를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		
		// 입력받은 문자와 일치하는 문자가 alphabets 배열에 속해 있다면
		// isFind 값은 true, 아니면 false
		boolean isFind = false;
		
		// alphabets 배열을 처음부터 차례로 탐색한다.
		for (int i = 0; i < alphabets.length; i++) {
			// 만약 입력한 문자와 배열에 있는 문자가 일치할 경우
			if (ch == alphabets[i]) {
				// 일치하는 문자가 있다는 표시로 isFind 값을 true로 변경
				isFind = true;
				
				// 이때의 인덱스 번호를 출력
				System.out.print(i + " ");
				
				// 반복문을 빠져나온다.
				//break;
			}
		}
		
		// 만약 일치하는 문자가 없는 경우는 "none"을 출력
		if (isFind == false) {
			System.out.println("none");
		}
	}
}

package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		// 1. 문자열과 정수 각각 하나씩 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split(" ");
		String gender = inputs[0];
		int age = Integer.parseInt(inputs[1]);
		
		// [방법 1]
		// 2. 성인남자일 경우
		/*if (gender.equals("M") && age >= 18) {
			System.out.println("MAN");
		}
		
		// 3. 성인여자일 경우
		if (gender.equals("F") && age >= 18) {
			System.out.println("WOMAN");
		}
		
		// 4. 미성년남자일 경우
		if (gender.equals("M") && age < 18) {
			System.out.println("BOY");
		}
		
		// 5. 미성년여자일 경우
		if (gender.equals("F") && age < 18) {
			System.out.println("GIRL");
		}*/
		
		// [방법 2]: 크게 성별로 나누고, 각자 성년인지 미성년인지 구분
		if (gender.equals("M")) {
			if (age >= 18) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
		}
		else if (gender.equals("F")) {
			if (age >= 18) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}
		}
	}
}



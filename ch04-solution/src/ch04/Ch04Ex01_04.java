package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		// 1. 몸무게를 실수로 입력받기
		Scanner scanner = new Scanner(System.in);
		double weight = Double.parseDouble(scanner.nextLine());
		
		// 2. 체급별 메시지 출력하기
		if (weight <= 50.80) {
			System.out.println("Flyweight");
		}
		else if (weight <= 61.23) {
			System.out.println("Lightweight");
		}
		else if (weight <= 72.57) {
			System.out.println("Middleweight");
		}
		else if (weight <= 88.45) {
			System.out.println("Cruiserweight");
		}
		else if (weight > 88.45) {
			System.out.println("Heavyweight");
		}
	}
}

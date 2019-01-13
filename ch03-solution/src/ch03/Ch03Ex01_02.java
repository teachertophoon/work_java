package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		// 1. 1개의 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 후치증가 연산자와 전치 증가 연산자를 사용하여 출력
		System.out.println(num++);
		++num;
		System.out.println(num);
	}
}

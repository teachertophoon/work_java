package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		// 1. 한 줄에 두 정수를 입력받아 총 두 줄 입력받기(정수 4개)
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers01 = scanner.nextLine().split(" ");
		int minsooHeight = Integer.parseInt(numbers01[0]);
		int minsooWeight = Integer.parseInt(numbers01[1]);
		
		String[] numbers02 = scanner.nextLine().split(" ");
		int kiyeongHeight = Integer.parseInt(numbers02[0]);
		int kiyeongWeight = Integer.parseInt(numbers02[1]);
		
		// 2. 조건연산자(삼항연산자) 두번 이용해서 비교하기
		boolean isGreatestMinsoo = minsooHeight > kiyeongHeight 
				? (minsooWeight > kiyeongWeight ? true : false) : false;
		
		// 3. 출력하기
		System.out.println(isGreatestMinsoo);
	}
}

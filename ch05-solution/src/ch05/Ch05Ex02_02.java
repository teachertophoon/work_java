package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		// 문자열 배열인 numbers를 int형으로 변환하여 저장할 배열 nums 선언
		int[] nums = new int[numbers.length];
		
		// numbers 배열에 있는 문자열을 하나씩 끄집어내어 int형으로 변경 후 nums 배열에 저장
		for (int i = 0; i < numbers.length; i++) {
			nums[i] = Integer.parseInt(numbers[i]);
		}
		
		// nums의 첫번째, 세번째, 다섯번째 값을 끄집어내어 합한 결과를 출력
		System.out.println(nums[0] + nums[2] + nums[4]);
	}
}

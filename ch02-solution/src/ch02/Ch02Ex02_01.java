package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		// 1. 입력받기 위해 스캐너 객체 생성, System.in은 키보드
		Scanner scanner = new Scanner(System.in);
		
		// 2. scanner를 이용하여 성적 문자열로 입력받기 (세번 입력)
		String strKor = scanner.nextLine();
		String strMat = scanner.nextLine();
		String strEng = scanner.nextLine();
		
		// 3. 문자열로 입력받은 성적을 정수(int)형으로 변경
		int kor = Integer.parseInt(strKor);
		int mat = Integer.parseInt(strMat);
		int eng = Integer.parseInt(strEng);
		
		// 4. 합계와 평균을 구하기
		int sum = kor + mat + eng;
		int avg = sum / 3;
		
		// 5. printf()를 이용하여 출력
		System.out.printf("kor %d%n", kor);
		System.out.printf("mat %d%n", mat);
		System.out.printf("eng %d%n", eng);
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d%n", avg);
	}
}

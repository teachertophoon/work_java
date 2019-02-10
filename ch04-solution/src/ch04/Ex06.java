package ch04;

public class Ex06 {
	public static void main(String[] args) {
		// 주사위A
		for (int i = 1; i <= 6; i++) {
			// 주사위B
			for (int j = 1; j <= 6; j++) {
				// 두 눈의 합이 6이면 출력
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}
	}
}

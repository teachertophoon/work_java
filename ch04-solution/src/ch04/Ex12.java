package ch04;

public class Ex12 {
	public static void main(String[] args) {
		// [방법 1]
		// i는 행, j는 열
		/*for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 3; j++) {
				int x = (j + 1) + ((i - 1) / 3) * 3;
				int y = i % 3 == 0 ? 3 : i % 3;
				
				if (x < 10) {
					System.out.printf("%d*%d=%d\t", x, y, x * y);
				}
			}
			System.out.println();
			if (i % 3 == 0) {
				System.out.println();
			}
		}*/
		
		// [방법 2]
		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
	}
}







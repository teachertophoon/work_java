package ch03;

public class Ex06 {
	public static void main(String[] args) {
		int num = 24;
		System.out.println(10 - num % 10);
		
		/*
		 * num의 십의자리 수를 뽑아 1을 더한 후 10을 곱하면
		 * 변수 num의 값보다 크면서도 가장 가까운 10의 배수를 구할 수 있다.
		 * (num / 10 + 1) * 10 - num
		 * 
		 * 간단하게 생각하면 10에서 일의자리 수를 뽑아 빼면
		 * 같은 결과를 구할 수 있다.
		 */
	}
}

package ch02;

public class Ex08 {
	public static void main(String[] args) {
		// 64비트 컴퓨터 - 64비트 JDK 설치
		int a = 2147483647;	// int값의 최대값 (int는 4byte이기 때문에)
		
		// 64비트 컴퓨터에서 정수가 8byte라면 int의 최대값 이상을 사용할 수 있겠죠?
		System.out.println(++a);
		
		// 하지만 최소값인 -2147483648로 나온다.
		// 따라서, 자바에서는 정수 int는 4byte로 고정
		
		// 정답은 a, d
	}
}

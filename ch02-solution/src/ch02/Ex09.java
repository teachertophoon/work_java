package ch02;

public class Ex09 {
	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		// a.
		b = (byte)i;	// 큰 타입(int)에서 작은 타입(byte)로 변경하는 것이기 때문에
						// 명시적으로 타입을 변경해야 한다.
		
		// b.
		ch = (char)b;	// 83쪽 그림 2-21을 보면 byte에서 char로 향하는 화살표가 없다.
						// 명시적 형변환 필요
		
		// c.
		short s = (short)ch;	// 명시적 형 변환 필요
		
		// d.
		float f = /*(float)*/l;		// 자동형변환 가능, 형변환 생략가능
		
		// e.
		i = /*(int)*/ch;	// 자동형변환 가능, 형변환 생략가능
		
		// 정답은 d, e
		
		// 2-10 정답은 0~65535
	}
}

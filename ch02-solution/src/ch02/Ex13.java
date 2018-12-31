package ch02;

class Test {
	// 멤버 변수(인스턴스 변수)
	boolean a;
	char b;
	float c;
	int d;
	long e;
	String f;
}

public class Ex13 {
	public static void main(String[] args) {
		// 클래스를 이용하여 객체를 생성
		Test t = new Test();
		
		// 기본형과 참조형의 기본값 출력해보기
		System.out.println(t.a);	// false
		System.out.println(t.b);	// null 문자
		System.out.println(t.c);	// 0.0
		System.out.println(t.d);	// 0
		System.out.println(t.e);	// 0
		System.out.println(t.f);	// null
	}
}

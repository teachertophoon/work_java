package ch03;

public class Ex08 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.printf("f2=%.20f%n", f2);
		System.out.printf("d=%.20f%n", d);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}

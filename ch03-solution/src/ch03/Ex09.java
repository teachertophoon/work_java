package ch03;

public class Ex09 {
	public static void main(String[] args) {
		char ch = '5';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') 
				|| ('0' <= ch && ch <= '9');
		System.out.println(b);
	}
}

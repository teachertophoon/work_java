package ch04;

public class Ex01 {
	public static void main(String[] args) {
		// 문제 풀이를 위해 임의의 변수 생성
		int x = 15;
		char ch = 'A';
		int year = 2000;
		boolean powerOn = false;
		String str = "yes";
		
		// 1.
		boolean one = 10 < x && x < 20;
		
		// 2.
		boolean twoOne = !(ch == ' ' || ch == '\t');
		boolean twoTwo = ch != ' ' && ch != '\t';
		
		// 3.
		boolean three = ch == 'x' || ch == 'X';
		
		// 4.
		boolean four = '0' <= ch && ch <= '9';
		
		// 5. 
		boolean five = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
		
		// 6. 윤년 계산식
		boolean six = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		
		// 7. 
		boolean sevenOne = !powerOn;
		boolean sevenTwo = powerOn == false;
		
		// 8.
		boolean eightOne = str.equals("yes");
		boolean eightTwo = "yes".equals(str);
	}
}

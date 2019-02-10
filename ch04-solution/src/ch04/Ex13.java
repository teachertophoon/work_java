package ch04;

public class Ex13 {
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i = 0; i < value.length(); i++) {
			// value 문자열에 있는 문자 하나씩 끄집어 내기
			ch = value.charAt(i);
			
			// 끄집어 낸 문자가 '0'과 '9' 사이에 포함이 안되는 경우
			if (!('0' <= ch && ch <= '9')) {
				// 숫자가 아님을 표시하기 위한 변수 isNumber를 false로 설정
				isNumber = false;
				
				// 더이상 반복문을 실행할 필요가 없으므로 빠져나온다.
				break;
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
}

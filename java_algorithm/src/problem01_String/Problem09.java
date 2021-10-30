package problem01_String;

import java.util.Scanner;

public class Problem09 {
	public int solution(String s) {//아스키 넘버
		int answer = 0;
		for(char x : s.toCharArray()) { //s를 문자배열로 만들어줘야 forEach 가능
			if(x>=48 && x<=57) answer = answer*10+(x-48); //(x-48)해야 실제 숫자가 됨('0' = 48 != 0)
		}
		
		return answer;
		
	}
	
	//String으로 할 때
	/*
	 * 	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x; 
			//Character클래스의 Digit: x가 숫자(digit)? -> true면 숫자, answer에 x를 누적시킨다
			//answer는 String이라 String으로 누적됨
		}
		//int로 return해야 한다.. String으로 하면 0208이 나옴
		 
		return Integer.parseInt(answer); //String일 때 0208 -> int로 208이 됨
		
	}
	 * 
	 * */
	
	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 09. 숫자만 추출 
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다
 * 
 * [0,1,2,0,5]일 때
 * 
 * answer = 0; //초기화
 * x>=48 && x<=57 //문자'0' && 문자'9'의 아스키 번호 -> '숫자라면'
 * {answer = answer*10+(x-48)} //숫자라면 이 식을 실행한다
 * 0 = 0x10 + 0 //0 발견
 * 1 = 0x10 + 1 //1 발견
 * 12 = 1x10 + 2 //2 발견 ...
 * 120 = 12x10 + 0
 * 1205 = 120x10 + 5
 * 
 * */
 
package problem01_String;

import java.util.Scanner;

public class Problem07_2 {
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString(); //tmp 뒤집어짐
		//str: 원래 입력된 거, tmp: 뒤집어진 거
		if(str.equalsIgnoreCase(tmp)) answer = "YES"; // equals는 대소문자 구분을 한다 -> equalsIgnoreCase
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem07_2 T = new Problem07_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

package problem01_String;

import java.util.Scanner;

public class Problem08 {
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]",""); //A-Z가 아니면 빈문자화 시켜라
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES"; //원래 문자열(s) = 뒤집어진 문자열(tmp)
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}

/*
 * 08. 유효한 팰린드롬(replaceAll 정규식 이용)
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 함
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들의 무시합니다.
 * 
 * 
 * 
 * */

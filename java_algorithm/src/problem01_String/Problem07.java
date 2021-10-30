package problem01_String;

import java.util.Scanner;

public class Problem07 {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase(); //대소문자 구분X
		int len = str.length();
		for(int i = 0; i<len/2; i++) {
			//비교
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO"; //다르다면 NO
		}
		//회문 맞으면 YES return
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 07. 회문 문자열 - 직접 비교
 * 
 * ~짝수일 때~
 *      0  1  2  3
 *      G  O  O  G
 * i=0			3=len-i-1
 * i=1			2=len-i-1
 * 
 *-> 4/2만 돌면 된다 (길이/2의 몫의 전까지): i<len/2 (같다고 하면 안된다)
 * 0-3 같은가? -> 같으면 통과 -> 1-2 같은가? ... 비교
 * 다르면 불통과, 바로 No (회문 아니다)
 * 
 * ~홀수일 때~
 * 0 1 2 3 4
 * s t u t s
 * u는 비교 안해도 된다, 짝수와 마찬가지로 i<len/2 까지만 돌면 된다
 * 
 * */

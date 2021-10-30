package problem01_String;

import java.util.Scanner;

public class Problem02 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			//x가 소문자냐?
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		
		return answer;
		
	}
	
	/*
	 x가 소문자냐? 맞으면 answer에다 x를 대문자화 시켜서 저장(누적)함
	 x가 대문자라면 x를 소문자화해서 answer에다 누적시킨다(String이라 누적)
	 */
	
	/*
	 아스키 코드로도 풀 수 있다. 대문자: 65~90 / 소문자: 97~122
	 대문자 = (소문자 - 32)
	 
	 for(char x : str.toCharArray()) {
		if(x>=97 && x<=122) answer+=(char)(x-32); //x가 소문자? 소->대문자
		else answer+=(char)(x+32); //x가 대문자라면 대->소문자
		}
	 
	 * */
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
2. 대소문자 변환

대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 
소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 
 */
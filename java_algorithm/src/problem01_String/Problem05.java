package problem01_String;

import java.util.Scanner;

public class Problem05 {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray(); //str 기반한 문자 배열 생성
		int lt = 0, rt = str.length()-1; //s의 첫번째 문자/마지막 문자
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++; //특수문자일 때 = 알파벳이 아닐 때
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else { //알파벳일 때
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp; //swap 시킴
				lt++;
				rt--;
			}
		} //여기서 return 되는 건 x문자배열, 우리는 String을 return해야 함
		//String 변환
		answer = String.valueOf(s);
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
/*
05. 특정 문자 뒤집기

lt						    rt
 a  #  b  !  G  E  *  T  @  S
   lt					rt
 
lt와 rt가 둘 다 알파벳을 가리키고 있을 때만 문자를 뒤집는다
lt와 rt가 알파벳을 가리키고 있는가? 확인해야 함
-> 교환하고 lt++, rt-- (1씩 이동)
-> 알파벳 아니면 교환 안하고 그냥 1씩 이동

반복문 {
if(lt == 특수문자) lt++;
	else if (rt == 특수문자) rt--;
	else 교환
}


Character.isAlphabetic(s[lt]): lt가 알파벳이면 true
*/
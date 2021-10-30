package problem01_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04_2 { //조건에 맞는 특정 문자만 뒤집고 싶을 때: 일일이 하나하나 뒤집는다
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray(); //String x를 문자배열로 만든다(문자 하나하나로 나눔)
			int lt=0, rt=x.length()-1; //초기화
			while(lt<rt) { //(lt<rt)가 거짓되면 문자열 다 뒤집은 거
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt]= tmp; //값 교환
				lt++;
				rt--;
			} //reverse 직접 구현 알고리즘**(중요)
			//while 끝: 다 뒤집어진 것임 -> 다시 String화 시킴
			String tmp = String.valueOf(s); //valueOf: static으로 선언된 클래스 메소드
			answer.add(tmp); //answer list에 추가해준다
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem04_2 T = new Problem04_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) { 
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}

/*
 * 문자 뒤집기 - 직접 뒤집기
 * g o o d
 * -> g와 d 위치 바꿈.. 짝꿍끼리 바꾼다
 * 
 * 0 1 2 3 4
 * s t u d y
 *lt	   rt
 *맨 처음(0번째): lt
 *맨 끝(n-1번째): rt 
 *
 *lt와 rt를 교환함
 *-> 그 뒤 [lt+1], [rt-1] 이동한 뒤 교환
 *-> 중심은 바꿀 필요 없음
 *
 *while(lt<rt) 반복
 * 
 * */

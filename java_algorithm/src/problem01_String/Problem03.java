package problem01_String;

import java.util.Scanner;

public class Problem03 {//substring으로 풀이
	public String solution(String str) {
		String answer = ""; //가장 긴 단어 저장
		int max = Integer.MIN_VALUE;//최대값으로 계속 갱신해야 함->최솟값으로 초기화
		String[] s = str.split(" "); //띄어쓰기로 구분, 문장을 split
		for(String x : s) {//x: 하나하나의 단어 / s: 배열(문장)
			//System.out.println(x);
			int len = x.length(); //각각의 단어의 길이가 len에 들어간다
			if(len>max) {
				max=len; //최댓값이 m으로 계속 갱신되고
				answer=x; //그 최댓값 발견될 때마다 그 단어들을 answer에 넣어줌, 단어 교체
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //문장 입력받아야 해서 line으로
		System.out.print(T.solution(str));
	}
}
/*
 * 3. 문장 속 단어
 * 
 * 문장의 단어들을 띄어쓰기로 구분/분리해서 String 배열에 저장하는 것: str.split()
 *  
 * 
 * */

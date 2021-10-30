package problem01_String;

import java.util.Scanner;

public class Problem03_2 {//indexOf로 풀이
	public String solution(String str) {
		String answer = ""; 
		int max = Integer.MIN_VALUE, pos;
		//첫번째로 발견되는 indexOf는 띄어쓰기 위치를 return해준다
		while((pos=str.indexOf(' ')) != -1) {//띄어쓰기 발견 못하면 -1, 발견하면 그 인덱스번호 return 
			String tmp = str.substring(0, pos); //0번부터 pos 전까지
			int len = tmp.length();
			if(len>max) {//클 때만O / '같다'고 하면 안됨(max가 여러개면 가장 앞쪽 위치 단어 답이라는 문제 조건)
				max=len;
				answer=tmp; //계속 갱신함 / '같다'고 하면 뒷쪽 단어로 갱신되어버림
				
			}
			str = str.substring(pos+1); //str이 [it is time~]에서 [is time to~]로 바뀜, it 사라짐(이런식으로 반복됨)
		}
		//이렇게만 하면 마지막 단어(study)가 tmp에 안 들어간다 -> 마지막 단어 처리
		if(str.length()>max) answer = str;//마지막 단어가 max보다 크면 answer가 str로 바뀐다
		return answer;
	}
	
	public static void main(String[] args) {
		Problem03_2 T = new Problem03_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //문장 입력받아야 해서 line으로
		System.out.print(T.solution(str));
	}
}

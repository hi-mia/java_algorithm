package problem01_String;

import java.util.Scanner;

public class Problem10 {
	public int[] solution(String s, char t) { //배열 리턴
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i = 0; i<s.length(); i++) {
			//비교
			if(s.charAt(i)==t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		} // -> 방향으로 for문 돌음, 이제 반대편으로 돌 차례
		p = 1000; //p 다시 초기화
		// <- 방향으로 for문이 돈다
		for(int i = s.length()-1; i>=0; i--) { //10번 인덱스부터 시작하니 길이는 11이다
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); //*기존값과 p 중에서 작은 값을 넣어라
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //문자열 읽음
		char c = kb.next().charAt(0); //문자 1개를 읽음
		for(int x : T.solution(str, c)) {
		System.out.print(x + " ");
		}
	}
}

/*
 * 10. 가장 짧은 문자거리
 * 
 * teachermode  e(제시된 문자)
 * 
 * s배열 teachermode
 * 자기 바로 왼쪽에 있는 제시문자(e)로부터의 거리 구함
 * 
 * answer배열(int배열): 각각의 문자가 e로부터 떨어진 거리
 * 
 * p = 1000 //p는 거리, 초기화 때 아주 크게 잡는다
 * e를 만나면 p=0이 됨(e는 자기자신과의 거리니까 0이다)
 * 한칸 더 가면 p+1 -> 1이 됨
 * 
 * s: 		   t e a c h e r m o d e
 * answer:  1001 0 1 2 3 0 1 2 3 4 0 = p
 * p = 각 문자가 '왼쪽에 있는' e로부터의 거리들의 모음
 *
 * 
 * for문이 0->10(오른쪽으로) / 10->0(왼쪽으로)으로 2번 돌아야 한다.. 
 * 그래야 정확함
 * 
 * ->
 * t e a c h e r m o d e
 * 					  <-
 * 10 -> 0(왼쪽으로 돌 때)일 때는 '오른쪽에 있는' e로부터의 거리를 구함
 * 
 * s		t e a c h e r m o d e
 * answer	1 0 2 1 1 0 4 3 2 1 0 = p (왼쪽으로 돌 때)
 * 
 * 기존에 있는 4와 p값 중 작은 값으로 answer을 교체해야 함(왼쪽이나 오른쪽 e 중 짧은 거리 선택)
 * 최종 
 * s		t e a c h e r m o d e
 * answer   1 0 1 2 1 0 1 2 2 1 0 => 출력
 * 
 * 
 * */

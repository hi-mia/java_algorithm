package problem01_String;

import java.util.Scanner;

public class Problem11 {
	public String solution(String s) {
		String answer = "";
		s=s+" "; //맨 뒤에 빈문자 추가해준다
		int cnt=1;
		for(int i=0; i<s.length()-1; i++) { //빈문자 전까지만 i가 가야해서 s.length()-1
			//비교
			if(s.charAt(i)==s.charAt(i+1)) cnt++; //같으면 cnt증가
			else { //다르면 
				answer+=s.charAt(i); //answer에 누적
				if(cnt>1) answer+=String.valueOf(cnt); //cnt누적: 1보다 클때만 String화시켜서 answer에 누적
				cnt=1;
			}	
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 11. 문자열 압축
 * 
 * 	i변수 0 1 2 3 4 5 6 7 8 9 10 11
 * s배열  K K H S S S S S S S E  '' (11번째에 빈문자 넣는거 꼭 해야함!)
 * 
 *i=0일 때 cnt = 1로 초기화 (처음 시작할 때 무조건 문자 1개는 있기 때문)
 *비교: i == (i+1) -> cnt++; // cnt = 2
 *	   i != (i+1) -> answer = k (둘이 다르면 String의 i 지점 누적함)
 * 
 * 문제에서 cnt>1 이면 cnt도 String화 시켜서 뒤에 붙여준다
 * 
 * String answer = K2
 * 
 * -> cnt = 1로 다시 초기화 됨, i++; (i=2)
 * 문자가 서로 다르면 answer에 누적함
 * String answer = K2H
 * 
 * -> cnt = 1로 초기화, i=3
 * i == i+1 -> cnt=7;
 * 
 * answer = K2HS7
 * 
 * -> cnt=1로 초기화, i++ (i=10)
 * i != i+1 (10vs11 인데 11에 빈문자를 넣어줘야 비교 가능)
 * answer = K2HS7E
 * */

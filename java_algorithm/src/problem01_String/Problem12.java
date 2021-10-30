package problem01_String;

import java.util.Scanner;

public class Problem12 {
	public String solution(int n, String s) {
		String answer = "";
		for(int i=0; i<n; i++) {
			//0부터 7번 인덱스까지 / replace로 #->1, *->0
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); 
			//10진수화 시킨다
			int num = Integer.parseInt(tmp, 2);
			answer+=(char)num; //아스키 넘버를 문자화 시킨다
			//System.out.println(tmp+" "+num); //여기서 멈추면 똑같은 문자열만 출력한다
			s=s.substring(7); //s는 7부터 끝까지로 바뀜 -> 문자가 계속 바뀌어서 나옴
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}
}

/*
 * 12. 암호 (replace(), parseInt(string, 2))
 * 입력은 아스키 번호 대문자에 맞게끔 들어옴
 * 
 * */
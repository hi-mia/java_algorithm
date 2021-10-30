package problem02_Array;

import java.util.Scanner;

public class Problem04 {
	public int[] solution(int n) {
		int[] answer = new int[n]; //n크기의 answer 배열 만듦
		answer[0] = 1; //1은 무조건 들어감
		answer[1] = 1;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1]; //바로 앞에앞에 거 + 바로 앞에 거
		} //배열 사용시
			
		return answer;
	}
	/* 배열 안 쓸 때, 손코딩할 때
	 public void solution(int n) {
	 	int a = 1, b = 1, c;
	 	System.out.print(a+" "+b+" ");
	 	for(int i = 2; i<n; i++) {
	 		c=a+b;
	 		System.out.print(c+" ");
	 		a=b;
	 		b=c; 
	 	}
	 }
	 1 1 2
	 a b c
	   a b c
	 한칸씩 뒤로 밀리면서 새로운 a b c가 만들어져야 한다.
	 a=b, b=c, 새로운 c... - 누적
	 
	 * */

	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x+" ");
	}
}

/*
 * 피보나치 수열
 * 
 * 
 * */
 
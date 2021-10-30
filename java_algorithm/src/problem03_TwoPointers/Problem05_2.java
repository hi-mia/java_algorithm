package problem03_TwoPointers;

import java.util.Scanner;

public class Problem05_2 {
	public int solution(int n) { //n=15일 때
		int answer = 0, cnt=1; //cnt: 연속된 자연수의 개수
		n--; //n에서 1을 뺀 거, n=14
		while(n>0) {
			cnt++; //cnt=2
			n=n-cnt; //n-2 -> n에서 총 1과 2를 뺌, n=12가 됨
			if(n%cnt==0) {  //남은 n이 cnt로 나눠서 나머지가 0이면 연속된 자연수 가능, answer에 추가
				//System.out.println(n + " " + cnt);
				answer++;
			}
		}//while
		
		//while문 돌아서 cnt=3일 때 n=12, 이상태에서 (12-3)/cnt(3). 15/3(X) / 3을 고르게 분배
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem05_2 T = new Problem05_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}

/* 
 * 05. 연속된 자연수의 합(수학)
 * 
 * N=15일 때
 * 
 * [] + [] //2개의 숫자로 나눔
 *  1   2  //넣어줌, 그 뒤 (15-1-2)/2를 함, 12/2=6 (나머지 없다)
 *  6   6  //이 6을 각각 동등하게 배분해줌, 그리고 더한다
 * =7  =8
 *  
 *  가능한지 안 가능한지 확인하려면 N에서 2개의 숫자를 뺀 값이 2로 나누어 떨어져야 함
 *  
 * [] + [] + []
 *  1   2    3  //15-6=9 / 3개니까 3으로 나눠서 떨어지면 (9/3) 각각 동등하게 분배
 *  3   3    3
 * =4  =5   =6 
 * 
 * [] + [] + [] + []
 *  1   2    3    4 // 15-10=5 / 5/4: 나눠떨어지지 않는다
 * 
 * [] + [] + [] + [] + []
 * 1    2    3     4    5 // 15-15=0 / 0/5=0
 * 
 * */

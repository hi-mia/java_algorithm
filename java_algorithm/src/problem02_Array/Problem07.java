package problem02_Array;

import java.util.Scanner;

public class Problem07 {
	public int solution(int n, int[] arr) {
		int answer = 0, cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				answer+=cnt; //누적
				
			}
			else cnt=0; //0이면 0으로 초기화
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n,arr));
	}
}

/*
7. 점수계산
cnt 변수: 1을 만나면 증가, 0 만나면 0으로 초기화함
sum 변수: cnt를 누적

*/
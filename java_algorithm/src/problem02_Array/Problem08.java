package problem02_Array;

import java.util.Scanner;

public class Problem08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n]; //기본적으로 0으로 초기화 되어있음
		for(int i = 0; i<n; i++) {
			int cnt=1; //처음에 i의 등수는 항상 1이다
			for(int j = 0; j<n; j++) {
				if(arr[j]>arr[i]) cnt++; //j 점수가 i보다 크면 등수 증가
			}
			answer[i] = cnt; //i의 등수가 구해짐
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		
	}
	
	
}

/*
 * 등수 구하기
 * 
 * arr: 87 89 92 100 76
 * answer: [][][][][]
 * cnt 변수
 * 
 * arr[j] > arr[i] //j가 안쪽 for문, 기준은 i
 * i=87 일때
 * 87 기준으로 계속 비교, 87<89 -> cnt++;
 * 89<92 -> cnt++, 92<100 -> cnt++, 100>76 그냥 지나감
 * 최종 cnt = 4;
 * 
 * answer[0] = 4
 * 
 * i=89 돌기 전에 cnt=1 로 초기화 시킴
 * 
 * 동점이 있다면 공동 순위가 된다.
 * */

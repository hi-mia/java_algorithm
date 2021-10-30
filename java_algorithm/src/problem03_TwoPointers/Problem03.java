package problem03_TwoPointers;

import java.util.Scanner;

public class Problem03 {
	public int solution(int n, int k, int[]arr) {
		int answer, sum=0;
		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
		for(int i=k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]); //이 값을 누적한다
			answer=Math.max(answer, sum); //둘 중 큰값 구한다
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}

/*
 * 03. 최대 매출(슬라이딩 윈도우)
 * 
 * 3일 -> 길이가 3짜리인 창(윈도우)를 만듦, 이 크기의 창문을 그대로 한 칸씩 옆으로 밀고 가면 됨
 * 
 * k=3
 * arr    12 15 11 20 25 10 20 19 13 15
 * 
 * sum    38(첫 윈도우의 값) + arr[i] - arr[i-k] // 윈도우 한칸씩 민 값
 * 		-> 2번째 윈도우 값: 46 = sum의 값 갱신
 * 
 * answer   38(초기화) -> 46 (제일 큰 값을 넣는다) 
 * 
 * for문 돌기 전에 첫 윈도우의 합 값을 sum에 넣는다.
 * 여기서는 3일 윈도우이므로 12+15+11 = 38이다
 * 
 * */

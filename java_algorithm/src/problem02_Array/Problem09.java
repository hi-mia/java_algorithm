package problem02_Array;

import java.util.Scanner;

public class Problem09 {
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE; //최대값 찾아야하니 최소값으로 초기화
		int sum1, sum2; //sum1: 행의합, sum2: 열의 합
		for(int i=0; i<n; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j]; //행의 합 / i=0(행이 고정), j가 반복(열이 움직임)
				sum2 += arr[j][i]; //열의 합 / j가 반복(열이 움직임), i=0(행이 고정)
			}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2); //둘 중 더 큰값이 answer로 들어감
			
		}//행과 열의 합
		//대각선의 합
		sum1 = sum2 = 0; //초기화
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i]; //행과 열 번호가 같음 = 대각선
			//반대편 대각선, arr[i]=0일 때 arr[j]=4
			sum2 += arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2); //둘 중 더 큰값이 answer로 들어감
		
		return answer;
	}

	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
	
}

/*
 09. 격자판 최대합
 각 행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 합을 출력
 
 * 
 * */

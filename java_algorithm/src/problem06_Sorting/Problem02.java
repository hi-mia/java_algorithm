package problem06_Sorting;

import java.util.Scanner;

public class Problem02 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) { //j는 도는 횟수가 하나씩 작아저야 함/i보다 하나씩 적게 돈다
				if(arr[j]>arr[j+1]){//양 옆을 비교, 뒤가 작으면 swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}
/*
 * 02. 버블정렬
 * 
 * 
 * arr  13 5 11 7 23 15
 * 
 * 버블정렬은 이웃한 두 숫자 비교해서 오름차순이면(앞이 크고 뒤가 작으면)
 * swap 해준다
 * 
 * arr   5 13 11 7 23 15
 * arr   5 11 13 7 23 15
 * arr   5 13 7 13 15 23 
 * 이렇게 한번 term이 끝나면 가장 큰 숫자가 맨 뒤로 간다
 * 버블정렬은 한번의 텀을 통해 맨 뒷자리 숫자를 정한다
 * 
 * 
 * */

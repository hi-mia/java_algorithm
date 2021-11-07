package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		//배열 정렬
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) return "D"; //중복이면 D 리턴
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}

/*
 * 05. 중복 확인 - 정렬로도 풀 수 있다, 그런데 nlogn임
 * 
 * ----------->
 * 20 25 30 33 39
 * 
 * 정렬 후
 * 쭉 돌면서 이웃한 숫자 비교해서 같으면 중복됐다고 확인한 뒤 return 해버린다
 * 
 * */

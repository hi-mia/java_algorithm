package problem03_TwoPointers;

import java.util.Scanner;

public class Problem05 {
	public int solution(int n) {
		int answer = 0, sum=0, lt=0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1; //0인덱스에 1이 들어간다
		for(int rt=0; rt<m; rt++) { //rt는 m전까지 돌면 됨(배열이라서)
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}

/*
 * 05. 연속된 자연수의 합(two pointers) - 앞 문제와 똑같이
 * 
 * N=15일 때
 * 연속된 자연수는 15/2의 몫+1 까지만 가능하다(7+1 = 최대치)
 * (N/2)+1까지만 가능
 * 
 *      lt  rt
 * arr   1  2  3  4  5  6  7  8  9 //연속부분수열로 보자
 * 
 * sum == n ? 확인
 *  1 == n(15)? -> rt 1증가
 *  1+2 == n? -> rt 1증가
 *  1+2+3 == n? ...
 * 
 *  rt값이 5가 되면 1+2+3+4+5, sum(15) == n(15) --> 카운팅
 *  카운팅 하면 lt 1이동 후 lt값을 뺀다.
 *  sum(14) == n(15)? 확인 -> 아니니까 rt가 1증가, rt값 더해줌
 *  sum(20) > n(15)이면 lt값 빼주고 lt를 1 이동시킨다
 *  
 *  sum < n 이면 rt 증가, rt값 더하기
 *  sum > n 이면 lt 값 빼주고 lt 증가
 *  
 * */
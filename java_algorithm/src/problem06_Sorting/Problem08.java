package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem08 { //이분 검색은 외워놓자
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); //arr 오름차순 정렬
		int lt = 0, rt = n-1;
		while(lt<=rt) { //이분검색은 while문으로
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1; //mid는 인덱스 번호
				break;
			}
			if(arr[mid]>m) rt = mid-1; //큰쪽을 날린다. rt가 작아진다(이분검색에서 rt는 무조건 작아지고 lt는 커진다)
			else lt = mid+1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}

/*
 * 08. 이분 검색 - 알고리즘, 무조건 정렬해야한다
 * 정렬된 상태에서만 이분 검색 가능
 * 
 *      lt		mid			 rt
 *      0  1  2  3  4  5  6  7
 * arr  12 23 32 57 65 81 87 99 //오름차순 정렬
 * 
 * mid = (lt+rt)/2
 * 
 * 
 * lt는 0으로 초기화, rt는 맨 끝자리인 (n-1)로 초기화 (0번 인덱스부터라 -1을 해준다)
 * 이때 mid는 7/2 = 3
 * arr[mid] == m
 * 
 * answer은 mid+1 이다 (인덱스번호+1을 해야지 ~번째가 됨)
 * 
 * arr[mid]>m  --> rt = mid-1 로 범위가 바뀜
 * 
 *      lt	    rt  mid			
 *      0   1   2   3   4   5   6   7
 * arr  12  23  32  57  65  81  87  99
 * 
 * 검색범위가 절반으로 줄어든다!
 * 
 *      lt	    rt  		
 *      0   1   2   
 * arr  12  23  32 
 * 
 * mid = (lt+rt)/2

 *      lt	mid rt  		
 *      0   1   2   
 * arr  12  23  32 
 * 
 *       lt
 *       rt  		
 *       2   
 * arr   32 
 * 
 * 최종: lt, rt가 같은 값을 가리킨다
 * 이때 mid = (2+2)/2 = 2 
 * 
 * answer = mid+1 = 3
 *
 * -----------------------------------------
 * else lt = mid+1 (arr[mid]>m가 거짓일 때)
 * 
 *      	       mid	lt		   rt
 *      0   1   2   3   4   5   6   7
 * arr  12  23  32  57  65  81  87  99
 * 이렇게 됨
 * 
 * */
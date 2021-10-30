package problem04_HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem05 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1; //k번째 수가 존재하지않으면 -1 출력(문제 조건)
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		//트리셋은 기본적으로 오름차순, 리버스하면 내림차순이 된다
		
		//3중 for문을 돈다(무조건 3장 뽑으니까)
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){ //i 뒤편부터 돌아야 한다, 중복 허락하지 않으므로
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//Tset 모두 탐색
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x;
			//System.out.println(cnt + "-" + x);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}

/*
 * 05. K번째 큰 수
 * 무조건 3장 뽑으니 3중 for문 돌면 된다
 * 
 * ~자료구조 set~
 * add를 하면 기존에 들어있으면 중복을 허락하지 않기 때문에 넣지 않는다
 * 즉, 중복제거를 하는 자료구조
 * 넣을 때 정렬이 되어있으면 좋다 -> TreeSet
 * TreeSet은 중복제거+자동정렬까지 (이진 트리이다)
 * 
 * 
 * 
 * */

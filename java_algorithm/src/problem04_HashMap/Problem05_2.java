package problem04_HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem05_2 {//TreeSet이 지원하는 메소드
	public int solution(int[] arr, int n, int k){
		int answer=-1;
		//기본 오름차순 정렬, reverse해야지 내림차순
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//remove: 특정 값을 지운다
		Tset.remove(143);
		
		//size: key가 몇 개 있는가 확인, 원소의 개수 알려줌
		System.out.println(Tset.size());
		
		//first: 오름차순이면 최소값, 내림차순이면 최대값을 받는다(정렬의 맨 앞에 것을 받는다)
		System.out.println("first : "+ Tset.first());
		
		//last: 오름차순이맨 최대값, 내림차순이면 최소값(정렬의 맨 마지막)
		System.out.println("last : "+ Tset.last());
			
		for(int x : Tset){

			System.out.println(x);
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args){
		Problem05_2 T = new Problem05_2();
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
 * 
 * ~자료구조 set~
 * add를 하면 기존에 들어있으면 중복을 허락하지 않기 때문에 넣지 않는다
 * 즉, 중복제거를 하는 자료구조
 * 넣을 때 정렬이 되어있으면 좋다 -> TreeSet
 * TreeSet은 중복제거+자동정렬까지 (이진 트리이다)
 * 
 * set은 보통 중복제거하려고 사용한다
 * 정렬만 사용할거면 정렬 지원하는 해쉬맵(트리맵) 사용하면 된다
 * 트리맵: 이진트리
 * 
 * 
 * */

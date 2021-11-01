package problem06_Sorting;

import java.util.Scanner;

public class Problem01 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) { //굳이 끝까지 돌 필요 없다.. 끝까지 안 돌아도 마지막에 남을 것이 1개밖에 없어서
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx=j; //idx를 j로 교체
			} //끝까지 돌면 idx에는 i번째부터 끝까지에서 가장 작은 숫자의 인덱스 번호가 저장되어있다
			int tmp = arr[i]; // j가 아니다!! i와 바꾼다!!
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}

}

/*
 * 01. 선택정렬 - 이중 for문 사용
 * 
 * idx변수 필요
 * idx = i
 * idx에는 가장 작은 숫자의 인덱스를 저장한다
 * 
 * if(arr[j] < arr[idx])라면 idx = j 로 바꾼다
 * j가 다 돌면
 * arr[idx]와 arr[i]를 교환한다 (idx에는 i의 인덱스가 들어간다!)
 * 그 뒤 i가 증가
 * j는 i+1부터 돈다
 * 
 * */

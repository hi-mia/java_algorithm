package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

	public int count(int[] arr, int dist) { //유효 함수 / dist=distance, 거리
		int cnt = 1; // 배치한 말의 마리수
		int ep = arr[0]; //제일 왼쪽 좌표에 최초 1마리 배치함(가장 왼쪽에 배치해야 말 가장 많이 배치 가능)
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]-ep >= dist) {
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		//좌표니까 정렬해놔야 함
		Arrays.sort(arr);
		int lt = 1; //첫 좌표
		int rt = arr[n-1]; //마지막 좌표
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)>=c) { //mid가 답으로 유효하면(리턴된 말 마리 수가 c마리수 이상이라면 유효)
				answer = mid;
				lt = mid+1; //범위 더 좁혀나간다
			}
			else rt = mid-1; //답이 유효하지 않다면 아닌 범위 버린다(범위를 더 좁힌다)
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int c=kb.nextInt(); //말 마리 수
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
	
}

/*
 * 10. 마구간 정하기(결정 알고리즘)
 * 결정 알고리즘: lt와 rt를 꼭 정해야 한다
 * 
 * 서로 양 끝 값
 * lt: 두 말 사이의 최소값(1)
 * rt: 두 말 사이의 최대값(9) / arr[n-1]
 * 
 * 마구간 위치
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * 
 * ep: end position (가장 가까운 두 말의 거리로 몇 마리를 배치할 수 있는지 확인)
 * 
 * lt    mid     rt
 * 1      5       9
 * 
 * mid가 유효한지 검사: ep 변수 활용
 * ep: end position (가장 가까운 두 말의 거리로 몇 마리를 배치할 수 있는지 확인)
 * 여기서는 mid=5(말 사이의 거리)일 때 몇 마리 배치 가능? 확인
 * (arr[i] - ep) >= mid 이어야지 그 다음 말을 놓을 수 있다
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * 말		     말
 * 
 * ep = 8 -> 말을 2마리 배치함 -> 2를 리턴함
 * 이 거리로는 3마리를 배치할 수 없으므로 이 mid는 유효하지 않다
 * 
 * mid=1 이라면 총 5마리 배치 가능 -> 3마리만 배치도 가능
 * 3보다 크거나 같으면 유효한 것임
 * 
 * lt     mid     rt
 * 1      2        4
 * 
 * ep = 1 -> 4 -> 8
 * (arr[i] - ep) >= mid //2보다 크거나 같게만 배치
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * 말	  말	     말 
 * 
 * cnt는 3 리턴
 * mid=2는 유효 -> answer에다 2를 저장해놓음
 * 
 * lt         mid     rt
 * 3(mid+1)   3        4
 * 
 * mid=3이 유효하면 answer=3
 * 
 * */
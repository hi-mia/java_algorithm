package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem09 {
	
	public int count(int[] arr, int capacity) { //capacity:용량 / count: 장수
		//dvd 1장의 용량을 capacity만큼 설정했더니 노래9곡 담을 때 dvd가 몇장 필요한지 return해주는 함수
		
		int cnt = 1; //dvd 장수
		int sum = 0; //dvd에 담는 곡들의 합
		for(int x : arr) {
			if(sum+x > capacity){
				cnt++; //노래용량 차례로 더하니 capacity보다 더 크면 장수++
				sum = x;
			}
			else sum+=x;
		}
		return cnt;
		
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		//큰 데이터에서 최댓값/합을 구할 때 for문 돌리는 것보다는 stream 쓰는게 더 낫다
		//배열의 stream을 얻는다(stream은 자료구조 탐색 위한 이터레이터/반복자)
		int lt = Arrays.stream(arr).max().getAsInt(); //배열의 최댓값 구한다 + getAsInt(): max()를 int로 반환하게 한다
		int rt = Arrays.stream(arr).sum(); //sum은 int를 반환한다
		
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m){
				answer=mid;
				rt=mid-1; //좁혀나감(더 작은 값이 있는지 확인)
			}
			else lt=mid+1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}

}

/*
 * 09. 뮤직비디오(결정 알고리즘)
 * 결정 알고리즘: 이분 검색을 이용한다
 * 
 * 결정 알고리즘은 문제가 요구하는 답이 lt~rt사이에 있다고 확신이 들 때만 사용
 * 결정 알고리즘의 핵심: lt~rt사이의 내가 생각한 값이 답으로서 가능한 숫자인가?(답인가? 가 아님)
 * 더 좋은 답이 있을 수는 있지만 나쁘지 않은 값인가?(답으로서 가능한 값)
 * 나쁘지 않은 값 찾으면 더 좋은값 있을 지 찾기위해 더 좁혀나감.. 
 * 이분검색은 좁혀나가는 것. 최종적으로 선택되는 것이 answer임
 * 
 * 입력예제
 * 9 3 (3장 안에 dvd 곡 다 담을 수 있을 때 dvd의 최소용량 찾기)
 * 1 2 3 4 5 6 7 8 9
 * 
 * lt		mid			rt
 * 9		27			45
 * 
 * 노래는 최소한 9분보다 커야한다: 답의 범위 중 가장 작은 값이 lt
 * 노래를 1장에 다 담을 시 1+2+...+9 = 45: 답의 범위 중 가장 큰 값이 rt
 * 
 * mid = (lt+rt)/2 = 54/2 = 27
 * 
 * dvd 한장의 용량이 27이면 모든 곡을 담을 수 있는가? 검증
 * 1~6 / 7~9 이렇게 2장 안에 담을 수 있음 -> 그럼 3장 안에 당연히 담을 수 있음
 * 27은 답이 가능한 값이다: answer = 27
 * 
 * 결정 알고리즘: 더 좋은 답을 위해 범위를 좁혀가는 것
 * 
 * lt	 mid	rt
 * 9	  17    26
 * 
 * 최소용량 17일 때
 * 1~5 / 6,7 / 8,9 -> 3장으로 모든 곡 담을 수 있다
 * 17은 답으로 가능한 숫자: answer = 17
 * 
 * 17보다 더 좋은 값이 있는가?
 * lt	mid		rt
 * 9	12		16
 * 최소용량 12일 때
 * 1~4 / 5,6, / 7 / 8 / 9 -> 총 5장 (답x)
 * 12보다 큰 숫자에서 찾는다 
 * 
 * lt<=rt일때 멈춘다
 * 
 * 
 * */

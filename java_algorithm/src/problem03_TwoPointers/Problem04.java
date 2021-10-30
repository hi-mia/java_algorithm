package problem03_TwoPointers;

import java.util.Scanner;

public class Problem04 {
	public int solution(int n, int m, int[] arr) {
		int answer=0, sum=0, lt=0; 
		//루틴: 증가하고(rt++) - 더하고(sum) - 확인(sum==m)
		for(int rt=0; rt<n; rt++) { //rt이동, n 전까지 가면 된다
			sum+=arr[rt]; //sum: lt~rt까지의 합
			if(sum==m) answer++; //rt값을 더하면 바로 확인해줘야 한다
			while(sum>=m) {
				sum-=arr[lt++]; //lt값 빼고 나서 lt 증가
				if(sum==m) answer++; //sum = lt~rt까지
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}

/*
 * 04. 연속부분수열(복합적 문제)
 * 
 * 어떤 특정 연속 구간을 lt~rt까지이다 라고 생각하면 됨
 * lt(맨 왼쪽), rt(맨 오른쪽)
 * lt~rt까지의 연속된 합이 특정숫자 6이 되는가? 확인 알고리즘
 * 
 *       rt
 *       lt  
 * arr	  1 2 1 3 1 1 1 2
 * 
 * sum   1 (초기값)
 * 
 * rt, lt는 처음에 0을 가리키고 있음(배열의 첫 위치값)
 * sum에는 처음에 lt가 가리키는 값을 넣음
 * sum = lt~rt까지의 연속 합(중요)
 * 
 * rt값을 더하고 나면 아래의 작업을 꼭 해야함
 * sum == m ?
 *  1     6
 *  lt는 0 고정, rt 1이동;
 *  rt 1이동하고 더하고 sum==m? 확인 --반복 
 * 
 * 이동하다보면 sum(7) == m(6)이 되어서 sum>m인 경우가 생김
 * 이럴 때는 lt의 값을 빼준후 lt를 1 이동시킨다.
 * lt값을 빼줘도 sum == m? 인지 확인해줘야 한다.
 * sum==m이 될 때 sum의 구간의 합은 lt~rt까지, 즉 arr[1~3]까지이다.
 *
 * sum==m이 되면 카운팅을 해준다
 * 그 뒤 lt 1증가, lt값 빼준다 -> sum==m 확인? -> X면 rt 1증가, rt값 더해줌
 * sum==m 확인해서 O면 카운팅해줌, 위의과정 반복... rt가 끝까지 도달하면 종료
 * 
 * */
 
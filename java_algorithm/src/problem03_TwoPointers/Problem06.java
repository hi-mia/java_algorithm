package problem03_TwoPointers;

import java.util.Scanner;

public class Problem06 { //어려우니 다시 듣자..
	public int solution(int n, int k, int[] arr){
		int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}//조정
			//조정을 한 뒤 길이를 구한다
			answer=Math.max(answer, rt-lt+1); //answer과 길이 중 더 최대값
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}

/*
 * 06. 최대 길이 연속부분수열(투 포인터)
 * arr[], answer, cnt 세 변수 필요
 * answer은 연속수열의 길이(rt-lt+1) / 가장 작은 값으로 초기화(최대값 찾아야하니까)
 * cnt: 0을 1로 바뀐 횟수 / k를 넘으면 안된다: cnt>k
 * 
 *      rt
 *      lt
 * arr   1  1  0  0  1  1  0  1  1  0  1  1  0  1
 * 
 * 
 * answer 0 -> 1 -> 2 -> 3
 * 
 * cnt              1 -> 2
 * 
 * 
 * 투포인터: rt가 앞에 먼저가고 lt가 그 뒤를 쫓아감
 * rt가 앞에 먼저 가면서 0->1로 바꿈, lt가 뒤에서 쫓아가면서 rt가 바꿔놓은 숫자를 다시 원상태로 바꿈(1->0)
 * 
 * rt가 매번 증가할 때마다 연속수열의 길이(rt-lt+1)를 구한다
 * rt가 0을 만나면 1로 바꾸고 cnt++;
 *(rt-lt+1) 계산 전에 cnt>k가 참인지 확인해야 한다 (여기서 k=2)
 * cnt(3) > k(2)면 false가 되어서 lt를 증가시킨다. 
 * lt는 rt가 바꾼걸 되돌리는 역할, 1->0으로 되돌린다.(원래 1이었던 것들은 그냥 지나감)
 * lt는 바꾸고 증가. 1->0 바꾼 뒤 lt 1이동, 그 뒤에 길이(rt-lt+1)를 계산
 * 
 * ...rt가 끝까지 가면 종료
 * 
 * */
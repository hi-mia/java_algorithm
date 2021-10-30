package problem02_Array;

import java.util.Scanner;

public class Problem05 {
	public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1]; //인덱스번호 n까지 생김
		for(int i=2; i<=n; i++) { //2부터 n까지 돈다
			if(ch[i]==0) { //소수라면 answer++
				answer++;
				//i의 배수들 체크
				for(int j=i; j<=n; j=j+i) ch[j] = 1; 
				//j=j+i :j가 i의 배수로 돌아야하니 i씩 증가
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


/* 소수(에라토스테네스 체) 
 * ch[] 배열에 들어있는 숫자들 돌면서
 * i++ (i=약수)
 * 2가 약수인지 체크(2의 배수면 소수가 아님)
 * 3가 약수인지 체크(3을 소수로 카운트 후 3의 배수 다 제거)
 * 5가 약수인제 체크(5를 소수로 카운트 후 5의 배수 다 제거)
 * */
 
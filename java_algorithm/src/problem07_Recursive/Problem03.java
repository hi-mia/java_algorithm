package problem07_Recursive;

public class Problem03 {
	public int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1); //재귀함수가 return됨
		
	}
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		System.out.println(T.DFS(5));
	}
}

/*
 * 03. 팩토리얼
 * 1부터 n까지의 곱
 * 
 * 재귀를 이용해서 구현해보자
 * 재귀함수는 스택을 사용한다
 * 
 * 재귀함수가 함수값을 return받아서 계속 누적해서 최종값 도달함
 * */
 
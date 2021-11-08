package problem07_Recursive;

public class Problem02 {
	public void DFS(int n) { //n이 되면 재귀함수가 멈춰야 한다
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		T.DFS(11);
	}
}

/*
 * 02. 이진수 출력(재귀)
 * 
 * 2로 계속 나누면서 나머지 기록.
 * n=0이 됐을 때 return하고 멈춘다
 * 
 * */

package problem07_Recursive;

public class Problem04_2 { //재귀-메모이제이션
	static int[] fibo; //더 개선된 방법: 배열 만듦
	
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]; // fibo에 n번 인덱스의 값이 이미 구해져 있음 -> 재귀부를 필요 없이 배열에 저장된 값 꺼내면 됨
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1); //fibo 배열에 저장 후 한번에 리턴
	}

	public static void main(String[] args) {
		Problem04_2 T = new Problem04_2();
		int n = 45;
		fibo = new int[n+1]; //n까지 필요하니까 인덱스번호+1d을 해줘야한다
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}

}

/*
 * 04. 피보나치 재귀(메모이제이션)
 * 메모이제이션 사용하면 속도 매우 빨라진다, 시간복잡도 확 줄임
 * 
 *  한 번 구한 값은 저장해놓고 필요시에 계속 꺼내어 쓴다. 다시 계산X
 * 
 * */
 
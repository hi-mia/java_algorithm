package problem07_Recursive;

public class Problem04 { //다시 듣기
	static int[] fibo; //더 개선된 방법: 배열 만듦
	
	public int DFS(int n) {
		//if(n==1) return 1;
		//else if(n==2) return 1;
		//else return DFS(n-2)+DFS(n-1); //n번재 항의 앞의앞의 항+n번째 항의 앞의 항
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1); //fibo 배열에 저장 후 한번에 리턴
	}

	public static void main(String[] args) {
		Problem04 T = new Problem04();
		int n = 10;
		fibo = new int[n+1]; //n까지 필요하니까 인덱스번호+1d을 해줘야한다
		T.DFS(n);
		//for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}
}

/*
 * 04. 피보나치 재귀(메모이제이션)
 * 피보나치는 배열로 짜기 or 재귀로 짜기 2가지를 코딩인터뷰에서 많이 함
 * 배열/for문 쓰는게 성능은 더 좋다
 * 
 * 
 * */

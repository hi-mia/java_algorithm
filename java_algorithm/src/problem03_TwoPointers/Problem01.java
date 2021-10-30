package problem03_TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) { //둘 중 하나라도 끝나면(p1이 n까지 가거나 p2가 m까지 간다면)
			if(a[p1]<b[p2]) answer.add(a[p1++]); //a의 p1이 b의 p2보다 작으면 a의 p1을 add하고 앞으로 1만큼 이동
			else answer.add(b[p2++]);
		}
		while(p1<n) answer.add(a[p1++]); //p1이 남았다면 a배열의 p1 이동하면서 나머지 요소 다 넣는다
		while(p2<m) answer.add(b[p2++]); //p2가 남았다면 b배열의 p2 이동하면서 끝까지 넣는다
		
		
		return answer;
	}

	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		int m = kb.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = kb.nextInt();
		}
		for(int x:T.solution(n,m,a,b)) System.out.print(x+ " ");
	}
}

/*
 * 01. 두 배열 합치기
 * -합쳐서 정렬(제일 간단) 그러나 권장X
 * -Two pointers 알고리즘 사용 가능? 묻는 것임(효율성)
 * 
 * a,b는 이미 정렬된 상태
 *     P1(포인터)
 * a   1  3  5   -n개
 * 
 *    P2(포인터)
 * b   2  3  6  7  9   -m개
 * 
 * a[p1] < b[p2] -> a추가, a의 포인터++
 * a의 p1과 b의 p2를 비교해서 작은 쪽을 answer(ArrayList)에 add한다
 * 그리고 나서 answer에 넣은 쪽의 pointer++(이동), 그 뒤 다시 포인터 비교
 * 
 * 그렇게 계속하면 p1이 a 배열 다 탐색하고 끝나버림
 * p1, p2 중 아무거나 하나가 끝까지 갔다 -> while문 멈춤
 * (p<n) || (p2<m) --둘중 하나가 끝까지 간다면 false
 * 여기서는 n=3되면 거짓되게 해야 함 / 0부터 도니까 같다X
 * 
 * 둘 중 남은 쪽은 그냥 차례로 넣으면 됨
 * */

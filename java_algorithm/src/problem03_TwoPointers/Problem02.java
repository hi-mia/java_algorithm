package problem03_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problem02 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		//오름차순 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) { //같으면 둘 다 동시에 증가
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++; //작은 쪽을 증가
			else p2++;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
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
 * 02. 공통 원소 구하기 (교집합 구하기)
 * 투 포인터 알고리즘은 각 배열에 [오름차순 정렬]을 꼭 해야한다.
 * 
 *     p1
 * a    1  2  3  5  9
 *  
 *     p2
 * b    2 3 5 7 8
 * 
 * answer[] 2 3 5
 * 
 * a[p1], b[p2] 비교
 * a[p1] == b[p2]면 answer에 넣는다 + p1,p2 둘 다 동시에 이동시켜야 한다
 * a[p1] < b[p2]면 작은 쪽을 이동시킨다(p1 이동) - 오름차순 정렬되어 있으니 작은 숫자는 b에 있을리 없음
 * 2개씩 비교 후 아무쪽이나 한쪽이 끝나면 공통원소 없음, 이걸로 끝
 * 
 * 
 * */

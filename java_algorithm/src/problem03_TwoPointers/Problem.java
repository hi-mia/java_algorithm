package problem03_TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		return answer;
	}

	public static void main(String[] args) {
		Problem T = new Problem();
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

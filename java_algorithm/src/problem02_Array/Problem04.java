package problem02_Array;

import java.util.Scanner;

public class Problem04 {
	public int[] solution(int n) {
		int[] answer = new int[n]; //nũ���� answer �迭 ����
		answer[0] = 1; //1�� ������ ��
		answer[1] = 1;
		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2]+answer[i-1]; //�ٷ� �տ��տ� �� + �ٷ� �տ� ��
		} //�迭 ����
			
		return answer;
	}
	/* �迭 �� �� ��, ���ڵ��� ��
	 public void solution(int n) {
	 	int a = 1, b = 1, c;
	 	System.out.print(a+" "+b+" ");
	 	for(int i = 2; i<n; i++) {
	 		c=a+b;
	 		System.out.print(c+" ");
	 		a=b;
	 		b=c; 
	 	}
	 }
	 1 1 2
	 a b c
	   a b c
	 ��ĭ�� �ڷ� �и��鼭 ���ο� a b c�� ��������� �Ѵ�.
	 a=b, b=c, ���ο� c... - ����
	 
	 * */

	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x+" ");
	}
}

/*
 * �Ǻ���ġ ����
 * 
 * 
 * */
 
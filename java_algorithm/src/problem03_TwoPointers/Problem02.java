package problem03_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problem02 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		//�������� ����
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) { //������ �� �� ���ÿ� ����
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++; //���� ���� ����
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
 * 02. ���� ���� ���ϱ� (������ ���ϱ�)
 * �� ������ �˰����� �� �迭�� [�������� ����]�� �� �ؾ��Ѵ�.
 * 
 *     p1
 * a    1  2  3  5  9
 *  
 *     p2
 * b    2 3 5 7 8
 * 
 * answer[] 2 3 5
 * 
 * a[p1], b[p2] ��
 * a[p1] == b[p2]�� answer�� �ִ´� + p1,p2 �� �� ���ÿ� �̵����Ѿ� �Ѵ�
 * a[p1] < b[p2]�� ���� ���� �̵���Ų��(p1 �̵�) - �������� ���ĵǾ� ������ ���� ���ڴ� b�� ������ ����
 * 2���� �� �� �ƹ����̳� ������ ������ ������� ����, �̰ɷ� ��
 * 
 * 
 * */

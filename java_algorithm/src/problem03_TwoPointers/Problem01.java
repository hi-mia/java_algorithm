package problem03_TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) { //�� �� �ϳ��� ������(p1�� n���� ���ų� p2�� m���� ���ٸ�)
			if(a[p1]<b[p2]) answer.add(a[p1++]); //a�� p1�� b�� p2���� ������ a�� p1�� add�ϰ� ������ 1��ŭ �̵�
			else answer.add(b[p2++]);
		}
		while(p1<n) answer.add(a[p1++]); //p1�� ���Ҵٸ� a�迭�� p1 �̵��ϸ鼭 ������ ��� �� �ִ´�
		while(p2<m) answer.add(b[p2++]); //p2�� ���Ҵٸ� b�迭�� p2 �̵��ϸ鼭 ������ �ִ´�
		
		
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
 * 01. �� �迭 ��ġ��
 * -���ļ� ����(���� ����) �׷��� ����X
 * -Two pointers �˰��� ��� ����? ���� ����(ȿ����)
 * 
 * a,b�� �̹� ���ĵ� ����
 *     P1(������)
 * a   1  3  5   -n��
 * 
 *    P2(������)
 * b   2  3  6  7  9   -m��
 * 
 * a[p1] < b[p2] -> a�߰�, a�� ������++
 * a�� p1�� b�� p2�� ���ؼ� ���� ���� answer(ArrayList)�� add�Ѵ�
 * �׸��� ���� answer�� ���� ���� pointer++(�̵�), �� �� �ٽ� ������ ��
 * 
 * �׷��� ����ϸ� p1�� a �迭 �� Ž���ϰ� ��������
 * p1, p2 �� �ƹ��ų� �ϳ��� ������ ���� -> while�� ����
 * (p<n) || (p2<m) --���� �ϳ��� ������ ���ٸ� false
 * ���⼭�� n=3�Ǹ� �����ǰ� �ؾ� �� / 0���� ���ϱ� ����X
 * 
 * �� �� ���� ���� �׳� ���ʷ� ������ ��
 * */

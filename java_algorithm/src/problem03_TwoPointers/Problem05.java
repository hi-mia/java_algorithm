package problem03_TwoPointers;

import java.util.Scanner;

public class Problem05 {
	public int solution(int n) {
		int answer = 0, sum=0, lt=0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1; //0�ε����� 1�� ����
		for(int rt=0; rt<m; rt++) { //rt�� m������ ���� ��(�迭�̶�)
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}

/*
 * 05. ���ӵ� �ڿ����� ��(two pointers) - �� ������ �Ȱ���
 * 
 * N=15�� ��
 * ���ӵ� �ڿ����� 15/2�� ��+1 ������ �����ϴ�(7+1 = �ִ�ġ)
 * (N/2)+1������ ����
 * 
 *      lt  rt
 * arr   1  2  3  4  5  6  7  8  9 //���Ӻκм����� ����
 * 
 * sum == n ? Ȯ��
 *  1 == n(15)? -> rt 1����
 *  1+2 == n? -> rt 1����
 *  1+2+3 == n? ...
 * 
 *  rt���� 5�� �Ǹ� 1+2+3+4+5, sum(15) == n(15) --> ī����
 *  ī���� �ϸ� lt 1�̵� �� lt���� ����.
 *  sum(14) == n(15)? Ȯ�� -> �ƴϴϱ� rt�� 1����, rt�� ������
 *  sum(20) > n(15)�̸� lt�� ���ְ� lt�� 1 �̵���Ų��
 *  
 *  sum < n �̸� rt ����, rt�� ���ϱ�
 *  sum > n �̸� lt �� ���ְ� lt ����
 *  
 * */
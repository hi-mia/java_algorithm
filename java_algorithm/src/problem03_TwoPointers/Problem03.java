package problem03_TwoPointers;

import java.util.Scanner;

public class Problem03 {
	public int solution(int n, int k, int[]arr) {
		int answer, sum=0;
		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
		for(int i=k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]); //�� ���� �����Ѵ�
			answer=Math.max(answer, sum); //�� �� ū�� ���Ѵ�
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}

/*
 * 03. �ִ� ����(�����̵� ������)
 * 
 * 3�� -> ���̰� 3¥���� â(������)�� ����, �� ũ���� â���� �״�� �� ĭ�� ������ �а� ���� ��
 * 
 * k=3
 * arr    12 15 11 20 25 10 20 19 13 15
 * 
 * sum    38(ù �������� ��) + arr[i] - arr[i-k] // ������ ��ĭ�� �� ��
 * 		-> 2��° ������ ��: 46 = sum�� �� ����
 * 
 * answer   38(�ʱ�ȭ) -> 46 (���� ū ���� �ִ´�) 
 * 
 * for�� ���� ���� ù �������� �� ���� sum�� �ִ´�.
 * ���⼭�� 3�� �������̹Ƿ� 12+15+11 = 38�̴�
 * 
 * */

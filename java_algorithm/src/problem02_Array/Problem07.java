package problem02_Array;

import java.util.Scanner;

public class Problem07 {
	public int solution(int n, int[] arr) {
		int answer = 0, cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				answer+=cnt; //����
				
			}
			else cnt=0; //0�̸� 0���� �ʱ�ȭ
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n,arr));
	}
}

/*
7. �������
cnt ����: 1�� ������ ����, 0 ������ 0���� �ʱ�ȭ��
sum ����: cnt�� ����

*/
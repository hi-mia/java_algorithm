package problem02_Array;

import java.util.Scanner;

public class Problem08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n]; //�⺻������ 0���� �ʱ�ȭ �Ǿ�����
		for(int i = 0; i<n; i++) {
			int cnt=1; //ó���� i�� ����� �׻� 1�̴�
			for(int j = 0; j<n; j++) {
				if(arr[j]>arr[i]) cnt++; //j ������ i���� ũ�� ��� ����
			}
			answer[i] = cnt; //i�� ����� ������
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		
	}
	
	
}

/*
 * ��� ���ϱ�
 * 
 * arr: 87 89 92 100 76
 * answer: [][][][][]
 * cnt ����
 * 
 * arr[j] > arr[i] //j�� ���� for��, ������ i
 * i=87 �϶�
 * 87 �������� ��� ��, 87<89 -> cnt++;
 * 89<92 -> cnt++, 92<100 -> cnt++, 100>76 �׳� ������
 * ���� cnt = 4;
 * 
 * answer[0] = 4
 * 
 * i=89 ���� ���� cnt=1 �� �ʱ�ȭ ��Ŵ
 * 
 * ������ �ִٸ� ���� ������ �ȴ�.
 * */

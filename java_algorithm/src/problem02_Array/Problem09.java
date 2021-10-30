package problem02_Array;

import java.util.Scanner;

public class Problem09 {
	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE; //�ִ밪 ã�ƾ��ϴ� �ּҰ����� �ʱ�ȭ
		int sum1, sum2; //sum1: ������, sum2: ���� ��
		for(int i=0; i<n; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j]; //���� �� / i=0(���� ����), j�� �ݺ�(���� ������)
				sum2 += arr[j][i]; //���� �� / j�� �ݺ�(���� ������), i=0(���� ����)
			}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2); //�� �� �� ū���� answer�� ��
			
		}//��� ���� ��
		//�밢���� ��
		sum1 = sum2 = 0; //�ʱ�ȭ
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i]; //��� �� ��ȣ�� ���� = �밢��
			//�ݴ��� �밢��, arr[i]=0�� �� arr[j]=4
			sum2 += arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2); //�� �� �� ū���� answer�� ��
		
		return answer;
	}

	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
	
}

/*
 09. ������ �ִ���
 �� ���� ��, �� ���� ��, �� �밢���� �� �� ���� ū ���� ���
 
 * 
 * */

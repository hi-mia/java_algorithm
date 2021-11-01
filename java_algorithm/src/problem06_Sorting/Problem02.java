package problem06_Sorting;

import java.util.Scanner;

public class Problem02 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) { //j�� ���� Ƚ���� �ϳ��� �۾����� ��/i���� �ϳ��� ���� ����
				if(arr[j]>arr[j+1]){//�� ���� ��, �ڰ� ������ swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}
/*
 * 02. ��������
 * 
 * 
 * arr  13 5 11 7 23 15
 * 
 * ���������� �̿��� �� ���� ���ؼ� ���������̸�(���� ũ�� �ڰ� ������)
 * swap ���ش�
 * 
 * arr   5 13 11 7 23 15
 * arr   5 11 13 7 23 15
 * arr   5 13 7 13 15 23 
 * �̷��� �ѹ� term�� ������ ���� ū ���ڰ� �� �ڷ� ����
 * ���������� �ѹ��� ���� ���� �� ���ڸ� ���ڸ� ���Ѵ�
 * 
 * 
 * */

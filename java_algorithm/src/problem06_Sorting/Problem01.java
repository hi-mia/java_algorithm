package problem06_Sorting;

import java.util.Scanner;

public class Problem01 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) { //���� ������ �� �ʿ� ����.. ������ �� ���Ƶ� �������� ���� ���� 1���ۿ� ���
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx=j; //idx�� j�� ��ü
			} //������ ���� idx���� i��°���� ���������� ���� ���� ������ �ε��� ��ȣ�� ����Ǿ��ִ�
			int tmp = arr[i]; // j�� �ƴϴ�!! i�� �ٲ۴�!!
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}

}

/*
 * 01. �������� - ���� for�� ���
 * 
 * idx���� �ʿ�
 * idx = i
 * idx���� ���� ���� ������ �ε����� �����Ѵ�
 * 
 * if(arr[j] < arr[idx])��� idx = j �� �ٲ۴�
 * j�� �� ����
 * arr[idx]�� arr[i]�� ��ȯ�Ѵ� (idx���� i�� �ε����� ����!)
 * �� �� i�� ����
 * j�� i+1���� ����
 * 
 * */

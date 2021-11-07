package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05 {
	public String solution(int n, int[] arr) {
		String answer = "U";
		//�迭 ����
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) return "D"; //�ߺ��̸� D ����
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}

/*
 * 05. �ߺ� Ȯ�� - ���ķε� Ǯ �� �ִ�, �׷��� nlogn��
 * 
 * ----------->
 * 20 25 30 33 39
 * 
 * ���� ��
 * �� ���鼭 �̿��� ���� ���ؼ� ������ �ߺ��ƴٰ� Ȯ���� �� return �ع�����
 * 
 * */

package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {

	public int count(int[] arr, int dist) { //��ȿ �Լ� / dist=distance, �Ÿ�
		int cnt = 1; // ��ġ�� ���� ������
		int ep = arr[0]; //���� ���� ��ǥ�� ���� 1���� ��ġ��(���� ���ʿ� ��ġ�ؾ� �� ���� ���� ��ġ ����)
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]-ep >= dist) {
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		//��ǥ�ϱ� �����س��� ��
		Arrays.sort(arr);
		int lt = 1; //ù ��ǥ
		int rt = arr[n-1]; //������ ��ǥ
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)>=c) { //mid�� ������ ��ȿ�ϸ�(���ϵ� �� ���� ���� c������ �̻��̶�� ��ȿ)
				answer = mid;
				lt = mid+1; //���� �� ����������
			}
			else rt = mid-1; //���� ��ȿ���� �ʴٸ� �ƴ� ���� ������(������ �� ������)
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int c=kb.nextInt(); //�� ���� ��
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, c, arr));
	}
	
}

/*
 * 10. ������ ���ϱ�(���� �˰���)
 * ���� �˰���: lt�� rt�� �� ���ؾ� �Ѵ�
 * 
 * ���� �� �� ��
 * lt: �� �� ������ �ּҰ�(1)
 * rt: �� �� ������ �ִ밪(9) / arr[n-1]
 * 
 * ������ ��ġ
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * 
 * ep: end position (���� ����� �� ���� �Ÿ��� �� ������ ��ġ�� �� �ִ��� Ȯ��)
 * 
 * lt    mid     rt
 * 1      5       9
 * 
 * mid�� ��ȿ���� �˻�: ep ���� Ȱ��
 * ep: end position (���� ����� �� ���� �Ÿ��� �� ������ ��ġ�� �� �ִ��� Ȯ��)
 * ���⼭�� mid=5(�� ������ �Ÿ�)�� �� �� ���� ��ġ ����? Ȯ��
 * (arr[i] - ep) >= mid �̾���� �� ���� ���� ���� �� �ִ�
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * ��		     ��
 * 
 * ep = 8 -> ���� 2���� ��ġ�� -> 2�� ������
 * �� �Ÿ��δ� 3������ ��ġ�� �� �����Ƿ� �� mid�� ��ȿ���� �ʴ�
 * 
 * mid=1 �̶�� �� 5���� ��ġ ���� -> 3������ ��ġ�� ����
 * 3���� ũ�ų� ������ ��ȿ�� ����
 * 
 * lt     mid     rt
 * 1      2        4
 * 
 * ep = 1 -> 4 -> 8
 * (arr[i] - ep) >= mid //2���� ũ�ų� ���Ը� ��ġ
 * 
 * |--|---|------|--|
 * 1  2   4      8  9 
 * ��	  ��	     �� 
 * 
 * cnt�� 3 ����
 * mid=2�� ��ȿ -> answer���� 2�� �����س���
 * 
 * lt         mid     rt
 * 3(mid+1)   3        4
 * 
 * mid=3�� ��ȿ�ϸ� answer=3
 * 
 * */
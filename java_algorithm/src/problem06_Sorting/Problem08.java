package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem08 { //�̺� �˻��� �ܿ�����
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr); //arr �������� ����
		int lt = 0, rt = n-1;
		while(lt<=rt) { //�̺а˻��� while������
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid+1; //mid�� �ε��� ��ȣ
				break;
			}
			if(arr[mid]>m) rt = mid-1; //ū���� ������. rt�� �۾�����(�̺а˻����� rt�� ������ �۾����� lt�� Ŀ����)
			else lt = mid+1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}

/*
 * 08. �̺� �˻� - �˰���, ������ �����ؾ��Ѵ�
 * ���ĵ� ���¿����� �̺� �˻� ����
 * 
 *      lt		mid			 rt
 *      0  1  2  3  4  5  6  7
 * arr  12 23 32 57 65 81 87 99 //�������� ����
 * 
 * mid = (lt+rt)/2
 * 
 * 
 * lt�� 0���� �ʱ�ȭ, rt�� �� ���ڸ��� (n-1)�� �ʱ�ȭ (0�� �ε������Ͷ� -1�� ���ش�)
 * �̶� mid�� 7/2 = 3
 * arr[mid] == m
 * 
 * answer�� mid+1 �̴� (�ε�����ȣ+1�� �ؾ��� ~��°�� ��)
 * 
 * arr[mid]>m  --> rt = mid-1 �� ������ �ٲ�
 * 
 *      lt	    rt  mid			
 *      0   1   2   3   4   5   6   7
 * arr  12  23  32  57  65  81  87  99
 * 
 * �˻������� �������� �پ���!
 * 
 *      lt	    rt  		
 *      0   1   2   
 * arr  12  23  32 
 * 
 * mid = (lt+rt)/2

 *      lt	mid rt  		
 *      0   1   2   
 * arr  12  23  32 
 * 
 *       lt
 *       rt  		
 *       2   
 * arr   32 
 * 
 * ����: lt, rt�� ���� ���� ����Ų��
 * �̶� mid = (2+2)/2 = 2 
 * 
 * answer = mid+1 = 3
 *
 * -----------------------------------------
 * else lt = mid+1 (arr[mid]>m�� ������ ��)
 * 
 *      	       mid	lt		   rt
 *      0   1   2   3   4   5   6   7
 * arr  12  23  32  57  65  81  87  99
 * �̷��� ��
 * 
 * */
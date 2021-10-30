package problem03_TwoPointers;

import java.util.Scanner;

public class Problem04 {
	public int solution(int n, int m, int[] arr) {
		int answer=0, sum=0, lt=0; 
		//��ƾ: �����ϰ�(rt++) - ���ϰ�(sum) - Ȯ��(sum==m)
		for(int rt=0; rt<n; rt++) { //rt�̵�, n ������ ���� �ȴ�
			sum+=arr[rt]; //sum: lt~rt������ ��
			if(sum==m) answer++; //rt���� ���ϸ� �ٷ� Ȯ������� �Ѵ�
			while(sum>=m) {
				sum-=arr[lt++]; //lt�� ���� ���� lt ����
				if(sum==m) answer++; //sum = lt~rt����
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}

}

/*
 * 04. ���Ӻκм���(������ ����)
 * 
 * � Ư�� ���� ������ lt~rt�����̴� ��� �����ϸ� ��
 * lt(�� ����), rt(�� ������)
 * lt~rt������ ���ӵ� ���� Ư������ 6�� �Ǵ°�? Ȯ�� �˰���
 * 
 *       rt
 *       lt  
 * arr	  1 2 1 3 1 1 1 2
 * 
 * sum   1 (�ʱⰪ)
 * 
 * rt, lt�� ó���� 0�� ����Ű�� ����(�迭�� ù ��ġ��)
 * sum���� ó���� lt�� ����Ű�� ���� ����
 * sum = lt~rt������ ���� ��(�߿�)
 * 
 * rt���� ���ϰ� ���� �Ʒ��� �۾��� �� �ؾ���
 * sum == m ?
 *  1     6
 *  lt�� 0 ����, rt 1�̵�;
 *  rt 1�̵��ϰ� ���ϰ� sum==m? Ȯ�� --�ݺ� 
 * 
 * �̵��ϴٺ��� sum(7) == m(6)�� �Ǿ sum>m�� ��찡 ����
 * �̷� ���� lt�� ���� ������ lt�� 1 �̵���Ų��.
 * lt���� ���൵ sum == m? ���� Ȯ������� �Ѵ�.
 * sum==m�� �� �� sum�� ������ ���� lt~rt����, �� arr[1~3]�����̴�.
 *
 * sum==m�� �Ǹ� ī������ ���ش�
 * �� �� lt 1����, lt�� ���ش� -> sum==m Ȯ��? -> X�� rt 1����, rt�� ������
 * sum==m Ȯ���ؼ� O�� ī��������, ���ǰ��� �ݺ�... rt�� ������ �����ϸ� ����
 * 
 * */
 
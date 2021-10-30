package problem03_TwoPointers;

import java.util.Scanner;

public class Problem06 { //������ �ٽ� ����..
	public int solution(int n, int k, int[] arr){
		int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}//����
			//������ �� �� ���̸� ���Ѵ�
			answer=Math.max(answer, rt-lt+1); //answer�� ���� �� �� �ִ밪
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}

}

/*
 * 06. �ִ� ���� ���Ӻκм���(�� ������)
 * arr[], answer, cnt �� ���� �ʿ�
 * answer�� ���Ӽ����� ����(rt-lt+1) / ���� ���� ������ �ʱ�ȭ(�ִ밪 ã�ƾ��ϴϱ�)
 * cnt: 0�� 1�� �ٲ� Ƚ�� / k�� ������ �ȵȴ�: cnt>k
 * 
 *      rt
 *      lt
 * arr   1  1  0  0  1  1  0  1  1  0  1  1  0  1
 * 
 * 
 * answer 0 -> 1 -> 2 -> 3
 * 
 * cnt              1 -> 2
 * 
 * 
 * ��������: rt�� �տ� �������� lt�� �� �ڸ� �Ѿư�
 * rt�� �տ� ���� ���鼭 0->1�� �ٲ�, lt�� �ڿ��� �Ѿư��鼭 rt�� �ٲ���� ���ڸ� �ٽ� �����·� �ٲ�(1->0)
 * 
 * rt�� �Ź� ������ ������ ���Ӽ����� ����(rt-lt+1)�� ���Ѵ�
 * rt�� 0�� ������ 1�� �ٲٰ� cnt++;
 *(rt-lt+1) ��� ���� cnt>k�� ������ Ȯ���ؾ� �Ѵ� (���⼭ k=2)
 * cnt(3) > k(2)�� false�� �Ǿ lt�� ������Ų��. 
 * lt�� rt�� �ٲ۰� �ǵ����� ����, 1->0���� �ǵ�����.(���� 1�̾��� �͵��� �׳� ������)
 * lt�� �ٲٰ� ����. 1->0 �ٲ� �� lt 1�̵�, �� �ڿ� ����(rt-lt+1)�� ���
 * 
 * ...rt�� ������ ���� ����
 * 
 * */
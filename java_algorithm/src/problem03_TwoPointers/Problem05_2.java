package problem03_TwoPointers;

import java.util.Scanner;

public class Problem05_2 {
	public int solution(int n) { //n=15�� ��
		int answer = 0, cnt=1; //cnt: ���ӵ� �ڿ����� ����
		n--; //n���� 1�� �� ��, n=14
		while(n>0) {
			cnt++; //cnt=2
			n=n-cnt; //n-2 -> n���� �� 1�� 2�� ��, n=12�� ��
			if(n%cnt==0) {  //���� n�� cnt�� ������ �������� 0�̸� ���ӵ� �ڿ��� ����, answer�� �߰�
				//System.out.println(n + " " + cnt);
				answer++;
			}
		}//while
		
		//while�� ���Ƽ� cnt=3�� �� n=12, �̻��¿��� (12-3)/cnt(3). 15/3(X) / 3�� ���� �й�
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem05_2 T = new Problem05_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}

/* 
 * 05. ���ӵ� �ڿ����� ��(����)
 * 
 * N=15�� ��
 * 
 * [] + [] //2���� ���ڷ� ����
 *  1   2  //�־���, �� �� (15-1-2)/2�� ��, 12/2=6 (������ ����)
 *  6   6  //�� 6�� ���� �����ϰ� �������, �׸��� ���Ѵ�
 * =7  =8
 *  
 *  �������� �� �������� Ȯ���Ϸ��� N���� 2���� ���ڸ� �� ���� 2�� ������ �������� ��
 *  
 * [] + [] + []
 *  1   2    3  //15-6=9 / 3���ϱ� 3���� ������ �������� (9/3) ���� �����ϰ� �й�
 *  3   3    3
 * =4  =5   =6 
 * 
 * [] + [] + [] + []
 *  1   2    3    4 // 15-10=5 / 5/4: ������������ �ʴ´�
 * 
 * [] + [] + [] + [] + []
 * 1    2    3     4    5 // 15-15=0 / 0/5=0
 * 
 * */

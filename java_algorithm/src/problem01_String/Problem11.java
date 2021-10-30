package problem01_String;

import java.util.Scanner;

public class Problem11 {
	public String solution(String s) {
		String answer = "";
		s=s+" "; //�� �ڿ� ���� �߰����ش�
		int cnt=1;
		for(int i=0; i<s.length()-1; i++) { //���� �������� i�� �����ؼ� s.length()-1
			//��
			if(s.charAt(i)==s.charAt(i+1)) cnt++; //������ cnt����
			else { //�ٸ��� 
				answer+=s.charAt(i); //answer�� ����
				if(cnt>1) answer+=String.valueOf(cnt); //cnt����: 1���� Ŭ���� Stringȭ���Ѽ� answer�� ����
				cnt=1;
			}	
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 11. ���ڿ� ����
 * 
 * 	i���� 0 1 2 3 4 5 6 7 8 9 10 11
 * s�迭  K K H S S S S S S S E  '' (11��°�� ���� �ִ°� �� �ؾ���!)
 * 
 *i=0�� �� cnt = 1�� �ʱ�ȭ (ó�� ������ �� ������ ���� 1���� �ֱ� ����)
 *��: i == (i+1) -> cnt++; // cnt = 2
 *	   i != (i+1) -> answer = k (���� �ٸ��� String�� i ���� ������)
 * 
 * �������� cnt>1 �̸� cnt�� Stringȭ ���Ѽ� �ڿ� �ٿ��ش�
 * 
 * String answer = K2
 * 
 * -> cnt = 1�� �ٽ� �ʱ�ȭ ��, i++; (i=2)
 * ���ڰ� ���� �ٸ��� answer�� ������
 * String answer = K2H
 * 
 * -> cnt = 1�� �ʱ�ȭ, i=3
 * i == i+1 -> cnt=7;
 * 
 * answer = K2HS7
 * 
 * -> cnt=1�� �ʱ�ȭ, i++ (i=10)
 * i != i+1 (10vs11 �ε� 11�� ���ڸ� �־���� �� ����)
 * answer = K2HS7E
 * */

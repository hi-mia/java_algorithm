package problem01_String;

import java.util.Scanner;

public class Problem10 {
	public int[] solution(String s, char t) { //�迭 ����
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i = 0; i<s.length(); i++) {
			//��
			if(s.charAt(i)==t) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		} // -> �������� for�� ����, ���� �ݴ������� �� ����
		p = 1000; //p �ٽ� �ʱ�ȭ
		// <- �������� for���� ����
		for(int i = s.length()-1; i>=0; i--) { //10�� �ε������� �����ϴ� ���̴� 11�̴�
			if(s.charAt(i)==t) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); //*�������� p �߿��� ���� ���� �־��
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //���ڿ� ����
		char c = kb.next().charAt(0); //���� 1���� ����
		for(int x : T.solution(str, c)) {
		System.out.print(x + " ");
		}
	}
}

/*
 * 10. ���� ª�� ���ڰŸ�
 * 
 * teachermode  e(���õ� ����)
 * 
 * s�迭 teachermode
 * �ڱ� �ٷ� ���ʿ� �ִ� ���ù���(e)�κ����� �Ÿ� ����
 * 
 * answer�迭(int�迭): ������ ���ڰ� e�κ��� ������ �Ÿ�
 * 
 * p = 1000 //p�� �Ÿ�, �ʱ�ȭ �� ���� ũ�� ��´�
 * e�� ������ p=0�� ��(e�� �ڱ��ڽŰ��� �Ÿ��ϱ� 0�̴�)
 * ��ĭ �� ���� p+1 -> 1�� ��
 * 
 * s: 		   t e a c h e r m o d e
 * answer:  1001 0 1 2 3 0 1 2 3 4 0 = p
 * p = �� ���ڰ� '���ʿ� �ִ�' e�κ����� �Ÿ����� ����
 *
 * 
 * for���� 0->10(����������) / 10->0(��������)���� 2�� ���ƾ� �Ѵ�.. 
 * �׷��� ��Ȯ��
 * 
 * ->
 * t e a c h e r m o d e
 * 					  <-
 * 10 -> 0(�������� �� ��)�� ���� '�����ʿ� �ִ�' e�κ����� �Ÿ��� ����
 * 
 * s		t e a c h e r m o d e
 * answer	1 0 2 1 1 0 4 3 2 1 0 = p (�������� �� ��)
 * 
 * ������ �ִ� 4�� p�� �� ���� ������ answer�� ��ü�ؾ� ��(�����̳� ������ e �� ª�� �Ÿ� ����)
 * ���� 
 * s		t e a c h e r m o d e
 * answer   1 0 1 2 1 0 1 2 2 1 0 => ���
 * 
 * 
 * */

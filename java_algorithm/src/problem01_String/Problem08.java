package problem01_String;

import java.util.Scanner;

public class Problem08 {
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]",""); //A-Z�� �ƴϸ� ����ȭ ���Ѷ�
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES"; //���� ���ڿ�(s) = �������� ���ڿ�(tmp)
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}

/*
 * 08. ��ȿ�� �Ӹ����(replaceAll ���Խ� �̿�)
 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� ��
 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
���ĺ� �̿��� ���ڵ��� �����մϴ�.
 * 
 * 
 * 
 * */

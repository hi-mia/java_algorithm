package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>(); //���� ��ü ����
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x); //���� ��ȣ�� ���ÿ� �ִ´�
			else { //�ݴ� ��ȣ ������
				if(stack.isEmpty()) return "NO"; //���ÿ� ����ֳ�? �׷��� �߸��� ��ȣ(�ݴ� ��ȣ�� ����)
				stack.pop(); //�� ��� ������ �� ������ ������
			}
		}
		if(!stack.isEmpty()) return "NO"; //stack�� ���� ���� �ִٸ� -> �߸��� ��ȣ(���� ��ȣ�� ����)
		return answer;
	}

	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 01. �ùٸ� ��ȣ - ������ ��ǥ ����
 * ��ȣ�� ������ ���þ��� ������!
 * ���� = ������(�Ա��� �ⱸ�� �� ����)
 * Last In First Out
 * 
 * ť: ���ð� �ݴ�
 * First In First Out
 * 
 * ���� ��ȣ-�ݴ� ��ȣ ¦���� �� �¾ƾ� �Ѵ�
 * 
 * ���� ��ȣ ������ ���ÿ� �ִ´�(push)
 * �ݴ� ��ȣ ������ - �ݴ� ��ȣ�� ���� ��ȣ ¦�� ������ �� ��ܿ� �ִ� -> �� ���� ���� ��ȣ�� pop ��Ų��
 * 
 * push(): ���ÿ� �ִ´�
 * pop(): ���ÿ��� ������ 
 * isEmpty(): ������ ����ִ°� Ȯ��
 * 
 * �ùٸ� ��ȣ��� ���ÿ��� ������ ���� ��ȣ�� �־�� �Ѵ�
 * = �ݴ� ��ȣ�� �����µ� ������ ��������� �߸��� ��ȣ�̴�
 * = �� �����µ� ������ ��������� ������ �߸��� ��ȣ�̴�
 * 
 * 
 * */

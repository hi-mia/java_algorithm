package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem02 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		//str Ž��
		for(char x : str.toCharArray()) {
			if(x==')') { // �ݴ� ��ȣ ������ pop �Ѵ�
				//pop: ������ ���� ����� ���� ������, ���� ���� return�Ѵ�
				//System.out.println(stack.pop());
				while(stack.pop() !='('); //���´µ� ���� ��ȣ�� �����Ǿ ����� 
			
			}
			else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer += stack.get(i); //answer�� ����
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 02. ��ȣ���� ���� - ��ȣ�� ������ �����ȱ� �����̴�
 * 
 * ���ÿ� ���� ��ȣ�� ���ĺ��� �ִ´� / '(' A B '(' B C ...
 * 
 * �ݴ� ��ȣ�� ������ ������ ��ܿ� �ִ� ���� ��ȣ�� ¦���̴�.
 * �̶� ���°�ȣ-�ݴ°�ȣ ¦�� ���̿� �ִ� ���ĺ����� (BC) ��ȣ �ȿ� �ִ� ���ĺ��̴�.
 * �� ���� �����Ѵ�: �ݴ� ��ȣ�� ������ ¦���� ���� ��ȣ ���� ������ pop ��Ų��
 * 
 * stack.size() : ������ ������ ũ��
 * 
 * */

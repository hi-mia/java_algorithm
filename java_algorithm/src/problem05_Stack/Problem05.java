package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem05 {
	public int solution(String str) {
		int answer=0;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') stack.push('('); //���� ��ȣ�� ���ÿ��� Ǫ��
			else { //�ݴ� ��ȣ���
				stack.pop(); // � �ݴ� ��ȣ�� �ڱ� ¦���� ���� ��ȣ�� pop ��Ų��
				if(str.charAt(i-1)=='(') answer+=stack.size(); //�ٷ� ���� ������ ���� ��ȣ��� �������̴�, answer�� stack�� ����� ������ ����
				else answer++; //����� �ݴ� ��ȣ�� answer�� 1 ����
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 05. �踷���
 * 
 * ���� ��ȣ ������ ���ÿ��� ������ push
 * �ݴ� ��ȣ�� ������ �������� �ݴ� ��ȣ���� �踷��� ���� �˸��� �ݴ� ��ȣ���� �˾Ƴ����Ѵ�
 * -> �ٷ� �� �ε����� Ȯ���Ѵ�.
 * �ݴ� ��ȣ �ٷ� ���� ���� Ȯ��
 * �ݴ� ��ȣ �ٷ� ���� ���� ���� ��ȣ�� -> ������(����⸦ �ڸ���)
 * �ƴϸ� ������� (������� ���� �������� ������� �ʴ´�)
 * 
 * �ݴ� ��ȣ ������ �� ������ ���� ��ܿ� �ִ� ���� ��ȣ�� �� �ݴ� ��ȣ�� ¦���̴�
 * �������� ���� ��ȣ�� stack���� pop ��Ų��
 * �� �� ���ÿ� ���� ���� ��ȣ���� ������� ���� ��ȣ���̴�
 * ���� ��ȣ���� 3����� ����Ⱑ 3���� �ִٴ� ��, ����� 3���� �ڸ���
 * 
 * answer�� �߸��� �踷��� ������(stack.size() �ǹ���)
 * answer���� stack.size�� �����ش�
 * 
 * ������� ���� �ٴٸ��� ���� ������� ���� ����(���� ¥����. ���⼭�� ������ ���� �� �޴´�)
 * �� ������� ���� ��ȣ�� stack���� pop ��Ų��.
 * �׸��� answer�� +1�� ���ش�(����� 1���� ���� �����ϱ�)
 * 
 * 
 * */

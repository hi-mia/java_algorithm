package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem04 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) { //���� ���� ����? ������?
			if(Character.isDigit(x)) stack.push(x-48); //���ڶ�� ���ڸ� �ִ´�(���� ���ڴϱ� �ƽ�Ű�ѹ��� ����ؼ� ���ڷ� �־��ش�)
			else { //�����ڶ�� ���ÿ��� 2�� ������
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 04. ������ ���� - �ַ� �ڵ����ͺ� ����
 * ������: ���ڸ� ���ΰ� ���길 �������� ������ ��
 * 5+3 -> 53+
 * 5-3 -> 53- //������ ������ �� ���� ���ϴ� ���ڴ� ���ʿ� �ִ� ���� 5�̴�
 * 
 * ���ڸ� ���ÿ��� �ִ´�(push)
 * �����ڸ� ������ ���ÿ��� ������
 * 
 * stack
 * 2
 * 5
 * 3
 * 
 * stack     lt(�ι��� ������ ��)     rt(ù��° ������ ��)
 *			 5 				+	  2
 * 7
 * 3
 * 
 * rt�� lt�� ������ ������ �� �� ��� ���� stack�� �ִ´�
 * ����/������ �� ���ϴ� ��: lt (���� ��� 5-2�� �ȴ�)
 * 
 * ������ 12: stack.get(0)�� �Ǹ� ����������
 * 
 * */
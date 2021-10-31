package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {
	public String solution(String need, String plan) { //need: �ʼ�����, plan: ��ȹ��
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x); //ť�� �ʼ����� ������
		for(char x : plan.toCharArray()) {//���⼭ x�� ��ȹ�� ���� ���� �ϳ��ϳ�
			if(Q.contains(x)) { //x��� ������ ť�� ������
				if(x!=Q.poll()) return "NO"; // x�� ť�� �� ���� �ڷ�� �ٸ��ٸ�(poll: ������ ��)
			}
	
		}
		if(!Q.isEmpty()) return "NO"; //ť�� ���� �����ִ� = �ʼ����� �̼� �������� "NO" 
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}

/*
 * 07. �������� ����
 * �ʼ����� ������� ��Բ��� ¥�� �ȴ�. �� ������ ����� �� NO �ϸ� �ȴ�
 * 
 * �ʼ����� ����(CBA)�� ���ĺ��� �ߺ��Ǿ ���� �ʴ´�!
 * ������ȹ�� ����(CBDAGE)�� ���ĺ� �ߺ� ����
 * 
 * 1) ť���� �ʼ��������� �־����� ������ �־�д�(�̸� offer ��Ų��)
 * 2) ������ȹ���� �ϳ��ϳ� Ž���Ѵ�
 * 3) ������ȹ���� ����(C)�� �ʼ���������(ť�� �ִ���) Ȯ���Ѵ� -> Q.contains(x)
 * 4) �ִ��� Ȯ���ϰ� ������ Ȯ���Ѵ� 
 * �ʼ� �����̰� �� �հ� ��ġ�ϸ� �� ���� �� �ȴ� -> ť ���� C�� pull ��Ų��
 * �� �ʼ����� ����ٸ� ť���� ������ϱ� ��������+������ Ȯ���� �ȴ�
 * 
 * ť�� �־ �� ���� �ƴ϶�� return NO�ؼ� ������ �ȴ�
 * ex) 
 *    ť
 *-------------
 *  C B A
 *-------------  
 * C D K A E -> A�� ť�� �־ ������ȹ�������� A�� ���� �� ť�� �� �տ� �ִ°� B�� �ȵȴ�
 * 
 * �Ǵ� �� ���Ҵµ� ť�� ���𰡰� �������� return NO�� �Ѵ�
 * 
 * 5) �� ���� ���� Ž��, ���� ���� �ݺ�...
 * 
 * */

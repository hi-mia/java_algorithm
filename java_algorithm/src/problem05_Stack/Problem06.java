package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem06 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>(); //ť ��ü ����
		for(int i=1; i<=n; i++) Q.offer(i); //1���� n���� ť���� �̸� ����
		
		while(!Q.isEmpty()) { //������� ������ ���̶� ���� ��������� �����Ǽ� �����
			for(int i=1; i<k; i++) Q.offer(Q.poll()); //�տ� �� ������ �ڿ��� �ٽ� �־��ش�, �� �� return ����
			Q.poll(); //���� k�� �׳� ����
			if(Q.size()==1) answer=Q.poll(); //������ �ϳ� ������ �װ� ��
		}
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}

/*
 * 06. ���ֱ��ϱ� - 'ť'��� �ڷᱸ�� ���
 * ť: FIFO (First In First Out)
 * 
 * offer(): ť���� �ڷ� ����ִ� �޼���
 * poll(): ť���� �ڷḦ ������ �޼��� (������ ���� return �޴´�)
 * peek(): ť���� ���� �տ� �ִ� ���� Ȯ�θ�(������ �ʴ´�)
 * size(): ť�� �� ���� �ִ���
 * contains(x): x�� ������ ��, ������ ����
 * 
 * 
 * k=3 -> 3�� ��ģ ����� ���ؼ� ������ ���̴�
 * ť���� 1~8������ ��ȣ�� �־��ش�
 * ---------------------
 * 1 2 3 4 5 6 7 8
 * ---------------------
 * k-1�� ��ŭ�� �տ��� ���� �� �ڷ� ������(k-1����ŭ poll�� �ڿ� �ڷ� offer�Ѵ�)
 * k�� �׳� poll ���ѹ�����(3�� ť���� �׳� ����)
 * �� ���� �ݺ�(ť�� ����� 1�� �� ������ �ݺ�)
 * 
 * ť�� while������ ������ ť�� ��������� ���߰� �Ѵ�
 * size�� 1�� �Ǹ� �� ���� answer���� poll ��Ų��, �׸��� �����
 *
 * */

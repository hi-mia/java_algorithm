package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person{
	int id; //ó�� ��� ��� �� ����
	int priority; //���赵
	public Person(int id, int priority) { //������ ���� ��ü ������ �� �ִ´�, �ʱ�ȭ
		this.id = id;
		this.priority = priority;
	}
}

public class Problem08 {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>(); //Person�� ť�� ����
		for(int i = 0; i<n; i++) { //for�� ���鼭 arr�� �� Ž��
			Q.offer(new Person(i, arr[i])); //Person ��ü�� ����� (id, priority)
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll(); //ù��° ��� ���� tmp���� ���´�
			//tmp��� ȯ�ڰ� ���� ���� �� �ִ��� Ȯ�� ���� for���� ���Ҵ�
			for(Person x : Q) { 
				if(x.priority>tmp.priority) { //x�� �켱������ ���� ����ް��� �ϴ� tmp�� �켱�������� ũ�ٸ�
					Q.offer(tmp); //�� ��� ��������� �ȵǴ� �ڿ��� �־������
					tmp = null;
					break;
				}
			}
			if(tmp != null) { //(x.priority>tmp.priority)�� ���� �ƴϾ��� -> tmp�� ������� �� �ִ�
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //����� ȯ�ڼ�
		int m = kb.nextInt(); //�� ����?
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt(); //�켱����/���赵 �Է¹���
		}
		System.out.println(T.solution(n, m, arr));
	}
}

/*
 * 08. ���޽�
 * ���� ������� �������
 * �׷��� �ڱ⺸�� ���޵��� ���� ����� ������ �ڱ�� ����� �� �ڷ� ����
 * 
 * �Է¿���1 (5 2)
 * 
 * ť ��� �ڷᱸ��
 * -----------------------------------------
 * (0,60)  (1,50)  (2,70)  (3,80)  (4,90)
 * -----------------------------------------
 * (id, priority) // (�� ����, ���赵)
 * �� �ΰ��� �ν��Ͻ� ������ �޴� person�̶�� class ���� �� ť���� ��ü�� �־� ���� ����
 * 
 * ���赵�� ���� ����� ť�� �� �ڷ� �־��ش�
 * -----------------------------------------
 * (2,70)  (3,80)  (4,90)  (0,60) (1,50)
 * -----------------------------------------
 * 
 * (�ݺ�)
 * 
 * -----------------------------------------
 * (4,90)  (0,60) (1,50) (2,70)  (3,80)  
 * -----------------------------------------
 * answer�� 1�� �־��ش�(ù��°�� ���� �޴´�) / answer�� ī����
 * (4,90)�� id �ѹ��� �츮�� ã�� 2���� Ȯ��, �ƴϸ� �׳� ������
 * (4, 90)�� ť���� poll ���ش�
 * 
 * 
 * -----------------------------------------
 *  (3,80) (0,60) (1,50) (2,70)    
 * ----------------------------------------- 
 * answer = 2�� ��( (3,80)�� �ι�°�� ����޴´�)
 * (3,80)�� 2�� �ƴϴϱ� �׳� poll
 * 
 * -----------------------------------------
 *  (2,70) (0,60) (1,50)     
 * -----------------------------------------
 * 
 * answer = 3,
 * (2,70)�� id=2�ϱ� ���⼭�� answer�� return (answer=3)
 * 
 * */

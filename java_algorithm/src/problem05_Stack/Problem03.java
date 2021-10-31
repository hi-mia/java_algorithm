package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new 	Stack<>();
		//�ùķ��̼�
		//moves Ž��
		for(int pos : moves) { //pos: ũ������ ��ġ, pos�� �������� ũ������ ������ ���� �߰�
			for(int i=0; i<board.length; i++) { //2���� �迭�� �� ũ��
				if(board[i][pos-1]!=0) { //���� �������� ������ �߰� �ȴٸ�
					int tmp = board[i][pos-1];//���� ��ȣ�� �ִ´�
					board[i][pos-1]=0; //���� ���� �� 0���� �����
					if(!stack.isEmpty() && tmp==stack.peek()){//������ ��ܰ� ���� �������� �� - ������ ��Ʈ�����°�?
						answer += 2; //���� 2���� ��Ʈ�����ϱ�
						stack.pop(); //���� ����� �� ������
					}
					else stack.push(tmp); //���� �ٸ��� ���ÿ��� ���� ���� �ִ´�
					break; //for���� �����
				}
			
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) { //�������� board���� �޾Ҵ�
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt(); //�����̴� Ƚ��
		int[] moves = new int[m]; //moves �迭 �������� �����
		for(int i=0; i<m; i++) moves[i] = kb.nextInt();
		System.out.println(T.solution(board, moves));
	}


}

/*
 * 03. ũ���� �����̱�(īī��)
 * 
 * 2���� �迭: 0�� �ε�������
 * 2���� �迭�� ��ũ��: board.length
 * 2���� �迭�� ��ũ��: board[0].length
 * 
 * board[i][pos-1]
 * 
 * 2���� �迭�� for������ ���ٰ� ������ �߰ߵǸ� stack�� �ִ´�
 * �̶� stack�� ���� ���� �ִ� ������ ������ ���� ������
 * 4��° ���� �������� �� ���� ���� ��ġ�� 4->0���� �ٲ��ش�
 * 
 * ũ������ �������� ��Ȳ -> ������ �߰ߵǾ ���� �ϳ��� ������ ���ÿ� ������
 * for���� ���� �ȵȴ�, ���� ���� �Ʒ��� �ִ� ������ �� ������ �ȵȴ� -> break �ɱ�
 * (ũ������ ���� �ϳ� ������ �ö� ������.. �� �Ʒ����� ���� �̴°� �ƴϴ�)
 * ���� �ϳ� ������ stack�� �ְ� for���� break ���ش�!
 * 
 * ũ���� �̵��ؼ� ������ �߰� -> ���� ��ܿ� �ִ� ������ '��'�Ѵ� (ũ������ ���� ������ �ȵȴ�!)
 * ������ �ʰ� ��: ������ ���� ��ܿ� �ִ� ���� return �޴� �Լ� peek()
 * 1) ���� ������ ������ ���ÿ� �ִ´�, ���� ������ 2���� �迭���� 0���� ó��
 * 2) ���� ���� ������ ������ ���� ������ 0���� ó��, ���� ���� ���� pop ��Ŵ
 * (���� ���� ������ ���ÿ� ���� ���� �׳� ���� ����ִ��Ÿ� pop ��Ų��)
 * -> answer+=2 (�ѹ��� 2���� ��Ʈ�����ϱ�)
 * 
 * pop(): ���� ����� ���� ���� �ڿ� �����´�
 * peek(): ���� ����� ���� �������⸸ �Ѵ�(������ �ʴ´�)
 * */

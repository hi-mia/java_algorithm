package problem02_Array;

import java.util.Scanner;

public class Problem11 {
	public int solution(int n, int[][] arr) {
		int answer = 0, max=Integer.MIN_VALUE; //�ʱ�ȭ, �ִ밪 ���ϴ� max
		for(int i = 1; i<=n; i++) { //1���� n�� �л����� ���� i(�л�)
			int cnt = 0;
			for(int j=1; j<=n; j++) { //i�� �л��� ���� ���� j�� �л��� �� �� �ִ°�
				for(int k=1; k<=5; k++) { //1~5�г� ������
					//��
					if(arr[i][k]==arr[j][k]) { //i�� �л��� k�г��� �ݰ� j�� �л��� k�г� ���� ������
						cnt++; //i�� �л��� ���� ���� j�� �л� ��
						break; //�ߺ� ī��Ʈ ����
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i; //�� �ִ밪�� ����� i�� �л��� ����
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6]; //1������ ���:[n+1], 1~5�г� ���:[6] 
		for(int i=1; i<=n; i++) { //i�� �л� ��ȣ
			for(int j=1; j<=5; j++) { //j�� 1~5�г�
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
	
}

/*�ӽ� ���� ���ϱ� - 3�� for�� ���
 * 
 * for i (1~5) - n(���)
 *   for j (1~5) - n(���)
 *     for k (1~5) - �г�
 * 
 * i=1 ������ �� j=1,2,3,4,5
 * -> i=1�� �л��� ���� ���� �ߴ� j�� �л�(j=1~5)�� �� ���ΰ� ī����
 * j�� �л��� i�� �л��� ���� ������ Ȯ���ϱ� ���� �ȿ��� k �ݺ����� ����
 * 
 * ���ȣ = �л� ��ȣ(i)
 * a[i][k] == a[j][k] cnt++; break;
 * a�� i�� �л��� k�г�� a�� j�� �л��� k�г��� ���� ������?
 * ������ cnt++;
 * �ڱ� �ڽ��� ���� ���ΰ� ī��Ʈ�ص� ���� ��� ����(���� ���� �л� ã�� �Ŷ�)
 * 
 * �л����� ���� �Ŷ� 3�� �л��� 4�� �л��� 2�� �������� �Ǹ�
 * 2�� ī��Ʈ���� ���� 1���� ī��Ʈ�ؾ� �Ѵ�
 * �� �л� ������ ī��Ʈ�ϸ� �ȵȴ� -> break �ɾ���� ��
 * 
 * */
 
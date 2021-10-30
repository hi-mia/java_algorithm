package problem02_Array;

import java.util.Scanner;

public class Problem05 {
	public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1]; //�ε�����ȣ n���� ����
		for(int i=2; i<=n; i++) { //2���� n���� ����
			if(ch[i]==0) { //�Ҽ���� answer++
				answer++;
				//i�� ����� üũ
				for(int j=i; j<=n; j=j+i) ch[j] = 1; 
				//j=j+i :j�� i�� ����� ���ƾ��ϴ� i�� ����
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}

}


/* �Ҽ�(�����佺�׳׽� ü) 
 * ch[] �迭�� ����ִ� ���ڵ� ���鼭
 * i++ (i=���)
 * 2�� ������� üũ(2�� ����� �Ҽ��� �ƴ�)
 * 3�� ������� üũ(3�� �Ҽ��� ī��Ʈ �� 3�� ��� �� ����)
 * 5�� ������� üũ(5�� �Ҽ��� ī��Ʈ �� 5�� ��� �� ����)
 * */
 
package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {
	public String solution(int n, int[] a, int[] b){
		String answer = "";
		for(int i = 0; i<n; i++) {
			if(a[i]==b[i]) answer+="D";
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer+="B"; //�������� B�� �̱�� ���
			
			
		}
		return answer;

	}
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) { //a�� �� ���������� ������ a�迭�� ����
			a[i] = kb.nextInt();
		}
		for(int i = 0; i < n; i++) {//b�� ����
			b[i] = kb.nextInt();
		}
			for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
	}
}

/*
3. ���� ���� ��
����
A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. 
��� ��쿡�� D�� ����մϴ�.
����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.

*/

/*
 Ǯ��
 if A == B (���)
 else if A=1&B=3	(A�� �̱�� ���� �� 3����, ����/����/��)
 else if A=2&B=1
 else if A=3&B=2 //A�� �̱�� ���
 else  //�ƴϸ� B�� �̱�
 
 */
 
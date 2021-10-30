package problem02_Array;

import java.util.Scanner;

public class Problem12 {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for(int i = 1; i<=n; i++) { //i-j ¦ ����
			for (int j = 1; j<=n; j++) {
				int cnt = 0;
				for(int k = 0; k<m; k++) {//�� ¦�� ����-��Ƽ ���? / k=0~m-1����
					int pi=0, pj=0;
					for (int s=0; s<n; s++) {
						if(arr[k][s]==i) pi=s; //�迭���� �� �л� ��ȣ(i) ã���� �� �� �л� s���̴�
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++; //����� �ռ����� ���ڰ� ����, ������ �� ����
				}
				if(cnt==m) { //��� �׽�Ʈ(m)���� pi<pj �����ϸ� answer++
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n]; //2���� �迭 ����
		for(int i=0; i<m; i++) { 
			for(int j=0; j<n; j++) { 
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}

/*���丵 - ������ �迭 �̿� 4�� for��
 * 
 * n=4, m=3 (m=�׽�Ʈ ����)
 * ����-��Ƽ�� �Ǵ� �� ������ �� Ȯ���� - for�� i,j�� ����
 * for i = 1~4 (n=�л� ��ȣ)
 *  for j = 1~4 (n=�л� ��ȣ) // ¦ ������ �ִ� �� ��찡 j���� ����
 * 	  for k = 0~2 (0�� �׽�Ʈ���� m�� �׽�Ʈ ������, k�� �׽�Ʈ��ȣ)
 * 		for s = 0~3 (s�� ���)
 * 		   if (arr[k][s] == i) pi = s; //p: position, pi=i�� �л��� ���
 * 		   if (arr[k][s] == j) pj = s;
 * 
 * for s�� ������ if(pi<pj) cnt++; //ù��° �׽�Ʈ ���.. ���� �׽�Ʈ �˻�
 * 
 * (i, j)�� ¦��, i�� j�� ����-��Ƽ ����? => k�� ��
 * arr[k][s] == i : i��° �л��� k��° �׽�Ʈ���� ���s
 * 
 * */
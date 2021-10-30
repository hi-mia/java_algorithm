package problem02_Array;

import java.util.Scanner;

public class Problem10 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public int solution(int n, int[][] arr) {
		int answer = 0; //���츮 ���� count
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true; //���츮���� �Ǻ�
				for(int k=0; k<4; k++) { //4���� Ž��
					int nx = i+dx[k];
					int ny = j+dy[k];
					//��찪�� �̸� �� ������ �Ÿ���(nx~ny<n)
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) { //4���� �� �ϳ��� �� ũ�ٸ�
						flag = false; //���츮�� �ƴϴ�
						break;
					}
					
				}
				if(flag) answer++; //���츮�ϱ� ī����
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
	
}

/*10. ���츮
 * 
 * ���� ���ڵ� �� �ǰ� ū ���ڸ� ����
 * �����ڸ��� 0���� �ʱ�ȭ�Ǿ��� = ������ �� ����, ���� �� �۴�
 * 
 * �ʱ�ȭ, k �ݺ������� ���� ��
 * int[] dx = {-1, 0, 1, 0};
 * int[] dy = {0, 1, 0, -1};
 * 
 * nx(�ప) = i + dx[k]
 * ny(����) = j + dy[k]
 * arr[nx][ny]
 * 
 * dx, dy���� �����¿� ���� ��
 * */
 
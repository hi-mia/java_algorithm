package problem02_Array;

import java.util.Scanner;

public class Problem10 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public int solution(int n, int[][] arr) {
		int answer = 0; //봉우리 개수 count
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true; //봉우리인지 판별
				for(int k=0; k<4; k++) { //4방향 탐색
					int nx = i+dx[k];
					int ny = j+dy[k];
					//경곗값은 미리 안 보도록 거른다(nx~ny<n)
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) { //4방향 중 하나가 더 크다면
						flag = false; //봉우리가 아니다
						break;
					}
					
				}
				if(flag) answer++; //봉우리니까 카운팅
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

/*10. 봉우리
 * 
 * 같은 숫자도 안 되고 큰 숫자만 가능
 * 가장자리는 0으로 초기화되었다 = 무조건 더 낮다, 값이 더 작다
 * 
 * 초기화, k 반복문에서 도는 것
 * int[] dx = {-1, 0, 1, 0};
 * int[] dy = {0, 1, 0, -1};
 * 
 * nx(행값) = i + dx[k]
 * ny(열값) = j + dy[k]
 * arr[nx][ny]
 * 
 * dx, dy통해 상하좌우 값과 비교
 * */
 
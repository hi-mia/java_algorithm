package problem02_Array;

import java.util.Scanner;

public class Problem11 {
	public int solution(int n, int[][] arr) {
		int answer = 0, max=Integer.MIN_VALUE; //초기화, 최대값 구하니 max
		for(int i = 1; i<=n; i++) { //1부터 n번 학생까지 도는 i(학생)
			int cnt = 0;
			for(int j=1; j<=n; j++) { //i번 학생과 같은 반인 j번 학생은 몇 명 있는가
				for(int k=1; k<=5; k++) { //1~5학년 떄까지
					//비교
					if(arr[i][k]==arr[j][k]) { //i번 학생의 k학년의 반과 j번 학생의 k학년 반이 같으면
						cnt++; //i번 학생과 같은 반인 j번 학생 수
						break; //중복 카운트 제거
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i; //이 최대값을 만드는 i번 학생이 정답
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6]; //1번부터 사용:[n+1], 1~5학년 사용:[6] 
		for(int i=1; i<=n; i++) { //i는 학생 번호
			for(int j=1; j<=5; j++) { //j는 1~5학년
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
	
}

/*임시 반장 정하기 - 3중 for문 사용
 * 
 * for i (1~5) - n(명수)
 *   for j (1~5) - n(명수)
 *     for k (1~5) - 학년
 * 
 * i=1 고정일 때 j=1,2,3,4,5
 * -> i=1번 학생과 같은 반을 했던 j번 학생(j=1~5)은 몇 명인가 카운팅
 * j번 학생이 i번 학생과 같은 반인지 확인하기 위해 안에서 k 반복문이 돈다
 * 
 * 행번호 = 학생 번호(i)
 * a[i][k] == a[j][k] cnt++; break;
 * a의 i번 학생의 k학년과 a의 j번 학생의 k학년의 반이 같느냐?
 * 같으면 cnt++;
 * 자기 자신이 같은 반인거 카운트해도 별로 상관 없다(가장 많은 학생 찾는 거라서)
 * 
 * 학생수를 세는 거라서 3번 학생과 4번 학생이 2번 같은반이 되면
 * 2번 카운트하지 말고 1번만 카운트해야 한다
 * 한 학생 여러번 카운트하면 안된다 -> break 걸어줘야 함
 * 
 * */
 
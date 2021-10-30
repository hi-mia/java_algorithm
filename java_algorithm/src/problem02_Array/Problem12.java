package problem02_Array;

import java.util.Scanner;

public class Problem12 {
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for(int i = 1; i<=n; i++) { //i-j 짝 만듦
			for (int j = 1; j<=n; j++) {
				int cnt = 0;
				for(int k = 0; k<m; k++) {//그 짝이 멘토-멘티 통과? / k=0~m-1까지
					int pi=0, pj=0;
					for (int s=0; s<n; s++) {
						if(arr[k][s]==i) pi=s; //배열에서 그 학생 번호(i) 찾았을 때 그 학생 s등이다
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++; //등수는 앞서야지 숫자가 작음, 성적이 더 높다
				}
				if(cnt==m) { //모든 테스트(m)에서 pi<pj 만족하면 answer++
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
		int[][] arr = new int[m][n]; //2차원 배열 만듦
		for(int i=0; i<m; i++) { 
			for(int j=0; j<n; j++) { 
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}

/*멘토링 - 이차원 배열 이용 4중 for문
 * 
 * n=4, m=3 (m=테스트 개수)
 * 멘토-멘티가 되는 총 경우들을 다 확인함 - for문 i,j가 돈다
 * for i = 1~4 (n=학생 번호)
 *  for j = 1~4 (n=학생 번호) // 짝 지을수 있는 총 경우가 j에서 나옴
 * 	  for k = 0~2 (0번 테스트부터 m번 테스트 전까지, k는 테스트번호)
 * 		for s = 0~3 (s는 등수)
 * 		   if (arr[k][s] == i) pi = s; //p: position, pi=i번 학생의 등수
 * 		   if (arr[k][s] == j) pj = s;
 * 
 * for s문 끝나면 if(pi<pj) cnt++; //첫번째 테스트 통과.. 다음 테스트 검사
 * 
 * (i, j)가 짝꿍, i와 j가 멘토-멘티 가능? => k로 들어감
 * arr[k][s] == i : i번째 학생의 k번째 테스트에서 등수s
 * 
 * */
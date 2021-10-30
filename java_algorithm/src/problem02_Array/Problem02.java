package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
	public int solution(int n, int[] arr){
		int answer = 1, max=arr[0]; //첫번째 사람 무조건 보임, max는 첫번째 사람 키(arr의 0번)
		for(int i = 1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}

/*
2. 보이는 학생
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


/*
 풀이
 max 라는 객체 생성, 그것을 130(맨 앞 학생 키)으로 초기화 / 최대 키
 answer 객체 생성, 거기에 보이는 학생 수 count한 숫자 집어넣는다
 2번째 학생 -> max보다 크면 보인다
 즉 max는 i라는 학생의 앞 학생들 중 가장 키가 큰 학생의 키
 비교해서 학생 i의 키가 max보다 크면 max에 i의 키를 넣는다
 answer 값이 바뀌면(카운팅 되면) max 값도 최대값으로 바뀌어야 한다.
 * */

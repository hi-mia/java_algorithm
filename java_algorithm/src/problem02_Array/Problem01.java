package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>(); //arrayList라는 자료구조 return
		answer.add(arr[0]); //arr의 0번은 무조건 출력이니 arrayList에 넣어둔다
		for(int i = 1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]); //자기 앞보다 크면 추가
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n]; //배열을 동적으로 n개를 잡음, n크기의 동적 배열 만듦
		for(int i = 0; i < n; i++) { //for문 돌아서 늘어남
			arr[i] = kb.nextInt();
		} //자기 앞 숫자보다 내가 크면 그 숫자들만 모아서(arrayList에 넣어서) return 해줌
		for(int x : T.solution(n, arr)) { //호출
			System.out.print(x+" ");
		}
	}
}

/*
1. 큰 수 출력하기 - 배열에다 넣고 탐색

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

*/
 
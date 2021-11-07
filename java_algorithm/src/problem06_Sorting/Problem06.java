package problem06_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem06 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone(); //깊은 복사 해야지 tmp 정렬해도 arr 배열 그대로 있음
		Arrays.sort(tmp); //tmp 오름차순 정렬
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //학생 수
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}

}

/*
 * 06. 장난꾸러기
 * 
 *       i ------------------------------>
 * arr  120 125 152 130 135 125 143 127 160
 * 
 * tmp  120 125 127 130 135 135 143 152 160
 * 
 * arr을 tmp에 1차원 배열에 깊은 복사를 한다
 * 그러고 나서 tmp를 오름차순 정렬한다
 * 정렬 후 for문이 돌면서 비교하면 된다
 * arr[i] != tmp[i] 비교 //값이 다르면 자리가 바뀐 것이다
 * (i+1) 값을 리턴해야 한다
 * 
 * */

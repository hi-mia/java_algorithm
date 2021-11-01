package problem06_Sorting;

import java.util.Scanner;

public class Problem03 {
	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int tmp = arr[i], j;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j];
				else break;
			}
			//j for문이 멈췄다, 멈춘 후에 tmp를 넣는다
			arr[j+1] = tmp; //j가 멈춘 지점 바로 뒤에 tmp를 넣는다
		}

		return arr;
	}
	
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}
}

/*
 * 03. 삽입 정렬 (이중 for문)
 * 
 * arr  11 7 5 6 10 9
 * 
 * tmp
 * 
 * j는 i바로 앞에서부터 0까지 돈다
 * for(i=0; ~~) {
 *  tmp = arr[i] 		//tmp에는 arr[i]를 넣는다
 * for(j=i-1; j>=0; j--)
 *   if(arr[j] > tmp)  //j가 tmp보다 크다면
 *    arr[j]의 값을 한칸 뒤로 밀어준다 -> arr[j+1] = arr[j]
 *    j = -1이 되면 j for문이 멈춘다
 *    j for문이 멈추면 j가 멈춘 지점 바로 뒤에다가 tmp를 삽입한다
 *    
 *    (arr[j] > tmp)이 거짓이라면 j for문을 break한다
 *    -> else break; 
 *   
 *   }
 *   
 *   항상 j for문이 멈춘 그 j 바로 뒤편에다가 tmp 삽입함!!
 * 
 * */

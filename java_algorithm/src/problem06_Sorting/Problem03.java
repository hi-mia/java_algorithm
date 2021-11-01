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
			//j for���� �����, ���� �Ŀ� tmp�� �ִ´�
			arr[j+1] = tmp; //j�� ���� ���� �ٷ� �ڿ� tmp�� �ִ´�
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
 * 03. ���� ���� (���� for��)
 * 
 * arr  11 7 5 6 10 9
 * 
 * tmp
 * 
 * j�� i�ٷ� �տ������� 0���� ����
 * for(i=0; ~~) {
 *  tmp = arr[i] 		//tmp���� arr[i]�� �ִ´�
 * for(j=i-1; j>=0; j--)
 *   if(arr[j] > tmp)  //j�� tmp���� ũ�ٸ�
 *    arr[j]�� ���� ��ĭ �ڷ� �о��ش� -> arr[j+1] = arr[j]
 *    j = -1�� �Ǹ� j for���� �����
 *    j for���� ���߸� j�� ���� ���� �ٷ� �ڿ��ٰ� tmp�� �����Ѵ�
 *    
 *    (arr[j] > tmp)�� �����̶�� j for���� break�Ѵ�
 *    -> else break; 
 *   
 *   }
 *   
 *   �׻� j for���� ���� �� j �ٷ� �����ٰ� tmp ������!!
 * 
 * */

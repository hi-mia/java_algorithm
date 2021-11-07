package problem06_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem06 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone(); //���� ���� �ؾ��� tmp �����ص� arr �迭 �״�� ����
		Arrays.sort(tmp); //tmp �������� ����
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //�л� ��
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x+" ");
	}

}

/*
 * 06. �峭�ٷ���
 * 
 *       i ------------------------------>
 * arr  120 125 152 130 135 125 143 127 160
 * 
 * tmp  120 125 127 130 135 135 143 152 160
 * 
 * arr�� tmp�� 1���� �迭�� ���� ���縦 �Ѵ�
 * �׷��� ���� tmp�� �������� �����Ѵ�
 * ���� �� for���� ���鼭 ���ϸ� �ȴ�
 * arr[i] != tmp[i] �� //���� �ٸ��� �ڸ��� �ٲ� ���̴�
 * (i+1) ���� �����ؾ� �Ѵ�
 * 
 * */

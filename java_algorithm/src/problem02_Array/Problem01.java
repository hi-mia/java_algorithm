package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>(); //arrayList��� �ڷᱸ�� return
		answer.add(arr[0]); //arr�� 0���� ������ ����̴� arrayList�� �־�д�
		for(int i = 1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]); //�ڱ� �պ��� ũ�� �߰�
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n]; //�迭�� �������� n���� ����, nũ���� ���� �迭 ����
		for(int i = 0; i < n; i++) { //for�� ���Ƽ� �þ
			arr[i] = kb.nextInt();
		} //�ڱ� �� ���ں��� ���� ũ�� �� ���ڵ鸸 ��Ƽ�(arrayList�� �־) return ����
		for(int x : T.solution(n, arr)) { //ȣ��
			System.out.print(x+" ");
		}
	}
}

/*
1. ū �� ����ϱ� - �迭���� �ְ� Ž��

N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
(ù ��° ���� ������ ����Ѵ�)

*/
 
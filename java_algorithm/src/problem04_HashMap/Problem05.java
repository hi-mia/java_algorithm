package problem04_HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem05 {
	public int solution(int[] arr, int n, int k) {
		int answer = -1; //k��° ���� �������������� -1 ���(���� ����)
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		//Ʈ������ �⺻������ ��������, �������ϸ� ���������� �ȴ�
		
		//3�� for���� ����(������ 3�� �����ϱ�)
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){ //i ������� ���ƾ� �Ѵ�, �ߺ� ������� �����Ƿ�
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//Tset ��� Ž��
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x;
			//System.out.println(cnt + "-" + x);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}

/*
 * 05. K��° ū ��
 * ������ 3�� ������ 3�� for�� ���� �ȴ�
 * 
 * ~�ڷᱸ�� set~
 * add�� �ϸ� ������ ��������� �ߺ��� ������� �ʱ� ������ ���� �ʴ´�
 * ��, �ߺ����Ÿ� �ϴ� �ڷᱸ��
 * ���� �� ������ �Ǿ������� ���� -> TreeSet
 * TreeSet�� �ߺ�����+�ڵ����ı��� (���� Ʈ���̴�)
 * 
 * 
 * 
 * */

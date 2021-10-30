package problem04_HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem05_2 {//TreeSet�� �����ϴ� �޼ҵ�
	public int solution(int[] arr, int n, int k){
		int answer=-1;
		//�⺻ �������� ����, reverse�ؾ��� ��������
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int l=j+1; l<n; l++){
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//remove: Ư�� ���� �����
		Tset.remove(143);
		
		//size: key�� �� �� �ִ°� Ȯ��, ������ ���� �˷���
		System.out.println(Tset.size());
		
		//first: ���������̸� �ּҰ�, ���������̸� �ִ밪�� �޴´�(������ �� �տ� ���� �޴´�)
		System.out.println("first : "+ Tset.first());
		
		//last: ���������̸� �ִ밪, ���������̸� �ּҰ�(������ �� ������)
		System.out.println("last : "+ Tset.last());
			
		for(int x : Tset){

			System.out.println(x);
			cnt++;
			if(cnt==k) return x;
		}
		return answer;
	}

	public static void main(String[] args){
		Problem05_2 T = new Problem05_2();
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
 * 
 * ~�ڷᱸ�� set~
 * add�� �ϸ� ������ ��������� �ߺ��� ������� �ʱ� ������ ���� �ʴ´�
 * ��, �ߺ����Ÿ� �ϴ� �ڷᱸ��
 * ���� �� ������ �Ǿ������� ���� -> TreeSet
 * TreeSet�� �ߺ�����+�ڵ����ı��� (���� Ʈ���̴�)
 * 
 * set�� ���� �ߺ������Ϸ��� ����Ѵ�
 * ���ĸ� ����ҰŸ� ���� �����ϴ� �ؽ���(Ʈ����) ����ϸ� �ȴ�
 * Ʈ����: ����Ʈ��
 * 
 * 
 * */

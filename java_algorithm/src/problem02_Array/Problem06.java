package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem06 {
	
	public boolean isPrime(int num){ //�Ҽ� �Ǻ� �Լ�
		if(num==1) return false; //�Ѿ�� ���� 1�̸� �Ҽ�X
		for(int i=2; i<num; i++){ //2���� �ڱ��ڽ� ������
			if(num%i==0) return false; //����� �߰ߵǸ�(i=���) �Ҽ��� �ƴϴ�
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		//for�� ���鼭 �����´�
		for(int i=0; i<n; i++){
			int tmp=arr[i];
			int res=0; //������ ���� ����� ����
			while(tmp>0){
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
		//�Ҽ���� arrayList�� �߰��ؼ� return�Ѵ�
	}
	public static void main(String[] args){
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){ //arrayList�� ����(�Ҽ��� ������ ���ڵ�)
			System.out.print(x+" ");
		}
	}
	
}

/*
 * 6. ������ �Ҽ�
 * 
 * */
 
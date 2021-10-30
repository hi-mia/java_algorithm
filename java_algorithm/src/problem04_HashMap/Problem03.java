package problem04_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem03 {
	
	private ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++) {//ó���� �ε��� 0���ʹϱ� k������ �����س��´�.
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		//�� ������ �˰��� - rt�� ���� lt�� �Ѿư��鼭 ���ӱ����� 4�� �����ϸ鼭 �� �а� ����
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1); //lt�� �翬�� key���� �ִ�. getOrDefault�� ������ �ְ� ������� ����
			//lt �̵��ϸ� �� 1�� ���ҽ�Ű��� ��
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]); //value�� 0�̸� �� key�� �����ض�
			lt++;
			
		}
			
		return answer;
	}

	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}


	
}

/*
 * 03. ������� ����(Hash, �� ������, sliding window)
 * 
 * �� 7��, �������� 4���� ����� ��� (k=4, k�� ���ӵ� ����)
 * 4�� ¥���� window�� ����� �а� ������
 * 
 *       lt          rt
 * arr   20  12  20  10  23  17  10
 * 
 * lt�� 0�� ����Ű�� rt�� 4���� ����Ŵ(k=4), rt�� index 3���� ����
 * 3�� ������ ���� �ؽ��ʿ� ī���� ������ ��
 * 
 *     20  12 
 * HM  2   1 
 * 1) (k=3���� 20���� value�� �� 2��, 12�� 1��) - ù ����
 * 2) rt�� ����Ű�� 10�� �ؽ���
 *     20  12  10
 * HM  2   1   1
 * 
 * arrayList answer
 * HashMap.size()�� ���� answer�� �ִ´�
 * 
 * answer 3
 * 
 * answer�� ���� �� lt�� ����Ű�� ����(20)�� �ؽ��ʿ��� ī���� �ϳ��� ����
 * (�����쿡�� ����ϱ�)
 *     20  12  10
 * HM  1   1   1
 * 
 * �� �� rt�� �����Ѵ� (rt �ε��� = 4), �װ��� �ؽ��ʿ� put �ؼ� ī�����Ѵ�
 * 
 *     20  12  10  23
 * HM  1   1   1   1
 * 
 * answer  3  4
 * 
 * ī������ �ϳ� �� �� value���� 0�� �Ǹ� �� key�� �����ؾ� �Ѵ�. �� �ڿ� lt ����
 * �� �׷��� hash.size()�� �� �� 0�� �� key�� ī���� �ع�����.
 * 
 *     20  12  10  23  
 * HM  1   0   1   1    -> 12����
 * 
 *     20 17 10  23 
 * HM  1  1  1   1 
 * 
 * answer  3  4  4  3
 *              (5�� �ƴϴ�)
 * 
 * */

package problem06_Sorting;

import java.util.Scanner;

public class Problem04 {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) { //�۾� ��ȣ �ϳ��ϳ��� x�� �ȴ�
			//x�� ��Ʈ�� �̽��ĸ� ��(x�� cache�� �ִ°� ���°� Ȯ��)
			int pos = -1; //�ε��� ��ȣ, ��ġ
			for(int i=0; i<size; i++) if(x==cache[i]) pos = i; //��Ʈ�� ��Ʈ�� ������ �ε��� ����
			if(pos == -1) { //�̽� ��Ȳ�̶��
				for(int i = size-1; i>=1; i--) {
					cache[i] = cache[i-1]; //��ĭ�� �����
				}
				//cache[0] = x; //x�� �־��ش�
			}// �̽� ó��
			
			else { 
				for(int i = pos; i>=1; i--) { //��Ʈ�� �������� �����
					cache[i] = cache[i-1]; //��ĭ�� �����
				}
				//cache[0] = x; //x�� �־��ش�
			}//��Ʈ ó��
			cache[0] = x; //x�� �־��ش� - 1���� ó��
		}
		
		return cache;
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(); //ĳ�� ������ s
		int n = kb.nextInt(); //�۾��� ����
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
	}
}

/*
 * 04. LRU (ĳ��, īī�� ����) - �������� �̿�
 * 
 * ĳ�ö�� �迭�� ������ + ��������
 * 
 * 			<-------   i  (i�� ���� ����)
 *         0  1  2  3  4
 * cache   1
 * 
 * c[i] = c[i-1]
 * 
 *         0  1  2  3  4
 * cache   2  1
 * 
 * �̽��� ���������� 1������ ����, 0�����ٰ��� ������ �۾��� �ִ´�
 * �� ���� �ݺ�
 * 
 *         0  1  2  3  4
 * cache   3  2  1
 * �̽��ϱ� �̷� �۾��� �ϴ� ���̴�(�̽�: ���� ó�� ���� / ��Ʈ: ���� �̹� �ִµ� �� ����)
 * 
 * 
 * ��Ʈ��� ��Ʈ�� �������� for���� ����
 * 
 * 1 2 3 ((2)) 6 2 3 5 7
 *        <-- i
 *         0  1  2  3  4
 * cache   3  2  1
 * 
 * �׷��鼭
 * c[i] = c[i-1] �̰� �Ȱ��� ���ָ� �ȴ�
 * ���������� ��Ʈ�� �������� 1���� ����, �׸��� �����۾��� 0���� �ִ´�
 * 
 *         0  1  2  3  4
 * cache   2  3  1 
 * 
 *         0  1  2  3  4
 * cache   6  2  3  1      //1�� �۾� �̷��� ������
 * 
 *         0  1  2  3  4
 * cache   2  6  3  1      //2�� �۾� ��
 * 
 *         0  1  2  3  4
 * cache   3  2  6  1      //3�� �۾� ��
 * 
 *         0  1  2  3  4
 * cache   5  3  2  6  1    //5�� �۾� ��
 * 
 *         0  1  2  3  4
 * cache   5  3  2  6  6    //7�� �۾� ��
 *
 * �� cache �޸� ũ�⸸ŭ������ ������ �����̰Բ� �Ѵ�
 * */

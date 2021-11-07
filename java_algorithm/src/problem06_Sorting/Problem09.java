package problem06_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Problem09 {
	
	public int count(int[] arr, int capacity) { //capacity:�뷮 / count: ���
		//dvd 1���� �뷮�� capacity��ŭ �����ߴ��� �뷡9�� ���� �� dvd�� ���� �ʿ����� return���ִ� �Լ�
		
		int cnt = 1; //dvd ���
		int sum = 0; //dvd�� ��� ����� ��
		for(int x : arr) {
			if(sum+x > capacity){
				cnt++; //�뷡�뷮 ���ʷ� ���ϴ� capacity���� �� ũ�� ���++
				sum = x;
			}
			else sum+=x;
		}
		return cnt;
		
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		//ū �����Ϳ��� �ִ�/���� ���� �� for�� ������ �ͺ��ٴ� stream ���°� �� ����
		//�迭�� stream�� ��´�(stream�� �ڷᱸ�� Ž�� ���� ���ͷ�����/�ݺ���)
		int lt = Arrays.stream(arr).max().getAsInt(); //�迭�� �ִ� ���Ѵ� + getAsInt(): max()�� int�� ��ȯ�ϰ� �Ѵ�
		int rt = Arrays.stream(arr).sum(); //sum�� int�� ��ȯ�Ѵ�
		
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m){
				answer=mid;
				rt=mid-1; //��������(�� ���� ���� �ִ��� Ȯ��)
			}
			else lt=mid+1;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, m, arr));
	}

}

/*
 * 09. ��������(���� �˰���)
 * ���� �˰���: �̺� �˻��� �̿��Ѵ�
 * 
 * ���� �˰����� ������ �䱸�ϴ� ���� lt~rt���̿� �ִٰ� Ȯ���� �� ���� ���
 * ���� �˰����� �ٽ�: lt~rt������ ���� ������ ���� �����μ� ������ �����ΰ�?(���ΰ�? �� �ƴ�)
 * �� ���� ���� ���� ���� ������ ������ ���� ���ΰ�?(�����μ� ������ ��)
 * ������ ���� �� ã���� �� ������ ���� �� ã������ �� ��������.. 
 * �̺а˻��� ���������� ��. ���������� ���õǴ� ���� answer��
 * 
 * �Է¿���
 * 9 3 (3�� �ȿ� dvd �� �� ���� �� ���� �� dvd�� �ּҿ뷮 ã��)
 * 1 2 3 4 5 6 7 8 9
 * 
 * lt		mid			rt
 * 9		27			45
 * 
 * �뷡�� �ּ��� 9�к��� Ŀ���Ѵ�: ���� ���� �� ���� ���� ���� lt
 * �뷡�� 1�忡 �� ���� �� 1+2+...+9 = 45: ���� ���� �� ���� ū ���� rt
 * 
 * mid = (lt+rt)/2 = 54/2 = 27
 * 
 * dvd ������ �뷮�� 27�̸� ��� ���� ���� �� �ִ°�? ����
 * 1~6 / 7~9 �̷��� 2�� �ȿ� ���� �� ���� -> �׷� 3�� �ȿ� �翬�� ���� �� ����
 * 27�� ���� ������ ���̴�: answer = 27
 * 
 * ���� �˰���: �� ���� ���� ���� ������ �������� ��
 * 
 * lt	 mid	rt
 * 9	  17    26
 * 
 * �ּҿ뷮 17�� ��
 * 1~5 / 6,7 / 8,9 -> 3������ ��� �� ���� �� �ִ�
 * 17�� ������ ������ ����: answer = 17
 * 
 * 17���� �� ���� ���� �ִ°�?
 * lt	mid		rt
 * 9	12		16
 * �ּҿ뷮 12�� ��
 * 1~4 / 5,6, / 7 / 8 / 9 -> �� 5�� (��x)
 * 12���� ū ���ڿ��� ã�´� 
 * 
 * lt<=rt�϶� �����
 * 
 * 
 * */

package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
	public int solution(int n, int[] arr){
		int answer = 1, max=arr[0]; //ù��° ��� ������ ����, max�� ù��° ��� Ű(arr�� 0��)
		for(int i = 1; i<n; i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}

/*
2. ���̴� �л�
�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)


/*
 Ǯ��
 max ��� ��ü ����, �װ��� 130(�� �� �л� Ű)���� �ʱ�ȭ / �ִ� Ű
 answer ��ü ����, �ű⿡ ���̴� �л� �� count�� ���� ����ִ´�
 2��° �л� -> max���� ũ�� ���δ�
 �� max�� i��� �л��� �� �л��� �� ���� Ű�� ū �л��� Ű
 ���ؼ� �л� i�� Ű�� max���� ũ�� max�� i�� Ű�� �ִ´�
 answer ���� �ٲ��(ī���� �Ǹ�) max ���� �ִ밪���� �ٲ��� �Ѵ�.
 * */

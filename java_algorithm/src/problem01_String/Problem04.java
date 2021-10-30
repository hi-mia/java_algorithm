package problem01_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 { //StringBuilder �̿�: ��� ���� ������
	public ArrayList<String> solution(int n, String[] str) { //String�� ���ҷ� ���� ArrayList�� ������ �ܾ�� �� �־ ArrayList ����
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();//StringBuilder: ���ڿ��� �ٷ�� class/��ü
			//x���� ������ �� �ٽ� String ��ȯ
			answer.add(tmp); //������ �� ���ڰ� ArrayList answer�� �����
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) { //n���� �ܾ String �迭�� �ϳ��� ����
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) { //���� n, String�迭 �ѱ�
			System.out.println(x);
		}
	}
}

/*
 * 04. �ܾ� ������
 * 
 * String�� ���ο� ��ü ���� ����� �� �ٽ� ����.. ��ü�� �ڲ� ���������
 * StringBuilder�� ó���� ���� ��ü �ϳ� ������ ��� ����
 * StringBuilder�� reverse(),toString() �� ���� �޼ҵ� ����
 * */

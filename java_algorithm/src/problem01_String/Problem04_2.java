package problem01_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04_2 { //���ǿ� �´� Ư�� ���ڸ� ������ ���� ��: ������ �ϳ��ϳ� �����´�
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray(); //String x�� ���ڹ迭�� �����(���� �ϳ��ϳ��� ����)
			int lt=0, rt=x.length()-1; //�ʱ�ȭ
			while(lt<rt) { //(lt<rt)�� �����Ǹ� ���ڿ� �� ������ ��
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt]= tmp; //�� ��ȯ
				lt++;
				rt--;
			} //reverse ���� ���� �˰���**(�߿�)
			//while ��: �� �������� ���� -> �ٽ� Stringȭ ��Ŵ
			String tmp = String.valueOf(s); //valueOf: static���� ����� Ŭ���� �޼ҵ�
			answer.add(tmp); //answer list�� �߰����ش�
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem04_2 T = new Problem04_2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) { 
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}

/*
 * ���� ������ - ���� ������
 * g o o d
 * -> g�� d ��ġ �ٲ�.. ¦�᳢�� �ٲ۴�
 * 
 * 0 1 2 3 4
 * s t u d y
 *lt	   rt
 *�� ó��(0��°): lt
 *�� ��(n-1��°): rt 
 *
 *lt�� rt�� ��ȯ��
 *-> �� �� [lt+1], [rt-1] �̵��� �� ��ȯ
 *-> �߽��� �ٲ� �ʿ� ����
 *
 *while(lt<rt) �ݺ�
 * 
 * */

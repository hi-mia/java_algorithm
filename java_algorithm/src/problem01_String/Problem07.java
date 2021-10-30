package problem01_String;

import java.util.Scanner;

public class Problem07 {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase(); //��ҹ��� ����X
		int len = str.length();
		for(int i = 0; i<len/2; i++) {
			//��
			if(str.charAt(i) != str.charAt(len-i-1)) return "NO"; //�ٸ��ٸ� NO
		}
		//ȸ�� ������ YES return
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 07. ȸ�� ���ڿ� - ���� ��
 * 
 * ~¦���� ��~
 *      0  1  2  3
 *      G  O  O  G
 * i=0			3=len-i-1
 * i=1			2=len-i-1
 * 
 *-> 4/2�� ���� �ȴ� (����/2�� ���� ������): i<len/2 (���ٰ� �ϸ� �ȵȴ�)
 * 0-3 ������? -> ������ ��� -> 1-2 ������? ... ��
 * �ٸ��� �����, �ٷ� No (ȸ�� �ƴϴ�)
 * 
 * ~Ȧ���� ��~
 * 0 1 2 3 4
 * s t u t s
 * u�� �� ���ص� �ȴ�, ¦���� ���������� i<len/2 ������ ���� �ȴ�
 * 
 * */

package problem01_String;

import java.util.Scanner;

public class Problem07_2 {
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString(); //tmp ��������
		//str: ���� �Էµ� ��, tmp: �������� ��
		if(str.equalsIgnoreCase(tmp)) answer = "YES"; // equals�� ��ҹ��� ������ �Ѵ� -> equalsIgnoreCase
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem07_2 T = new Problem07_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

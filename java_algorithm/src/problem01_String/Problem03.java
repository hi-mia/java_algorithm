package problem01_String;

import java.util.Scanner;

public class Problem03 {//substring���� Ǯ��
	public String solution(String str) {
		String answer = ""; //���� �� �ܾ� ����
		int max = Integer.MIN_VALUE;//�ִ밪���� ��� �����ؾ� ��->�ּڰ����� �ʱ�ȭ
		String[] s = str.split(" "); //����� ����, ������ split
		for(String x : s) {//x: �ϳ��ϳ��� �ܾ� / s: �迭(����)
			//System.out.println(x);
			int len = x.length(); //������ �ܾ��� ���̰� len�� ����
			if(len>max) {
				max=len; //�ִ��� m���� ��� ���ŵǰ�
				answer=x; //�� �ִ� �߰ߵ� ������ �� �ܾ���� answer�� �־���, �ܾ� ��ü
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //���� �Է¹޾ƾ� �ؼ� line����
		System.out.print(T.solution(str));
	}
}
/*
 * 3. ���� �� �ܾ�
 * 
 * ������ �ܾ���� ����� ����/�и��ؼ� String �迭�� �����ϴ� ��: str.split()
 *  
 * 
 * */

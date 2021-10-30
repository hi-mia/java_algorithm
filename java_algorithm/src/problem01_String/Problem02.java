package problem01_String;

import java.util.Scanner;

public class Problem02 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			//x�� �ҹ��ڳ�?
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		
		return answer;
		
	}
	
	/*
	 x�� �ҹ��ڳ�? ������ answer���� x�� �빮��ȭ ���Ѽ� ����(����)��
	 x�� �빮�ڶ�� x�� �ҹ���ȭ�ؼ� answer���� ������Ų��(String�̶� ����)
	 */
	
	/*
	 �ƽ�Ű �ڵ�ε� Ǯ �� �ִ�. �빮��: 65~90 / �ҹ���: 97~122
	 �빮�� = (�ҹ��� - 32)
	 
	 for(char x : str.toCharArray()) {
		if(x>=97 && x<=122) answer+=(char)(x-32); //x�� �ҹ���? ��->�빮��
		else answer+=(char)(x+32); //x�� �빮�ڶ�� ��->�ҹ���
		}
	 
	 * */
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
2. ��ҹ��� ��ȯ

�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� 
�ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 
 */
package problem01_String;

import java.util.Scanner;

public class Problem09 {
	public int solution(String s) {//�ƽ�Ű �ѹ�
		int answer = 0;
		for(char x : s.toCharArray()) { //s�� ���ڹ迭�� �������� forEach ����
			if(x>=48 && x<=57) answer = answer*10+(x-48); //(x-48)�ؾ� ���� ���ڰ� ��('0' = 48 != 0)
		}
		
		return answer;
		
	}
	
	//String���� �� ��
	/*
	 * 	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x; 
			//CharacterŬ������ Digit: x�� ����(digit)? -> true�� ����, answer�� x�� ������Ų��
			//answer�� String�̶� String���� ������
		}
		//int�� return�ؾ� �Ѵ�.. String���� �ϸ� 0208�� ����
		 
		return Integer.parseInt(answer); //String�� �� 0208 -> int�� 208�� ��
		
	}
	 * 
	 * */
	
	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 09. ���ڸ� ���� 
 * ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�
 * 
 * [0,1,2,0,5]�� ��
 * 
 * answer = 0; //�ʱ�ȭ
 * x>=48 && x<=57 //����'0' && ����'9'�� �ƽ�Ű ��ȣ -> '���ڶ��'
 * {answer = answer*10+(x-48)} //���ڶ�� �� ���� �����Ѵ�
 * 0 = 0x10 + 0 //0 �߰�
 * 1 = 0x10 + 1 //1 �߰�
 * 12 = 1x10 + 2 //2 �߰� ...
 * 120 = 12x10 + 0
 * 1205 = 120x10 + 5
 * 
 * */
 
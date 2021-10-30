package problem01_String;

import java.util.Scanner;

public class Problem05 {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray(); //str ����� ���� �迭 ����
		int lt = 0, rt = str.length()-1; //s�� ù��° ����/������ ����
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++; //Ư�������� �� = ���ĺ��� �ƴ� ��
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else { //���ĺ��� ��
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp; //swap ��Ŵ
				lt++;
				rt--;
			}
		} //���⼭ return �Ǵ� �� x���ڹ迭, �츮�� String�� return�ؾ� ��
		//String ��ȯ
		answer = String.valueOf(s);
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
/*
05. Ư�� ���� ������

lt						    rt
 a  #  b  !  G  E  *  T  @  S
   lt					rt
 
lt�� rt�� �� �� ���ĺ��� ����Ű�� ���� ���� ���ڸ� �����´�
lt�� rt�� ���ĺ��� ����Ű�� �ִ°�? Ȯ���ؾ� ��
-> ��ȯ�ϰ� lt++, rt-- (1�� �̵�)
-> ���ĺ� �ƴϸ� ��ȯ ���ϰ� �׳� 1�� �̵�

�ݺ��� {
if(lt == Ư������) lt++;
	else if (rt == Ư������) rt--;
	else ��ȯ
}


Character.isAlphabetic(s[lt]): lt�� ���ĺ��̸� true
*/
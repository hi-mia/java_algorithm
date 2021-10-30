package problem01_String;

import java.util.Scanner;

public class Problem01 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); //��ҹ��� ���� ���ϴ� String�� �˴� �빮�ڷ� �ٲ۴�
		t = Character.toUpperCase(t); //t��� ���� �빮�ڷ� ������
		//System.out.println(str+" "+t);
		
		//c�� ����� ����
		/*
		 * for(int i = 0; i<str.length(); i++) { if(str.charAt(i)==t) answer++; //���ڿ���
		 * ���ڸ� �ϳ��ϳ� �ε����� Ž��, �� ���� = t? }
		 */
		//���� for�� ���
		for(char x : str.toCharArray()) {//���ο� ���� �迭 ����
			if(x==t) answer++;
		}	
		
		return answer;
	}

	/* ���� for��������
�迭�̳� iterator �����ϴ� �÷��� �����ӿ�ũ(list, arrayList ��)�� �;���, String(X)
�׷��� String�� ����'�迭'�� �ٲ��ش�: toCharArray() */
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //���ڿ� ����
		char c = kb.next().charAt(0); //���ڿ����� ���� 1�� ����
		//�Է� ����
		
		System.out.println(T.solution(str, c)); //str, c�� �ѱ�
	}
}

/*
1. ���� ã��
�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� 
�� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���. (�󵵼� ����� ��)
��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�

 */
 
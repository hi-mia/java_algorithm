package problem01_String;

import java.util.Scanner;

public class Problem03_2 {//indexOf�� Ǯ��
	public String solution(String str) {
		String answer = ""; 
		int max = Integer.MIN_VALUE, pos;
		//ù��°�� �߰ߵǴ� indexOf�� ���� ��ġ�� return���ش�
		while((pos=str.indexOf(' ')) != -1) {//���� �߰� ���ϸ� -1, �߰��ϸ� �� �ε�����ȣ return 
			String tmp = str.substring(0, pos); //0������ pos ������
			int len = tmp.length();
			if(len>max) {//Ŭ ����O / '����'�� �ϸ� �ȵ�(max�� �������� ���� ���� ��ġ �ܾ� ���̶�� ���� ����)
				max=len;
				answer=tmp; //��� ������ / '����'�� �ϸ� ���� �ܾ�� ���ŵǾ����
				
			}
			str = str.substring(pos+1); //str�� [it is time~]���� [is time to~]�� �ٲ�, it �����(�̷������� �ݺ���)
		}
		//�̷��Ը� �ϸ� ������ �ܾ�(study)�� tmp�� �� ���� -> ������ �ܾ� ó��
		if(str.length()>max) answer = str;//������ �ܾ max���� ũ�� answer�� str�� �ٲ��
		return answer;
	}
	
	public static void main(String[] args) {
		Problem03_2 T = new Problem03_2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //���� �Է¹޾ƾ� �ؼ� line����
		System.out.print(T.solution(str));
	}
}

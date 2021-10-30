package problem01_String;

import java.util.Scanner;

public class Problem12 {
	public String solution(int n, String s) {
		String answer = "";
		for(int i=0; i<n; i++) {
			//0���� 7�� �ε������� / replace�� #->1, *->0
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); 
			//10����ȭ ��Ų��
			int num = Integer.parseInt(tmp, 2);
			answer+=(char)num; //�ƽ�Ű �ѹ��� ����ȭ ��Ų��
			//System.out.println(tmp+" "+num); //���⼭ ���߸� �Ȱ��� ���ڿ��� ����Ѵ�
			s=s.substring(7); //s�� 7���� �������� �ٲ� -> ���ڰ� ��� �ٲ� ����
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}
}

/*
 * 12. ��ȣ (replace(), parseInt(string, 2))
 * �Է��� �ƽ�Ű ��ȣ �빮�ڿ� �°Բ� ����
 * 
 * */
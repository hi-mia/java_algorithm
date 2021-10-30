package problem01_String;

import java.util.Scanner;

public class Problem06 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i<str.length(); i++) { //i: �ε���, indexOf: ù��° ��ġ�� �ε����� return 
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
			//�ߺ�X���(i��� ���ڰ� ó������ �߰ߵǴ� ��ġ = ���� i ��ġ) answer�� ����
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}

/*
 * 06. �ߺ���������
 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.

ksekkset -> kset

str.indexOf(str.charAt(i)) : i��° ������ ���� ó���� �� ��°�� �ִ���?
indexOf: �� ���ڰ� ���� ó�� �߰ߵ� �ε��� return (���� �� �־ ù ��° �ִ� ��ġ�� �ε��� return)

ksekkset
k 0 0 //�� ���ڿ� ��ġ������ 0, k�� ���ʷ� �����ϴ� ��ġ�� 0 -> answer�� ����
s 1 1 //�ڱ� ���� ��ġ�� 1, s ó�� ���� ��ġ�� 1
e 2 2
k 3 0 //�� ���ڿ� ��ġ���� 3, k�� ���ʷ� �����ϴ� ��ġ�� 0 = �ߺ� �����̴�, �̹� �տ��� ������ -> answer�� �߰�X
k 4 0
s 5 1
e 6 2
t 7 7


 * */
 
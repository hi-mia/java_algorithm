package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem02 {

	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1); 
			//x��� key ����, ���� value �ض�(getOrDefault: x������ 0 ����)
		}
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) return "NO"; //x��� key�� �������� �ʰų� ������ �ٸ��ٸ� 
			map.put(x, map.get(x)-1); //x������ ������ �׳� get ���
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}

/*
 * 02. �Ƴ��׷�(���̰� ���� �� �ܾ�, ���� �ٸ��� �� ��)
 * 
 * ABACB
 * BBACA
 * 
 * 1) ���ڿ� Ž���ؼ� map���� ���ĺ� ���� ī�����ؼ� �ִ´�
 * map
 * A  B  C
 * 2  2  1 (ù��° ���ڿ�)
 * 
 * 2) �� ��° ���ڿ� Ž���ϸ鼭 map�� key�� �ִ��� Ȯ���Ѵ�
 * key�� �ִٸ� �� key�� �ϳ� ���ҽ�Ų��
 * 
 * A  B  C
 * 0  0  0
 * 
 * ��� 0�� �Ǽ� ������ -> YES�ϰ� ������
 * key�� �ٸ��� ������(��� 0�� �ƴϸ�) NO �ϰ� ������
 * 
 * */

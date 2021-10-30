package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem01 {
	public char solution(int n, String s) {
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();//�ؽ��� ����
		//map.put('A', 3); //�̷������� �ڷᰡ ����
		for(char x : s.toCharArray()) { //string Ž��
			map.put(x, map.getOrDefault(x, 0)+1); //Ű���� ���Ѵ�
		}
		
		//map ��ü�� � Ư�� Ű�� �ִ��� Ȯ��
		//System.out.println(map.containsKey('A'));
		//key�� ���� ������ �˷���
		//System.out.println(map.size());
		//Ư�� key�� ������(�߿�)
		//System.out.println(map.remove('A'));
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) { //��ü�̸� map / map���� keySet()�� ������� �����ϴ� ��� Ű Ž��
			//System.out.println(key+" "+map.get(key)); //x�� key, map.get(x): x��� ���� Ű�� value���� �����Ͷ�
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key; //���� key
			}
		
		}
			return answer;
	}

	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
/*
 * 01. �б� ȸ��(�ؽ�)
 * 
 * HashMap<Character(key���� ��������), Integer(value���� ��������)>
 *  **map.getOrDefault(x, 0): x�� Ű���� �������� ���ٸ� 0�� �����ض� / ī�����Ҷ� �ſ� �߿�(key�� �������� �ֱ� ����)
 * map.keySet(): �� ��ü Ž��
 * 
 * */
 
package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04 {
	public int solution(String a, String b) {//a���� b�� �Ƴ��׷��� ã�´�
		int answer=0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		//b�� �̸� �����س��� �Ѵ�, b�ؽ��� ����(����1)
		//put: x��� key�� ������ /x��� key���� �������� ������ 0 return, ī�����̶� +1�� ���ش�
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);

		//b�� �ϳ� ����ŭ(L-1) String a�� �����(����2) rt�� ���ư���
		//���⼭�� forEach�� �ƴ϶� index�� ���ư��� / a.charAt(i)�� ���� key ��
		int L = b.length()-1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		
		//���� ��
		
		//�� ����Ʈ �˰��� - rt����, lt�� �Ѿư��鼭 ��� ���ϸ鼭 �����̵�������..
		int lt = 0;
		for(int rt = L; rt<a.length(); rt++) {//rt�� L���� ���Ƽ� a ������ ���� �ȴ�
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1); //rt�� ����Ű�� ���ڿ� ī����
			//ī���� ������ b�� ���Ѵ�
			if(am.equals(bm)) answer++; //�� �ؽ��� ������ �Ƴ��׷��̵�
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1); //lt �ϳ� ���ش�
			//0�� ���� �� Ȯ�����ش�
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt)); //lt�� ����Ű�� key�� �����ؾ��Ѵ�
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a,b));
	}
}

/*
 * 04. ��� �Ƴ��׷� ã��(���� ����װ� �Ȱ��� Ǯ�� �ȴ�)
 * �Է¿���
 * bacaAacba
 * abc
 * 
 * 
 * 	   lt    rt
 * a	b  a  c  a  A  a  c  b  a
 * 
 * rt�� 3-1�� 2���� ����
 * (2��° �迭(abc)�� ����-1)
 * 
 * 
 *     a  b  c (key��)
 * bm  1  1  1 (���� ī����)
 * (b���ڿ��� �ؽ���)
 *    
 *     b  a
 * am  1  1
 * (a���ڿ��� �ؽ���)
 * b������ 1�� ������ ����
 * 
 * rt�� �ʱⰪ�� am�� �߰��Ѵ�.
 *     b  a  c
 * am  1  1  1
 * 
 * �׷��� ���� bm�� am�� ��, ������ �Ƴ��׷�(�� ���� �� ���̰� ���ƾ� �� ����)
 * �� ���� �ؽø� ��: equals -> am.equals(bm)
 * key�� ī������ ��, �� value������ �� ���� 
 * ������ answer++
 * 
 * rt�� �����ϰ� equals�� �Ѵ�
 * �� �ڿ� lt�� �ִ� ���� �ϳ� ����, ���� 0�Ǹ� �� key ����(b������): remove
 * �� �� lt 1������ ���� �� �ϳ� ����
 *  
 *     b  a  c  ->  a  c  ->  a  c
 * am  0  1  1  ->  1  1  ->  2  1
 * 
 * 
 * lt�� �� ���� lt 1 ����, lt�� �߰�, �� �� rt 1 ����, rt�� �߰�.. �ݺ�
 * */

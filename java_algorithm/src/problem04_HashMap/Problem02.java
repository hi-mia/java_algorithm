package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem02 {

	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1); 
			//x라는 key 생성, 값을 value 해라(getOrDefault: x없으면 0 리턴)
		}
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) return "NO"; //x라는 key가 존재하지 않거나 개수가 다르다면 
			map.put(x, map.get(x)-1); //x없을리 없으니 그냥 get 사용
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
 * 02. 아나그램(길이가 같은 두 단어, 길이 다른거 안 줌)
 * 
 * ABACB
 * BBACA
 * 
 * 1) 문자열 탐색해서 map에다 알파벳 개수 카운팅해서 넣는다
 * map
 * A  B  C
 * 2  2  1 (첫번째 문자열)
 * 
 * 2) 두 번째 문자열 탐색하면서 map에 key가 있는지 확인한다
 * key가 있다면 그 key를 하나 감소시킨다
 * 
 * A  B  C
 * 0  0  0
 * 
 * 모두 0이 되서 끝난다 -> YES하고 끝낸다
 * key가 다른게 있으면(모두 0이 아니면) NO 하고 끝낸다
 * 
 * */

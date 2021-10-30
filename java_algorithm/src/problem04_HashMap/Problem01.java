package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem01 {
	public char solution(int n, String s) {
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();//해쉬맵 선언
		//map.put('A', 3); //이런식으로 자료가 들어간다
		for(char x : s.toCharArray()) { //string 탐색
			map.put(x, map.getOrDefault(x, 0)+1); //키값을 정한다
		}
		
		//map 객체에 어떤 특정 키가 있는지 확인
		//System.out.println(map.containsKey('A'));
		//key의 종류 개수를 알려줌
		//System.out.println(map.size());
		//특정 key를 삭제함(중요)
		//System.out.println(map.remove('A'));
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) { //객체이름 map / map안의 keySet()을 대상으로 존재하는 모든 키 탐색
			//System.out.println(key+" "+map.get(key)); //x는 key, map.get(x): x라는 값의 키에 value값을 가져와라
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key; //답은 key
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
 * 01. 학급 회장(해쉬)
 * 
 * HashMap<Character(key값의 데이터형), Integer(value값의 데이터형)>
 *  **map.getOrDefault(x, 0): x의 키값을 가져오되 없다면 0을 리턴해라 / 카운팅할때 매우 중요(key가 없을수도 있기 때문)
 * map.keySet(): 맵 객체 탐색
 * 
 * */
 
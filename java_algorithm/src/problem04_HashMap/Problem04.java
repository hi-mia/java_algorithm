package problem04_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04 {
	public int solution(String a, String b) {//a에서 b의 아나그램을 찾는다
		int answer=0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		//b는 미리 세팅해놔야 한다, b해쉬맵 만듦(세팅1)
		//put: x라는 key를 만들어라 /x라는 key값을 가져오고 없으면 0 return, 카운팅이라서 +1를 해준다
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);

		//b의 하나 전만큼(L-1) String a를 만들고(세팅2) rt가 돌아간다
		//여기서는 forEach가 아니라 index로 돌아간다 / a.charAt(i)는 문자 key 값
		int L = b.length()-1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		
		//세팅 끝
		
		//투 포인트 알고리즘 - rt증가, lt가 쫓아가면서 계속 비교하면서 슬라이딩윈도우..
		int lt = 0;
		for(int rt = L; rt<a.length(); rt++) {//rt는 L부터 돌아서 a 끝까지 돌면 된다
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1); //rt가 가리키는 문자열 카운팅
			//카운팅 했으면 b와 비교한다
			if(am.equals(bm)) answer++; //두 해쉬맵 같으니 아나그램이디ㅏ
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1); //lt 하나 빼준다
			//0일 때를 꼭 확인해준다
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt)); //lt가 가리키는 key를 삭제해야한다
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
 * 04. 모든 아나그램 찾기(앞의 매출액과 똑같이 풀면 된다)
 * 입력예제
 * bacaAacba
 * abc
 * 
 * 
 * 	   lt    rt
 * a	b  a  c  a  A  a  c  b  a
 * 
 * rt는 3-1인 2부터 돈다
 * (2번째 배열(abc)의 길이-1)
 * 
 * 
 *     a  b  c (key값)
 * bm  1  1  1 (개수 카운팅)
 * (b문자열의 해쉬맵)
 *    
 *     b  a
 * am  1  1
 * (a문자열의 해쉬맵)
 * b길이의 1개 전까지 세팅
 * 
 * rt의 초기값을 am에 추가한다.
 *     b  a  c
 * am  1  1  1
 * 
 * 그러고 나서 bm과 am을 비교, 같으면 아나그램(두 맵의 총 길이가 같아야 비교 가능)
 * 두 개의 해시맵 비교: equals -> am.equals(bm)
 * key와 카운팅한 값, 그 value값까지 다 비교함 
 * 같으면 answer++
 * 
 * rt를 적용하고 equals를 한다
 * 그 뒤에 lt에 있는 것을 하나 뺀다, 값이 0되면 그 key 삭제(b삭제됨): remove
 * 그 뒤 lt 1증가한 곳의 것 하나 더함
 *  
 *     b  a  c  ->  a  c  ->  a  c
 * am  0  1  1  ->  1  1  ->  2  1
 * 
 * 
 * lt의 값 빼고 lt 1 전진, lt값 추가, 그 뒤 rt 1 전진, rt값 추가.. 반복
 * */

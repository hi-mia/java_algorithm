package problem01_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 { //StringBuilder 이용: 모든 문자 뒤집음
	public ArrayList<String> solution(int n, String[] str) { //String을 원소로 갖는 ArrayList에 뒤집은 단어들 다 넣어서 ArrayList 리턴
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();//StringBuilder: 문자열을 다루는 class/객체
			//x문자 뒤집은 후 다시 String 변환
			answer.add(tmp); //뒤집어 진 문자가 ArrayList answer에 저장됨
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) { //n개의 단어를 String 배열에 하나씩 넣음
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) { //갯수 n, String배열 넘김
			System.out.println(x);
		}
	}
}

/*
 * 04. 단어 뒤집기
 * 
 * String은 새로운 객체 만들어서 변경된 걸 다시 대입.. 객체가 자꾸 만들어진다
 * StringBuilder은 처음에 만든 객체 하나 가지고 계속 변경
 * StringBuilder에 reverse(),toString() 등 여러 메소드 지원
 * */

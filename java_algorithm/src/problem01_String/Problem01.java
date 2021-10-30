package problem01_String;

import java.util.Scanner;

public class Problem01 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); //대소문자 구분 안하니 String을 죄다 대문자로 바꾼다
		t = Character.toUpperCase(t); //t라는 문자 대문자로 만들어라
		//System.out.println(str+" "+t);
		
		//c가 몇개인지 센다
		/*
		 * for(int i = 0; i<str.length(); i++) { if(str.charAt(i)==t) answer++; //문자열의
		 * 문자를 하나하나 인덱스로 탐색, 그 문자 = t? }
		 */
		//향상된 for문 사용
		for(char x : str.toCharArray()) {//새로운 문자 배열 생성
			if(x==t) answer++;
		}	
		
		return answer;
	}

	/* 향상된 for문에서는
배열이나 iterator 제공하는 컬렉션 프레임워크(list, arrayList 등)만 와야함, String(X)
그래서 String을 문자'배열'로 바꿔준다: toCharArray() */
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //문자열 읽음
		char c = kb.next().charAt(0); //문자열에서 문자 1개 읽음
		//입력 받음
		
		System.out.println(T.solution(str, c)); //str, c를 넘김
	}
}

/*
1. 문자 찾기
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 
몇 개 존재하는지 알아내는 프로그램을 작성하세요. (빈도수 세라는 뜻)
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다

 */
 
package problem01_String;

import java.util.Scanner;

public class Problem06 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i<str.length(); i++) { //i: 인덱스, indexOf: 첫번째 위치의 인덱스를 return 
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
			//중복X라면(i라는 문자가 처음으로 발견되는 위치 = 현재 i 위치) answer에 누적
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
 * 06. 중복문자제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

ksekkset -> kset

str.indexOf(str.charAt(i)) : i번째 문자의 제일 처음은 몇 번째에 있느냐?
indexOf: 그 문자가 제일 처음 발견된 인덱스 return (여러 개 있어도 첫 번째 있는 위치의 인덱스 return)

ksekkset
k 0 0 //이 문자열 위치에서도 0, k가 최초로 등장하는 위치도 0 -> answer에 누적
s 1 1 //자기 원래 위치도 1, s 처음 등장 위치도 1
e 2 2
k 3 0 //이 문자열 위치에서 3, k가 최초로 등장하는 위치는 0 = 중복 문자이다, 이미 앞에서 등장함 -> answer에 추가X
k 4 0
s 5 1
e 6 2
t 7 7


 * */
 
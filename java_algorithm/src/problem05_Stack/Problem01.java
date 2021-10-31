package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>(); //스택 객체 생성
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x); //여는 괄호면 스택에 넣는다
			else { //닫는 괄호 만나면
				if(stack.isEmpty()) return "NO"; //스택에 비어있나? 그러면 잘못된 괄호(닫는 괄호가 많다)
				stack.pop(); //안 비어 있으면 맨 위에거 꺼낸다
			}
		}
		if(!stack.isEmpty()) return "NO"; //stack에 뭔가 남아 있다면 -> 잘못된 괄호(여는 괄호가 많다)
		return answer;
	}

	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 01. 올바른 괄호 - 스택의 대표 문제
 * 괄호가 있으면 스택쓰는 문제다!
 * 스택 = 구덩이(입구와 출구가 한 곳임)
 * Last In First Out
 * 
 * 큐: 스택과 반대
 * First In First Out
 * 
 * 여는 괄호-닫는 괄호 짝꿍이 다 맞아야 한다
 * 
 * 여는 괄호 만나면 스택에 넣는다(push)
 * 닫는 괄호 만나면 - 닫는 괄호의 여는 괄호 짝은 스택의 맨 상단에 있다 -> 맨 위의 여는 괄호를 pop 시킨다
 * 
 * push(): 스택에 넣는다
 * pop(): 스택에서 꺼낸다 
 * isEmpty(): 스택이 비어있는가 확인
 * 
 * 올바른 괄호라면 스택에는 무조건 여는 괄호가 있어야 한다
 * = 닫는 괄호를 만났는데 스택이 비어있으면 잘못된 괄호이다
 * = 다 끝났는데 스택이 비워져있지 않으면 잘못된 괄호이다
 * 
 * 
 * */

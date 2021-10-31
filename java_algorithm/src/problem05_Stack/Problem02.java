package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem02 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		//str 탐색
		for(char x : str.toCharArray()) {
			if(x==')') { // 닫는 괄호 만나면 pop 한다
				//pop: 스택의 가장 상단의 값을 꺼내고, 꺼낸 값을 return한다
				//System.out.println(stack.pop());
				while(stack.pop() !='('); //꺼냈는데 여는 괄호면 거짓되어서 멈춘다 
			
			}
			else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer += stack.get(i); //answer에 누적
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 02. 괄호문자 제거 - 괄호가 있으면 십중팔구 스택이다
 * 
 * 스택에 여는 괄호와 알파벳을 넣는다 / '(' A B '(' B C ...
 * 
 * 닫는 괄호를 만나면 스택의 상단에 있는 여는 괄호가 짝꿍이다.
 * 이때 여는괄호-닫는괄호 짝꿍 사이에 있는 알파벳들이 (BC) 괄호 안에 있는 알파벳이다.
 * 이 둘을 삭제한다: 닫는 괄호를 만나면 짝꿍인 여는 괄호 만날 때까지 pop 시킨다
 * 
 * stack.size() : 스택의 원소의 크기
 * 
 * */

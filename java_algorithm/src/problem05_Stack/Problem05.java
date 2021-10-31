package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem05 {
	public int solution(String str) {
		int answer=0;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') stack.push('('); //여는 괄호면 스택에다 푸쉬
			else { //닫는 괄호라면
				stack.pop(); // 어떤 닫는 괄호던 자기 짝꿍의 여는 괄호를 pop 시킨다
				if(str.charAt(i-1)=='(') answer+=stack.size(); //바로 앞의 지점이 여는 괄호라면 레이저이다, answer에 stack의 막대기 개수를 누적
				else answer++; //막대기 닫는 괄호니 answer에 1 더함
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem05 T = new Problem05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 05. 쇠막대기
 * 
 * 여는 괄호 만나면 스택에다 무조건 push
 * 닫는 괄호를 만나면 레이저의 닫는 괄호인지 쇠막대기 끝을 알리는 닫는 괄호인지 알아내야한다
 * -> 바로 앞 인덱스를 확인한다.
 * 닫는 괄호 바로 앞의 것을 확인
 * 닫는 괄호 바로 앞의 것이 여는 괄호다 -> 레이저(막대기를 자른다)
 * 아니면 막대기임 (막대기의 끝은 레이저에 영향받지 않는다)
 * 
 * 닫는 괄호 만났을 때 스택의 제일 상단에 있는 여는 괄호가 그 닫는 괄호의 짝꿍이다
 * 레이저의 여는 괄호를 stack에서 pop 시킨다
 * 그 뒤 스택에 남은 여는 괄호들은 막대기의 여는 괄호들이다
 * 남은 괄호들이 3개라면 막대기가 3개가 있다는 뜻, 막대기 3개를 자른다
 * 
 * answer는 잘리는 쇠막대기 조각들(stack.size() 의미함)
 * answer에다 stack.size를 더해준다
 * 
 * 막대기의 끝에 다다르면 남은 막대기의 끝을 센다(남은 짜투리. 여기서는 레이저 영향 안 받는다)
 * 그 막대기의 여는 괄호를 stack에서 pop 시킨다.
 * 그리고 answer에 +1을 해준다(막대기 1개가 끝이 났으니까)
 * 
 * 
 * */

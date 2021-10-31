package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem04 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) { //만난 것이 숫자? 연산자?
			if(Character.isDigit(x)) stack.push(x-48); //숫자라면 숫자를 넣는다(지금 문자니까 아스키넘버로 계산해서 숫자로 넣어준다)
			else { //연산자라면 스택에서 2개 꺼낸다
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

/*
 * 04. 후위식 연산 - 주로 코딩인터뷰 문제
 * 후위식: 숫자만 놔두고 연산만 뒤쪽으로 빠지는 거
 * 5+3 -> 53+
 * 5-3 -> 53- //후위식 연산할 때 빼기 당하는 숫자는 왼쪽에 있는 숫자 5이다
 * 
 * 숫자면 스택에다 넣는다(push)
 * 연산자를 만나면 스택에서 꺼낸다
 * 
 * stack
 * 2
 * 5
 * 3
 * 
 * stack     lt(두번쨰 꺼내는 값)     rt(첫번째 꺼내는 값)
 *			 5 				+	  2
 * 7
 * 3
 * 
 * rt와 lt를 꺼내서 연산한 뒤 그 결과 값을 stack에 넣는다
 * 빼기/나눗셈 시 당하는 것: lt (위의 경우 5-2가 된다)
 * 
 * 최종값 12: stack.get(0)이 되면 가져와진다
 * 
 * */
package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem07 {
	public String solution(String need, String plan) { //need: 필수과목, plan: 계획서
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x); //큐에 필수과목 세팅함
		for(char x : plan.toCharArray()) {//여기서 x는 계획서 상의 과목 하나하나
			if(Q.contains(x)) { //x라는 과목이 큐에 있으면
				if(x!=Q.poll()) return "NO"; // x가 큐의 맨 앞의 자료와 다르다면(poll: 꺼내긴 함)
			}
	
		}
		if(!Q.isEmpty()) return "NO"; //큐에 뭔가 남아있다 = 필수과목 이수 안했으면 "NO" 
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem07 T = new Problem07();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(T.solution(a, b));
	}
}

/*
 * 07. 교육과정 설계
 * 필수과목 순서대로 듣게끔만 짜면 된다. 그 순서를 어겼을 때 NO 하면 된다
 * 
 * 필수과목 순서(CBA)는 알파벳이 중복되어서 오지 않는다!
 * 수업계획서 순서(CBDAGE)는 알파벳 중복 가능
 * 
 * 1) 큐에다 필수과목으로 주어지는 순서를 넣어둔다(미리 offer 시킨다)
 * 2) 수업계획서를 하나하나 탐색한다
 * 3) 수업계획서의 과목(C)가 필수과목인지(큐에 있는지) 확인한다 -> Q.contains(x)
 * 4) 있는지 확인하고 순서도 확인한다 
 * 필수 과목이고 맨 앞과 일치하면 이 과목 들어도 된다 -> 큐 안의 C를 pull 시킨다
 * 그 필수과목 들었다면 큐에서 사라지니까 수강여부+순서가 확인이 된다
 * 
 * 큐에 있어도 맨 앞이 아니라면 return NO해서 끝내면 된다
 * ex) 
 *    큐
 *-------------
 *  C B A
 *-------------  
 * C D K A E -> A가 큐에 있어도 수강계획순서에서 A를 만날 때 큐에 맨 앞에 있는건 B라서 안된다
 * 
 * 또는 다 돌았는데 큐에 무언가가 남았으면 return NO를 한다
 * 
 * 5) 그 다음 과목 탐색, 같은 과정 반복...
 * 
 * */

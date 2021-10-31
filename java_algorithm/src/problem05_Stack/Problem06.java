package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem06 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>(); //큐 객체 생성
		for(int i=1; i<=n; i++) Q.offer(i); //1부터 n까지 큐에다 미리 세팅
		
		while(!Q.isEmpty()) { //비어있지 않으면 참이라서 돌고 비어있으면 거짓되서 멈춘다
			for(int i=1; i<k; i++) Q.offer(Q.poll()); //앞에 걸 꺼내서 뒤에다 다시 넣어준다, 그 값 return 받음
			Q.poll(); //숫자 k는 그냥 뺀다
			if(Q.size()==1) answer=Q.poll(); //마지막 하나 남으면 그게 답
		}
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}

/*
 * 06. 공주구하기 - '큐'라는 자료구조 사용
 * 큐: FIFO (First In First Out)
 * 
 * offer(): 큐에다 자료 집어넣는 메서드
 * poll(): 큐에서 자료를 꺼내는 메서드 (꺼내고 값을 return 받는다)
 * peek(): 큐에서 가장 앞에 있는 원소 확인만(꺼내지 않는다)
 * size(): 큐에 몇 개가 있느냐
 * contains(x): x가 있으면 참, 없으면 거짓
 * 
 * 
 * k=3 -> 3을 외친 사람은 원해서 빠지는 것이다
 * 큐에다 1~8번까지 번호를 넣어준다
 * ---------------------
 * 1 2 3 4 5 6 7 8
 * ---------------------
 * k-1개 만큼을 앞에서 빼서 맨 뒤로 보낸다(k-1개만큼 poll한 뒤에 뒤로 offer한다)
 * k는 그냥 poll 시켜버린다(3은 큐에서 그냥 뺀다)
 * 이 과정 반복(큐의 사이즈가 1이 될 때까지 반복)
 * 
 * 큐를 while문으로 돌려서 큐가 비어있으면 멈추게 한다
 * size가 1이 되면 그 값을 answer에다 poll 시킨다, 그리고 멈춘다
 *
 * */

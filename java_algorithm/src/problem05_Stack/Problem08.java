package problem05_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person{
	int id; //처음 대기 목록 상 순서
	int priority; //위험도
	public Person(int id, int priority) { //생성자 만들어서 객체 생성할 때 넣는다, 초기화
		this.id = id;
		this.priority = priority;
	}
}

public class Problem08 {
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>(); //Person형 큐를 만듦
		for(int i = 0; i<n; i++) { //for문 돌면서 arr을 쭉 탐색
			Q.offer(new Person(i, arr[i])); //Person 객체를 만든다 (id, priority)
		}
		while(!Q.isEmpty()) {
			Person tmp = Q.poll(); //첫번째 사람 것을 tmp에다 꺼냈다
			//tmp라는 환자가 진료 받을 수 있는지 확인 위해 for문이 돌았다
			for(Person x : Q) { 
				if(x.priority>tmp.priority) { //x의 우선순위가 현재 진료받고자 하는 tmp의 우선순위보다 크다면
					Q.offer(tmp); //그 사람 진료받으면 안되니 뒤에다 넣어버린다
					tmp = null;
					break;
				}
			}
			if(tmp != null) { //(x.priority>tmp.priority)이 참이 아니었다 -> tmp는 진료받을 수 있다
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //대기목록 환자수
		int m = kb.nextInt(); //몇 번쨰?
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt(); //우선순위/위험도 입력받음
		}
		System.out.println(T.solution(n, m, arr));
	}
}

/*
 * 08. 응급실
 * 접수 순서대로 진료받음
 * 그러나 자기보다 응급도가 높은 사람이 있으면 자기는 대기목록 맨 뒤로 간다
 * 
 * 입력예제1 (5 2)
 * 
 * 큐 라는 자료구조
 * -----------------------------------------
 * (0,60)  (1,50)  (2,70)  (3,80)  (4,90)
 * -----------------------------------------
 * (id, priority) // (몇 번쨰, 위험도)
 * 이 두개를 인스턴스 변수로 받는 person이라는 class 만든 뒤 큐에다 객체로 넣어 놓은 상태
 * 
 * 위험도가 낮은 사람은 큐의 맨 뒤로 넣어준다
 * -----------------------------------------
 * (2,70)  (3,80)  (4,90)  (0,60) (1,50)
 * -----------------------------------------
 * 
 * (반복)
 * 
 * -----------------------------------------
 * (4,90)  (0,60) (1,50) (2,70)  (3,80)  
 * -----------------------------------------
 * answer에 1을 넣어준다(첫번째로 진료 받는다) / answer은 카운팅
 * (4,90)의 id 넘버가 우리가 찾는 2인지 확인, 아니면 그냥 지나감
 * (4, 90)을 큐에서 poll 해준다
 * 
 * 
 * -----------------------------------------
 *  (3,80) (0,60) (1,50) (2,70)    
 * ----------------------------------------- 
 * answer = 2가 됨( (3,80)은 두번째로 진료받는다)
 * (3,80)도 2가 아니니까 그냥 poll
 * 
 * -----------------------------------------
 *  (2,70) (0,60) (1,50)     
 * -----------------------------------------
 * 
 * answer = 3,
 * (2,70)은 id=2니까 여기서의 answer값 return (answer=3)
 * 
 * */

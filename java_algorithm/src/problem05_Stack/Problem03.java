package problem05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem03 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new 	Stack<>();
		//시뮬레이션
		//moves 탐색
		for(int pos : moves) { //pos: 크래인의 위치, pos가 정해지면 크래인이 내려가 인형 발견
			for(int i=0; i<board.length; i++) { //2차원 배열의 행 크기
				if(board[i][pos-1]!=0) { //행이 내려가서 인형이 발견 된다면
					int tmp = board[i][pos-1];//인형 번호를 넣는다
					board[i][pos-1]=0; //인형 꺼낸 곳 0으로 만든다
					if(!stack.isEmpty() && tmp==stack.peek()){//스택의 상단과 같은 인형인지 비교 - 인형이 터트려지는가?
						answer += 2; //인형 2개가 터트려지니까
						stack.pop(); //스택 상단의 것 꺼낸다
					}
					else stack.push(tmp); //인형 다르면 스택에다 꺼낸 인형 넣는다
					break; //for문을 멈춘다
				}
			
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) { //인형들을 board에다 받았다
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt(); //움직이는 횟수
		int[] moves = new int[m]; //moves 배열 동적으로 만든다
		for(int i=0; i<m; i++) moves[i] = kb.nextInt();
		System.out.println(T.solution(board, moves));
	}


}

/*
 * 03. 크레인 인형뽑기(카카오)
 * 
 * 2차원 배열: 0번 인덱스부터
 * 2차원 배열의 행크기: board.length
 * 2차원 배열의 열크기: board[0].length
 * 
 * board[i][pos-1]
 * 
 * 2차원 배열을 for문으로 돌다가 인형이 발견되면 stack에 넣는다
 * 이때 stack에 제일 위에 있는 인형과 같으면 둘이 터진다
 * 4번째 인형 꺼냈으면 그 꺼낸 인형 위치를 4->0으로 바꿔준다
 * 
 * 크래인이 내려가는 상황 -> 인형이 발견되어서 인형 하나를 꺼내서 스택에 넣으면
 * for문이 돌면 안된다, 꺼낸 인형 아래에 있는 인형을 또 꺼내면 안된다 -> break 걸기
 * (크래인은 인형 하나 뽑으면 올라가 버린다.. 맨 아래까지 인형 뽑는거 아니다)
 * 인형 하나 꺼내면 stack에 넣고 for문은 break 해준다!
 * 
 * 크래인 이동해서 인형을 발견 -> 스택 상단에 있는 인형과 '비교'한다 (크래인이 인형 꺼내면 안된다!)
 * 꺼내지 않고 비교: 스택의 가장 상단에 있는 값을 return 받는 함수 peek()
 * 1) 같지 않으면 인형을 스택에 넣는다, 꺼낸 인형은 2차원 배열에서 0으로 처리
 * 2) 스택 안의 인형이 같으면 꺼낸 인형은 0으로 처리, 스택 안의 인형 pop 시킴
 * (굳이 인형 꺼내서 스택에 넣지 말고 그냥 원래 들어있던거만 pop 시킨다)
 * -> answer+=2 (한번에 2개가 터트려지니까)
 * 
 * pop(): 스택 상단의 값을 꺼낸 뒤에 가져온다
 * peek(): 스택 상단의 값을 가져오기만 한다(꺼내진 않는다)
 * */

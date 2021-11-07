package problem06_Sorting;

import java.util.Scanner;

public class Problem04 {
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		for(int x : arr) { //작업 번호 하나하나가 x가 된다
			//x가 히트냐 미스냐를 봄(x가 cache에 있는가 없는가 확인)
			int pos = -1; //인덱스 번호, 위치
			for(int i=0; i<size; i++) if(x==cache[i]) pos = i; //히트면 히트된 지점의 인덱스 저장
			if(pos == -1) { //미스 상황이라면
				for(int i = size-1; i>=1; i--) {
					cache[i] = cache[i-1]; //한칸씩 땡긴다
				}
				//cache[0] = x; //x를 넣어준다
			}// 미스 처리
			
			else { 
				for(int i = pos; i>=1; i--) { //히트난 지점부터 땡긴다
					cache[i] = cache[i-1]; //한칸씩 땡긴다
				}
				//cache[0] = x; //x를 넣어준다
			}//히트 처리
			cache[0] = x; //x를 넣어준다 - 1번만 처리
		}
		
		return cache;
	}
	
	public static void main(String[] args) {
		Problem04 T = new Problem04();
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt(); //캐시 사이즈 s
		int n = kb.nextInt(); //작업의 갯수
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
	}
}

/*
 * 04. LRU (캐시, 카카오 변형) - 삽입정렬 이용
 * 
 * 캐시라는 배열을 만들자 + 삽입정렬
 * 
 * 			<-------   i  (i가 도는 방향)
 *         0  1  2  3  4
 * cache   1
 * 
 * c[i] = c[i-1]
 * 
 *         0  1  2  3  4
 * cache   2  1
 * 
 * 미스면 끝에서부터 1까지만 돈다, 0번에다가는 현재의 작업을 넣는다
 * 이 과정 반복
 * 
 *         0  1  2  3  4
 * cache   3  2  1
 * 미스니까 이런 작업을 하는 것이다(미스: 값이 처음 나옴 / 히트: 값이 이미 있는데 또 나옴)
 * 
 * 
 * 히트라면 히트난 지점부터 for문이 돈다
 * 
 * 1 2 3 ((2)) 6 2 3 5 7
 *        <-- i
 *         0  1  2  3  4
 * cache   3  2  1
 * 
 * 그러면서
 * c[i] = c[i-1] 이걸 똑같이 해주면 된다
 * 마찬가지로 히트난 지점부터 1까지 돈다, 그리고 현재작업을 0번에 넣는다
 * 
 *         0  1  2  3  4
 * cache   2  3  1 
 * 
 *         0  1  2  3  4
 * cache   6  2  3  1      //1번 작업 이렇게 끝난다
 * 
 *         0  1  2  3  4
 * cache   2  6  3  1      //2번 작업 끝
 * 
 *         0  1  2  3  4
 * cache   3  2  6  1      //3번 작업 끝
 * 
 *         0  1  2  3  4
 * cache   5  3  2  6  1    //5번 작업 끝
 * 
 *         0  1  2  3  4
 * cache   5  3  2  6  6    //7번 작업 끝
 *
 * 이 cache 메모리 크기만큼에서만 값들이 움직이게끔 한다
 * */

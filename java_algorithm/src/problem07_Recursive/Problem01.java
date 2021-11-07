package problem07_Recursive;

public class Problem01 {
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Problem01 T = new Problem01();
		T.DFS(3);
	}
}

/*
 * 01. 재귀함수(스택프레임)
 * 
 * 재귀함수: 자기가 자기자신을 호출하는 함수
 * 
 * D(3) -> D(2) -> D(1) -> ...
 * 재귀함수는 반복문의 형태임 + 무한 반복함
 * 
 * 재귀함수는 스택 자료구조를 사용한다! (스택프레임)
 * 
 * 				스택
 * 		  |					 |
 *        |				     |
 *D(2)--> |매개변수/지역변수/복귀주소|
 *D(3)--> |매개변수/지역변수/복귀주소|
 *        |------------------|
 * 
 * 스택프레임에 저장되는 것:매개변수/지역변수/복귀주소   
 *    
 * */

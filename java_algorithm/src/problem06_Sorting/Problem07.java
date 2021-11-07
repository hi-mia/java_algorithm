package problem06_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 하나하나를 저장하는 객체를 만드는 클래스 생성
class Point implements Comparable<Point> { //이 클래스는 comparable라는 인터페이스의 구현 클래스 + Point라는 객체를 정렬함
	public int x, y;
	Point(int x, int y) { //생성자로 초기화
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) { //정렬 기준을 설정하는 메소드
		//정렬기준 잡음
		//오름차순 정렬 + this-o 순서로 정렬하려면 음수 값을 return 해야한다: this에서 o를 뺀다
		//내림차순 정렬시에도 음수값을 return해야하니 o에서 this를 뺀다. 음수가 나오게끔 항상 작은 것에서 큰 것을 뺀다
		if (this.x == o.x) return this.y-o.y; //x가 같으면 y 기준 정렬
		else return this.x-o.x;
		
	}
	
}


public class Problem07 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y)); //Point 객체 생성, 생성자 호출 필요
		}
		Collections.sort(arr); //정렬. compareTo 정렬 기준에 의해 sort 해준다
		for(Point o : arr) System.out.println(o.x+ " "+ o.y);
	}
}

/*
 * 07. 좌표 정렬
 * 
 * 내림차순으로 할 때
 * 	if (this.x == o.x) return o.y-this.y; //x가 같으면 y 기준 정렬
	else return o.x-this.x;
 * 
 * */

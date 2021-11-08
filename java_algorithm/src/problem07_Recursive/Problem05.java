package problem07_Recursive;

class Node{
	int data; //번호.. 1번값 2번값 ...
	Node lt, rt; //왼쪽자식 노드주소 / 오른쪽 자식의 노드주소 저장
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Problem05 {
	Node root; // node라는 클래스의 객체 주소를 저장하는 변수
	public void DFS(Node root) {
		
	}
	
	public static void main(String[] args) {
		Problem05 tree = new Problem05();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
	
	
}

/*
 * 05. 이진트리순회(DFS)
 * 
 * [이진트리 기본구조]
 * 
 *        부모 노드(root)
 *       /     \
 *      /       \
 * 왼쪽자식 노드   오른쪽자식 노드
 * 
 * 전위순회: 부모 - 왼쪽  - 오른쪽 //부모가 기준, 부모를 제일 먼저 방문
 * 중위순회: 왼쪽 - 부모 - 오른쪽 (부모가 중앙)
 * 후위순회: 왼쪽 - 오른쪽 - 부모 (부모가 마지막) **
 * 
 * 후위순회는 잘 알아둬야 한다 -> 병합정렬
 * 
 * 출력 = 방문한다
 * 
 * 
 * lt, rt는 Node라는 클래스의 객체 주소를 저장하는 변수임(그래서 Node형으로 함)
 * 
 * */

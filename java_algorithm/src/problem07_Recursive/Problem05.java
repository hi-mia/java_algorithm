package problem07_Recursive;

class Node{
	int data; //��ȣ.. 1���� 2���� ...
	Node lt, rt; //�����ڽ� ����ּ� / ������ �ڽ��� ����ּ� ����
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Problem05 {
	Node root; // node��� Ŭ������ ��ü �ּҸ� �����ϴ� ����
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
 * 05. ����Ʈ����ȸ(DFS)
 * 
 * [����Ʈ�� �⺻����]
 * 
 *        �θ� ���(root)
 *       /     \
 *      /       \
 * �����ڽ� ���   �������ڽ� ���
 * 
 * ������ȸ: �θ� - ����  - ������ //�θ� ����, �θ� ���� ���� �湮
 * ������ȸ: ���� - �θ� - ������ (�θ� �߾�)
 * ������ȸ: ���� - ������ - �θ� (�θ� ������) **
 * 
 * ������ȸ�� �� �˾Ƶ־� �Ѵ� -> ��������
 * 
 * ��� = �湮�Ѵ�
 * 
 * 
 * lt, rt�� Node��� Ŭ������ ��ü �ּҸ� �����ϴ� ������(�׷��� Node������ ��)
 * 
 * */

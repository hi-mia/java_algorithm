package problem07_Recursive;

public class Problem02 {
	public void DFS(int n) { //n�� �Ǹ� ����Լ��� ����� �Ѵ�
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}
	
	public static void main(String[] args) {
		Problem02 T = new Problem02();
		T.DFS(11);
	}
}

/*
 * 02. ������ ���(���)
 * 
 * 2�� ��� �����鼭 ������ ���.
 * n=0�� ���� �� return�ϰ� �����
 * 
 * */

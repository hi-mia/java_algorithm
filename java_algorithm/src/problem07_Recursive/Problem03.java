package problem07_Recursive;

public class Problem03 {
	public int DFS(int n) {
		if(n==1) return 1;
		else return n*DFS(n-1); //����Լ��� return��
		
	}
	
	public static void main(String[] args) {
		Problem03 T = new Problem03();
		System.out.println(T.DFS(5));
	}
}

/*
 * 03. ���丮��
 * 1���� n������ ��
 * 
 * ��͸� �̿��ؼ� �����غ���
 * ����Լ��� ������ ����Ѵ�
 * 
 * ����Լ��� �Լ����� return�޾Ƽ� ��� �����ؼ� ������ ������
 * */
 
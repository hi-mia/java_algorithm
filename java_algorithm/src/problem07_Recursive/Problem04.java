package problem07_Recursive;

public class Problem04 { //�ٽ� ���
	static int[] fibo; //�� ������ ���: �迭 ����
	
	public int DFS(int n) {
		//if(n==1) return 1;
		//else if(n==2) return 1;
		//else return DFS(n-2)+DFS(n-1); //n���� ���� ���Ǿ��� ��+n��° ���� ���� ��
		
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1); //fibo �迭�� ���� �� �ѹ��� ����
	}

	public static void main(String[] args) {
		Problem04 T = new Problem04();
		int n = 10;
		fibo = new int[n+1]; //n���� �ʿ��ϴϱ� �ε�����ȣ+1d�� ������Ѵ�
		T.DFS(n);
		//for(int i=1; i<=n; i++) System.out.print(T.DFS(i)+" ");
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}
}

/*
 * 04. �Ǻ���ġ ���(�޸������̼�)
 * �Ǻ���ġ�� �迭�� ¥�� or ��ͷ� ¥�� 2������ �ڵ����ͺ信�� ���� ��
 * �迭/for�� ���°� ������ �� ����
 * 
 * 
 * */

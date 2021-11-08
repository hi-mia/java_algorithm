package problem07_Recursive;

public class Problem04_2 { //���-�޸������̼�
	static int[] fibo; //�� ������ ���: �迭 ����
	
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]; // fibo�� n�� �ε����� ���� �̹� ������ ���� -> ��ͺθ� �ʿ� ���� �迭�� ����� �� ������ ��
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2)+DFS(n-1); //fibo �迭�� ���� �� �ѹ��� ����
	}

	public static void main(String[] args) {
		Problem04_2 T = new Problem04_2();
		int n = 45;
		fibo = new int[n+1]; //n���� �ʿ��ϴϱ� �ε�����ȣ+1d�� ������Ѵ�
		T.DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}

}

/*
 * 04. �Ǻ���ġ ���(�޸������̼�)
 * �޸������̼� ����ϸ� �ӵ� �ſ� ��������, �ð����⵵ Ȯ ����
 * 
 *  �� �� ���� ���� �����س��� �ʿ�ÿ� ��� ������ ����. �ٽ� ���X
 * 
 * */
 
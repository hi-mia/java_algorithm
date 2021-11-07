package problem06_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//��ǥ �ϳ��ϳ��� �����ϴ� ��ü�� ����� Ŭ���� ����
class Point implements Comparable<Point> { //�� Ŭ������ comparable��� �������̽��� ���� Ŭ���� + Point��� ��ü�� ������
	public int x, y;
	Point(int x, int y) { //�����ڷ� �ʱ�ȭ
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) { //���� ������ �����ϴ� �޼ҵ�
		//���ı��� ����
		//�������� ���� + this-o ������ �����Ϸ��� ���� ���� return �ؾ��Ѵ�: this���� o�� ����
		//�������� ���Ľÿ��� �������� return�ؾ��ϴ� o���� this�� ����. ������ �����Բ� �׻� ���� �Ϳ��� ū ���� ����
		if (this.x == o.x) return this.y-o.y; //x�� ������ y ���� ����
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
			arr.add(new Point(x, y)); //Point ��ü ����, ������ ȣ�� �ʿ�
		}
		Collections.sort(arr); //����. compareTo ���� ���ؿ� ���� sort ���ش�
		for(Point o : arr) System.out.println(o.x+ " "+ o.y);
	}
}

/*
 * 07. ��ǥ ����
 * 
 * ������������ �� ��
 * 	if (this.x == o.x) return o.y-this.y; //x�� ������ y ���� ����
	else return o.x-this.x;
 * 
 * */

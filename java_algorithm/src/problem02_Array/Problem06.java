package problem02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem06 {
	
	public boolean isPrime(int num){ //소수 판별 함수
		if(num==1) return false; //넘어온 숫자 1이면 소수X
		for(int i=2; i<num; i++){ //2부터 자기자신 전까지
			if(num%i==0) return false; //약수가 발견되면(i=약수) 소수가 아니다
		}
		return true;
	}

	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		//for문 돌면서 뒤집는다
		for(int i=0; i<n; i++){
			int tmp=arr[i];
			int res=0; //뒤집은 값이 저장될 변수
			while(tmp>0){
				int t=tmp%10;
				res=res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
		//소수라면 arrayList에 추가해서 return한다
	}
	public static void main(String[] args){
		Problem06 T = new Problem06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){ //arrayList를 받음(소수로 뒤집은 숫자들)
			System.out.print(x+" ");
		}
	}
	
}

/*
 * 6. 뒤집은 소수
 * 
 * */
 
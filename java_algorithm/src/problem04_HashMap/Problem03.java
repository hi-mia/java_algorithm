package problem04_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem03 {
	
	private ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++) {//처음에 인덱스 0부터니까 k전까지 세팅해놓는다.
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		//투 포인터 알고리즘 - rt가 가고 lt가 쫓아가면서 연속구간이 4를 유지하면서 쭉 밀고 간다
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1); //lt는 당연히 key값이 있다. getOrDefault로 없으면 있게 만들었기 때문
			//lt 이동하면 값 1개 감소시키라는 뜻
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]); //value가 0이면 그 key값 삭제해라
			lt++;
			
		}
			
		return answer;
	}

	public static void main(String[] args) {
		Problem03 T = new Problem03();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}


	
}

/*
 * 03. 매출액의 종류(Hash, 투 포인터, sliding window)
 * 
 * 총 7일, 연속적인 4일의 매출액 출력 (k=4, k는 연속된 길이)
 * 4일 짜리로 window를 만들어 밀고 나간다
 * 
 *       lt          rt
 * arr   20  12  20  10  23  17  10
 * 
 * lt는 0을 가리키고 rt는 4일을 가리킴(k=4), rt는 index 3부터 돈다
 * 3일 까지만 먼저 해쉬맵에 카운팅 세팅을 함
 * 
 *     20  12 
 * HM  2   1 
 * 1) (k=3까지 20일의 value값 총 2개, 12는 1개) - 첫 세팅
 * 2) rt가 가리키는 10을 해싱함
 *     20  12  10
 * HM  2   1   1
 * 
 * arrayList answer
 * HashMap.size()의 값을 answer에 넣는다
 * 
 * answer 3
 * 
 * answer에 넣은 뒤 lt가 가리키는 지점(20)을 해쉬맵에서 카운팅 하나를 뺀다
 * (윈도우에서 벗어나니까)
 *     20  12  10
 * HM  1   1   1
 * 
 * 그 뒤 rt가 증가한다 (rt 인덱스 = 4), 그것을 해쉬맵에 put 해서 카운팅한다
 * 
 *     20  12  10  23
 * HM  1   1   1   1
 * 
 * answer  3  4
 * 
 * 카운팅을 하나 뺄 때 value값이 0이 되면 그 key를 삭제해야 한다. 그 뒤에 lt 증가
 * 안 그러면 hash.size()할 때 그 0이 된 key도 카운팅 해버린다.
 * 
 *     20  12  10  23  
 * HM  1   0   1   1    -> 12삭제
 * 
 *     20 17 10  23 
 * HM  1  1  1   1 
 * 
 * answer  3  4  4  3
 *              (5가 아니다)
 * 
 * */

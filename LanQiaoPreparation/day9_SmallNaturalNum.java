package one_month;

import java.util.*;

public class day9_SmallNaturalNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int s = scan.nextInt();
			if(list.contains(s) != true) {
				max = Math.max(max, s);
				list.add(s);
			}
		}
		//���򷽷�
		//Collections.sort(list,(a, b)->Integer.compare(a,b));
		boolean flag = true;
		//for(int i = 0; i < list.get(list.size()-1); i++) {
		for(int i = 0; i < max; i++) {
			if(!list.contains(i)) {
				System.out.println(i);
				flag = false;
				//�������break����Ȼ��һֱִ��ֱ����ʱ
				break;
			}
		}
		if(flag == true) {
			System.out.println(max + 1);
		}
	}
}

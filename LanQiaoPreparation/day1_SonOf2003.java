package one_month;

import java.util.Set;
import java.util.HashSet;

public class day1_SonOf2003 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//set��add()����Boolean�ͣ���������򲻼����Ԫ�أ�����false
		
		//�����ʵ���2023
		int i = 1;
		while(i < 2023) {
			if (2023 % i == 0) {
				set.add(i);
				set.add(2023/i);
			}
			i++;
		}
		//size()��set������
		System.out.println(set);
		System.out.println(set.size());
	}
}

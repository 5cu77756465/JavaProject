package one_month;

import java.util.Scanner;

/*
 * �ո�ѡ���ƴ��벻С��ȫɾ�ˣ�����history��û�м�¼
 * ������Ӧ��ѧϰһ����ô������ʱ�������*/

public class day3_LeftRightNumSimilar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int L = 0;
		int R = 0;
		int num = 0;
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == 'L') L++;
			if(str.charAt(i) == 'R') R++;
			if(L == R) num++;
		}
		
		System.out.println(num);
		scan.close();
	}
}

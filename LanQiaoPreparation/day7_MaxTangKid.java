package one_month;

import java.util.Scanner;
/*֪ʶ�㣺javaĬ�϶�������飬��Ĭ��ֵ*/
public class day7_MaxTangKid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ns = new int[n+1];
		int m = scan.nextInt();
		for(int i = 0; i < m; i++) {
			int j = scan.nextInt();
			ns[j]++;
		}
		int max = 1;
		for(int i = 1; i < n+1; i++) {
			if(ns[i] > ns[max]) max = i;
		}
		System.out.println(max);
	}
}

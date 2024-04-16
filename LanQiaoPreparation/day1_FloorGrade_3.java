package one_month;

import java.util.Scanner;

public class day1_FloorGrade_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		//�����Ƕ�̬�滮�������������������߼�������
		//ѧ������java�����ƣ�long
		long dp[] = new long[n+1];
		/*
		 * ���Ǻ�����ΪʲôҪ����dp[0]Ϊ1 dp[0] = 1;
		 */
		dp[a] = 1;
		dp[b] = 1;
		dp[c] = 1;
		
		for(int i = 1; i <= n ; i++) {
			//i����a��û��Ҫ�����
			if(i-a > 0) {
				dp[i] += dp[i - a];
				dp[i] %= 1000000007;
			}
			if(i-b > 0) {
				dp[i] += dp[i - b];
				dp[i] %= 1000000007;
			}
			if(i-c > 0) {
				dp[i] += dp[i - c];
				dp[i] %= 1000000007;
			}
		}
		System.out.println(dp[n]);
		
		scan.close();
	}
}

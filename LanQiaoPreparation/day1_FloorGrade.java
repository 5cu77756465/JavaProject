package one_month;

import java.util.Scanner;

public class day1_FloorGrade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		/*
		 * д�궯̬�滮������������Ƕ�̬�滮��1��2��3
		 * int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();
		 */
		
		//���Զ�̬�滮
		int n = 4;
		System.out.println(DP(4));
		
		scan.close();
	}
	//���������ܳ���Ҳ������ȷ���������shishang
	public static int DP(int n) {
		if(n == 1 || n == 2 || n == 3) {
			return n;
		}
		//��ʼ��dp��
		int[] dp = new int[n+1];
		
		//��ʼ״̬
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		
		//ʹ�ù�������
		/*
		 * int q = 1; int w = 2; int e = 3;
		 */
		
		//״̬ת��
		for(int i = 4; i <= n; i++) {
			 dp[i] = dp[i-1] + dp[i-2] +dp[i-3]; 
			/*
			 * int tmp = e; e = q + w + tmp; q = w; w = tmp;
			 */
		}
		return dp[n];
		//return e;
	}
}

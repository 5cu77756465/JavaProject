package one_month;

import java.util.Scanner;

public class day16_UnfairCoin {
	static double ans = 0;
	static int t = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		a /= b;
		//b = 1-a;
		K(n, a);
		System.out.println(ans);
		System.out.println(t);
		
		
		
		scan.close();
	}
	//δ���ǵ�������1������011������ͻᾭ��11��10����10Ӧ�þͲ��üӵ�
	//���Ҳ���Ҫ�õ�a����Ҫ�õ�1-a����110���Ǿ���a*a*(1-a)��������ֻ����aһ��
	public static void K(int n, double a) {
		if(n == 0) return;
		for(int i = 0; i <= 1; i++) {
			if(i == 1) t++;
			ans += (i * a);
			ans %= 998244353;
			K(n-1, a);
		}
		return;
	}
}

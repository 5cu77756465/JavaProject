package one_month;

import java.util.Scanner;
//���������ϸһ�����������У�û��˳�����
//Arrays.sort(����)���Խ���������
//���и����ɲ����ж�������Сֱ�������Math.abs(a-b)
public class day10_MakeSameArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		int num = 0;
		for(int i = 0; i < n; i++) {
			int B = scan.nextInt();
			if(B > A[i]) {
				num += (B - A[i]);
			}else {
				num += (A[i] - B);
			}
		}
		System.out.println(num);
		scan.close();
	}
}

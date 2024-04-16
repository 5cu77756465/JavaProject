package one_month;

import java.util.Scanner;
import java.lang.Math;

/*
 * �ܽ᣺
 * ������һ�������ص����⣺�δ���
 * һ��ʼ�ҿ�������Խ�磬����һֱ�ľ���û����ë��
 * �������뵽����������鲢��int�ͣ�����������⣬������ȷ
 * ��ô˵�δ���������������Ͳ��ԣ�����һ���ַ������ȴ���int���µ��Ƴ���
 * �ڼ���ѧ�������intǿתchar
 * (char)scan.nextInt(),��û�Թ��ַ������ǿת�᲻������⣬����8�ֽ�תС�ֽڷ�������Ϊֵ��һ��
 * ����һ������û���Թ���scan.next().charAt(0),Ӧ��ֻ�ʺϵ����ַ�*/
public class day2_MaxY {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 int n = scan.nextInt();
		 int m = scan.nextInt(); 
		 char[][] arr = new char[n][m];
		 for(int i = 0; i < n; i++) {
			 String str = scan.next();
			 for(int j = 0 ;j < m; j++) {
				 arr[i][j] = str.charAt(j);
				 } 
			 }
		 
		int num = 0;
		//������ʵ�ִ���������Χ�ߣ�Ȼ���ж����y�ĳ��Ⱥ;���ߵľ��룬���Դﵽ���ñ���ȫ��Ԫ�ص�Ч��
		for(int i = 1; i < n-1; i++) {
			for(int j = 1; j < m-1; j++) {
				//���￨ס�ˣ���Ϊarr[n][m]���鲻�ܸ�ֵ�������У�������⵽�������arr
				num = Math.max(num, YorNot(n, m, arr, i, j));
			}
		}
		System.out.println(num);
		
		scan.close();
	}
	public static int YorNot(int n , int m ,char[][] arr, int i, int j) {
		int num = 1;
		while(bianjie(n, m, i, j, num)) {
			if(arr[i][j] == arr[i-num][j-num] && arr[i][j]==arr[i-num][j+num] &&arr[i][j]==arr[i+num][j]) {
				num++;
			} else break;
		}
		return num-1;
	}
	
	public static boolean bianjie(int n, int m , int i, int j, int t) {
		if(i - t >= 0 && i + t < n && j - t >= 0 && j + t < m) return true;
		return false;
	}
}

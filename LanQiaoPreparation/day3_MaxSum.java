package one_month;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * �״γ��ԣ�Խ�磺20
 * �ĵĹ����з��ֺ���������Խ�磬����intԽ�磬����ô�����intӦ��Ҳ��Խ�磬BigInteger�ĵ�Ҳûë��
 * �ڶ��γ��ԣ����0
 * ʹ�ò���problem���ԣ���five����������
 * ���������ˣ���add()������������⣬BigInteger����a.add(b)������ӷ�
 * ���������ֱ�ӵ�a�������з���ֵ������������Ҫ��a=������,�������Ҳ�����ù����Զ��巽���������*/

public class day3_MaxSum {
	static int problem1 = 2;
	static String problem2 = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[30][20];
		for(int i = 0; i < 30; i++) {
			for(int j = 0; j < 20; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		BigInteger m = new BigInteger("0");
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 15; j++) {
				m = m.max(Five(arr, i, j));
			}
		}
		
		System.out.println(m);
		scan.close();
	}
	/*
	 * public static int MaxIs(int a, int b) { if(a >= b) return a; else return b; }
	 */
	
	public static BigInteger Five(int[][] arr, int i, int j) {
		BigInteger five = new BigInteger("0");
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				String str = String.valueOf(arr[i+x][j+y]) ;
				/*
				 * problem2 = str; 
				 * while(problem1 == 2) { 
				 * //�ַ�����ȷ,��five.add(newBigInteger(str));������
				 *  System.out.println(problem2); 
				 *  problem1--; }
				 */
				
				//five.add(new BigInteger(str));
				five = five.add(new BigInteger(str));
				/*
				 * while(problem1 == 1) { 
				 * //���0��δ�ӽ�ȥ 
				 * System.out.println(five); 
				 * problem1--; 
				 * }
				 */
				
			}
		}
		/*����ֱ����ѭ������������ֻ�Ǿ���ֱ��������������ٶȲ�û��
		 * int five = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j] + arr[i+4][j]
		 * + arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+3][j+1] + arr[i+4][j+1]
		 * + arr[i][j+2] + arr[i+1][j+2] + arr[i+2][j+2] + arr[i+3][j+2] + arr[i+4][j+2]
		 * + arr[i][j+3] + arr[i+1][j+3] + arr[i+2][j+3] + arr[i+3][j+3] + arr[i+4][j+3]
		 * + arr[i][j+4] + arr[i+1][j+4] + arr[i+2][j+4] + arr[i+3][j+4] +
		 * arr[i+4][j+4];
		 */
		return five;
	}
}

package one_month;

import java.util.Scanner;
import java.math.BigInteger;
/*����*/
public class day10_MakeNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] strr = str.split(" ");
		//����ʵҲ�뵽������ÿ����ַ��һλ����size����-1һֱ��9
		BigInteger N = new BigInteger(strr[0]);
		//BigInteger M = new BigInteger(str2);
		int m = Integer.parseInt(strr[1]);
		
		String str3 = "";
		while(!N.equals(new BigInteger("0"))) {
			//while(!N.equals(0)) {
			//���﷢��������ѭ��,��������������ͻ�һֱ������������ͣ
			
			str3 += "9";
			N = N.subtract(new BigInteger("1"));
			
			
		}
		
		System.out.println(str3);
		
			int n = str3.length();
			n *= 9;
			System.out.println(n);
			n -= m;
			System.out.println(n);
			N = new BigInteger(str3);
			m = n/9;
			System.out.println(m);
			String strm = "";
			while(m != 0) {
				strm += "0";
				m--;
			}
			
			//�������str3ֻ��һ��������һ��9��m��0���Ǿ���������1����1�����Ǵ�0 ��ʼ����Ȼ���9
			//str3.substring(m+1)
			//��֪���ˣ���û�а��������
			str3 = str3.substring(m+1);
			//
			n = n%9;
			str3 += n;
			str3 += strm;
			System.out.println(str3);
			scan.close();
			
			
			
		
	}
}

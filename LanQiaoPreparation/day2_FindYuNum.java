package one_month;

import java.lang.Long;

/*
 * ����Ϊlong�����ܣ������ɻ�Խ��
 * �Ƿ���valueOf����Stringתint��תlong��
 * valueOf�ܺ���,�����ַ���ת�������ͣ�Ҳ������������ת�ַ���
 * java.lang.LongҪ��ס*/
public class day2_FindYuNum {
	public static void main(String[] args) {
		//������ֱ����12345678901234567890123456789012345678901234567890,Ӧ����Խ��
		long l = Long.valueOf("1234567890");
		l %= 2023;
		System.out.println(l);
		
		 long t = 1234567890; 
		 
		 for(int i = 0; i < 4; i++) {
		 t %=2023;
		 t *= Long.valueOf("10000000000");
		 t += Long.valueOf("1234567890");
		 }
		 t %=2023;
		 System.out.println(t);
		 
	}
}

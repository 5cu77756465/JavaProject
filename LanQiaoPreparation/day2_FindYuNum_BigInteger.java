package one_month;
import java.util.Scanner;
import java.math.BigInteger;
// 1:����package
// 2: ��������Main, �����޸�

public class day2_FindYuNum_BigInteger {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        //�ڴ��������Ĵ���...
			/*
			 * ���Ǻ�����10������
			 * ���Ӧ���ǽ���
			 * BigInteger a = new
			 * BigInteger("12345678901234567890123456789012345678901234567890",10);
			 * BigInteger b = new BigInteger("2023",10);
			 */
	        BigInteger a = new BigInteger("12345678901234567890123456789012345678901234567890");
	        BigInteger b = new BigInteger("2023");
	        System.out.println(a.mod(b));
	        scan.close();
	    }
	
}

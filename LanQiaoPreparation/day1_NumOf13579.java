package one_month;

//Scanner��
import java.util.Scanner;

public class day1_NumOf13579 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//next()����ַ���
       // String str = scan.next();
		String str = "111222333111222333111222333";
        
        int len = str.length();
        //indexOf���ָ���ַ����ڵ�����,�����-1��Ϊ�޴��ַ�
		/*
		 * Ҳ��һ�������indexOf������������ǻ��ڱ����������Լ���������Ӧ�ø���һ��
		 * int t = str.indexOf('1'); while(t != -1) {
		 * 
		 * }
		 */
        int num = 0;
        for(int i = 0; i < len; i++) {
        	//�����������Ԫ��
        	//���ﻹ����һ���ر�ĵط����������ص���char��������ʹ��int���ɿ��У������ٶȸ���
        	char k = str.charAt(i);
			
			  if(k == '1' || k == '3' || k == '5' || k == '7' || k == '9') { num++; }
			 
        	
        	//�Ľ���ʹ��charתintȻ������ż
			/*
			 * �Ľ�ʧ�ܣ������������⣬Ӧ����getType������
			 * int z = Character.getType(k); if(z % 2 == 1) { num++; }
			 */
        	
        }
        
        System.out.println(num);
        
        //�ر�scan
        //scan.close();
        
	}
}

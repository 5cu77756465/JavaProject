package one_month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * ���벻��ȷ���������ܽ�һ��
 * �ܽ᣺
 * ��ʱ����벻��run������ֻ��˵run configurations
 * �����½�һ�������ƴ����ȥ���Կ��ĸ�����������
 * ��ʱ�������Զ��ˣ�ԭ����λ��Ҳ�������У���ʱ������½�λ�����о���
 * 
 * List<String> str1 = new ArrayList<String>(num); 
 * ����ֻ˵�˽���num���ռ䣬�����������ǿյ�
 * ���Բ�����get()��Ȼ�ᷢ��
 * IndexOutOfBoundsException - �������������Χ (index < 0 || index >= size())

 * */
public class day5_test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int num = scan.nextInt();
		//int num = 3;
		//String str = scan.next();
		//String str = "asadadad";
		int num = scan.nextInt();
		String str = scan.next();
		List<String> str1 = new ArrayList<String>(num); 
		for(int i = 0; i < num; i++) {
			str1.add(i, "");
		}
		int len = str.length();
		int lendd = 0;
		for(int i = 0;lendd < len;) {

			String s1 = "";
			s1 += str.charAt(lendd);
			s1 = str1.get(i)+s1;
			str1.add(i, s1);
			i++;
			lendd++;
			
			  if(i == num) {
				  i -= 2;
				  while(i != 0 && lendd < len) {
					  String s2 = "";
					  s2 += str.charAt(lendd); 
					  str1.add(i, str1.get(i)+s2); 
					  i--; lendd++; 
					  } 
				  }
			 
		}
		String str2 = "";
		
		  for(int i = 0; i < num; i++) {
			  str2 += str1.get(i); 
			  }
		 
		System.out.println(str2);
		scan.close();
		System.out.println("test");
	}
}

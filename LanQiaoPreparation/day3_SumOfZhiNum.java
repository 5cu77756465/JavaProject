package one_month;

import java.util.List;
import java.util.LinkedList;
/*
 * һ��ʼ��ʹ�õ���Ƕ��ѭ����Ȼ��ʱ��̫���˶�û�����
 * ���ڽ�Ƕ�׷���,�������ٶ�
 * ����������ˣ����ַ������ҵ����⣬��û������������� 
 * һ�������ɴ����������С��������ĺͣ�����û�������Ǹ�ֵ���еĻ������ܿ�������������������
 * ����ֻ��Ҫ�жϿ�����С�ڲ��ֵ��������������ӣ��Ϳ�֪�����ǲ���Ϊ����*/
public class day3_SumOfZhiNum {
	public static void main(String[] args) {
		int sum = 1;
		List<Integer> list = new LinkedList<>();
		
		for(int i = 600; i < 1000000; i++) {

			/*
			 * �ж������Ĵ��󷽷�
			 * if(i%2 != 0 &&i%3 != 0 &&i%5 != 0 &&i%7 != 0 ) { list.add(i); }
			 */
			int j = 2;
			//sqrt(double a) 
			for(; j < Math.sqrt(i); j++) {
				if(i % j == 0) break;
				
			}
			//�����Ҿ����˺ܾã�������ͨ�ˣ������double��
			//j�����������������һ����С�������ֱ��˵��������������
			if(i % j != 0 && j > Math.sqrt(i)) list.add(i);
		}
		//Ϊʲô����ڵڶ������Ӷ��أ���Ϊ����*����С��n���ȳ���*nС̫����
		for(int i = 0; i < list.size(); i++) {
				int k = list.get(i);
				int t = k % 10;
				k /= 10;
				while(k != 0) {
					t += k % 10;
					k /= 10;
				}
				if (t == 23) sum++;
			
		}

		System.out.println(sum);
	}
}

package one_month;

/*
 * �ܽ�
 * �����˳�����Ҫ
 * ��������ʹ��ҲҪ�õ�λ
 * java�������ǿ��
 * add:һ��֪ʶ�㣬�㷨���ύ�㷨��ʱ����ֵһ����int
 * ������������double���ͣ��������4186.0�������ǽ��4186
 * �����ɲ�ͨ����*/
public class day3_LRQuJian {
	public static void main(String[] args) {
		//����91��90��ֱ�Ӽ��������
		System.out.println(91+90+"������"+1);
		int num = (1 + 91) * 91 / 2;
		int a =   91 / 2 ;
		a *= (1 + 91);
		
		/*�ҷ�����һ��֪ʶ�㣬���㸳ֵ��double��91/2������Ҳ���ȵ�int��תdouble*/
		double b = 91 / 2 ;
		b *= (1 + 91);
		
		double c = 91;
		c /= 2;
		c *= (1 + 91);
		 
		System.out.println(num + "," + a + "," + b + "," + c);
		
		/*�����
		 * 181������1
			4186,4140,4140.0,4186.0
			
			���������*/
	}
}

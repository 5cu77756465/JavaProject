package one_month;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;
/*
 * �����n�����벻����0
 * ����˵�Ǽ���
 * �������0�ǲ�����Ҫ����0����λ�����
 * ������ȫ���н�������ˣ�������ϳ�stringӦ�ò��õ����������,��Ӧ���ǽ�׳��
 * 
 * ��ͻȻ�뵽��Ӧ��ȥ��ѧϰString�ķ���
 * ������ĺ����ô�
 * 
 * bug�����������Stringʹ��charAt()תint������
 * ת����ascii�������������һ��*/
public class day4_1_BlueMakeZhiNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String str = scan.next();
		int iii = scan.nextInt();
		//��һ����ʵ�ֲ�ͬ˳��ȫ����
		//�����
		int changdu = 0;
		int tmp = iii;
		while(tmp != 0) {

				changdu++;
				tmp /= 10;
			
		}
		//int[] nums = new int[str.length()];
		//for(int i = 0; i < str.length(); i++) {
		tmp = iii;
		int[] nums = new int[changdu];
		for(int i = 0; i < changdu; i++) {
		
			/*���Ĵ�ֱ���������
			 * �����ǲ������������
			 * �ã�����������
			 * �ѵ���charֱ��תint����������ҵڶ��θĵ�ʱ���ܷ������⣬��ʱ����Ҳ����charתint
			 * ��ֱ�Ӱ�next������int����ȥ��
			 * һ��ʼ��Ҳ�ǵ���intԽ�����String��
			 * ����������֪��int�����ܴ������*/
			nums[i] = tmp%10;
			tmp /= 10;
			//System.out.println(nums[i]);����θ����ɹ�
		}
		List<List<Integer>> res = permutations(nums);
		List<String> strs = new ArrayList<String>();
		/*ͻȻ�뵽һ���Ƿ��ܴ洢�ַ�����ν�List<List>��Ϊһ��List
		 * �Ӷ�����forѭ������ٶ�
		 * �������治ͬ���ݵļ����ʶ������������Ҫ�������
		 * ���Ȼ��ǽ����δ洢�ַ�char
		 * List<char> strss = new ArrayList<char>();*/
		for(List<Integer> state: res) {
			strs.add(Change(state));
		}
		
		int num = 0;
		
		for(String s : strs) {
			/*��һ�ν�������������
			 * System.out.println(s);
			 * ���
			 * 13
				4951
				5149
				1
				����ASCII���Ǿ���strתint����decode������
				������ֱ�Ӹ������������*/
			if(ZhiShu(s) == true) num++;
		}
		System.out.println(num);
		
		
	}
	
	public static void backtrack(List<Integer> state, int[] choices, boolean[] selected, List<List<Integer>> res ) {
		if(state.size() == selected.length) {
			res.add(new ArrayList<Integer>(state));
			return ;
		
		}
		Set<Integer> duplicated = new HashSet<Integer>();
		for(int i = 0; i < choices.length; i++) {
			int choice = choices[i];
			//��֦
			if(!selected[i] && !duplicated.contains(choice)) {
				duplicated.add(choice);
				selected[i] = true;
				state.add(choice);
				backtrack(state, choices, selected, res);
				selected[i] = false;
				state.remove(state.size() - 1);
			}
		}
	}
	
	public static List<List<Integer>> permutations(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backtrack(new ArrayList<Integer>(), nums, new boolean[nums.length], res);
		return res;
	}
	
	public static String Change(List<Integer> state){
		String str = "";
		for(int i : state) {
			str += i;
			//str += i; �����θĶ���������
			/*str += String.valueOf(i);
			 ���ĴΣ�
			 * System.out.println(i);
			 * �ð�ԭ�������������*/
		}
		/*�����θģ��������Ȳ���һ��,��ȻҪ��Դ������
		System.out.println(str);*/
		
		return str;
	}
	
	public static boolean ZhiShu(String str) {
		//�����˼�������day4_QuanPaiLie
		//BigInteger bi = new BigInteger(str);
		//for(int i = 0; i < bi.sqrt())
		
		/*int i = Integer.decode(str);
		int i = Integer.decode(str).intValue();Ҳ����
		��Ҫ�Ҹ��µķ���Stringתint*/
		
		/*�ڶ��θ�����Ҹĳ���������charǿתint��Сת��Ӧ���Ǻ���ģ���������ת��ASCII
		 * �������ʶ��������������⣬Ӧ���Ǹ�ǰ�������*/
		/*int i = 0;
		for(int t = 0; t < str.length(); t++) {
			i *= 10;
			i += str.charAt(t);
		}*/
		int i = Integer.decode(str);
		for(int j = 2; j < Math.sqrt(i); j++) {
			if(i % j == 0) return false;
		}
		return true;
	}
}

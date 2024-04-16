package one_month;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;

public class day4_QuanPaiLie {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		System.out.println(permutationsI(a));
		//�޷��ų��ظ������Բ��������Ԫ��
		int[] b = {1, 2, 2};
		System.out.println(permutationsI(b));
		
		//ʹ��set
		int[] c = {1, 2, 2};
		System.out.println(permutationsII(b));
		
		int[] d = {1, 2, 2};
		System.out.println(permutationsIII(d));
		//��ֻ��һ�����ԣ���ʵ֤��int���Դ���ô��
		System.out.println(1000000000);
		int t = 1000000000;
		/*����֪ʶ��:���Կ�����취�����Լ��
		 * BigInteger
		 * gcd(BigInteger val) 
          ����һ�� BigInteger����ֵ�� abs(this) �� abs(val) �����Լ����
          abs() 
          ������ֵ�Ǵ� BigInteger �ľ���ֵ�� BigInteger��*/
		BigInteger big = new BigInteger("1000000000");
		//�ұ���Ϊ�ҵ��������BigInteger�����ţ���ʵ���ҿ��ܴ��ˣ���ʱû�ҵ�
		System.out.println(Math.sqrt(t) + ","+big.pow((int)0.5));
		
		/*����ȥѧInteger�ˣ�����ʱֻ������ͨ����תString����valueOf
		 * String��û�кõİ취ת��ͨ
		 * ��������һ��Integer.decode(String)ת��Integer
		 * Integer�ֿ�����intValueתint
		 * ��ʵ֤����������ǿת
		 * �������ʵ����ܣ����day4_1_BlueMakeZhiNum
		 * ���������������ֱ��תASCII
		 * ����intValueҲ����
		 * ����ʵ���ָı����ҵ��뷨������ȥ���Ǹ������*/
		int k1 = Integer.decode("1213");
		int k2 = Integer.decode("1213").intValue();
		System.out.println(k1);
		System.out.println(k2);
	}
	
	//�����Ԫ��
	public static void backtrack(List<Integer> state, int[] choices, boolean[] selected, List<List<Integer>> res) {
		if(state.size() == choices.length) {
			res.add(new ArrayList<Integer>(state));
			return;
		}
		
		for(int i = 0; i < choices.length; i++) {
			int choice = choices[i];
			//��֦
			if(!selected[i]) {
				//����:����ѡ�񣬸���״̬
				selected[i] = true;
				state.add(choice);
				backtrack(state, choices, selected, res);
				selected[i] = false;
				state.remove(state.size() - 1);
			}
			
		}
	}
	
	//�����Ԫ��
	public static void backtrack2(List<Integer> state, int[] choices, boolean[] selected, Set<List<Integer>> res) {
		if(state.size() == choices.length) {
			res.add(new ArrayList<Integer>(state));
			return;
		}
		
		for(int i = 0; i < choices.length; i++) {
			int choice = choices[i];
			//��֦
			if(!selected[i]) {
				//����:����ѡ�񣬸���״̬
				selected[i] = true;
				state.add(choice);
				backtrack2(state, choices, selected, res);
				selected[i] = false;
				state.remove(state.size() - 1);
			}
			
		}
	}
	
	//�����Ԫ�أ������ţ�
	public static void backtrack3(List<Integer> state, int[] choices, boolean[] selected, List<List<Integer>> res) {
		if(state.size() == choices.length) {
			//�������new ArrayList()���Ͻ������������ǣ����ֱ��state�����ܷ���state���ı�Ĵ���
			res.add(new ArrayList(state));
			return;
		}
		Set<Integer> duplicated = new HashSet<Integer>();
		for(int i = 0; i < choices.length; i++) {
			int choice = choices[i];
			if(!selected[i] && !duplicated.contains(choice)) {
				duplicated.add(choice);
				selected[i] = true;
				state.add(choice);
				backtrack3(state, choices, selected, res);
				selected[i] = false;
				//remove����size()-1����i
				state.remove(state.size() - 1);
				
			}
		}
	}
	
	public static List<List<Integer>> permutationsI(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//�����new�õĺ������ʡ�˿ռ�
		backtrack(new ArrayList<Integer>(), nums, new boolean[nums.length], res);
		return res;
	}
	public static Set<List<Integer>> permutationsII(int[] nums){
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		backtrack2(new ArrayList<Integer>(), nums, new boolean[nums.length], res);
		return res;
	}
	public static List<List<Integer>> permutationsIII(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backtrack3(new ArrayList<Integer>(), nums, new boolean[nums.length], res);
		return res;
	}
}

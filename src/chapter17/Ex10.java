package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet <>(); 
		
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);
		
		System.out.println("�ʱ� :" + set);
		
		set.add(1);
		
		System.out.println("1 ���� :" + set);
		
		if(set.add(3)) {
			System.out.println("3�� �߰�����");
		} else {
			System.out.println("3�� �߰����� ������");
		}
		
		set.remove(1);
		System.out.println("1 ���� : " + set);
		
		for ( Integer number : set) {
			System.out.println(number);
		}
		
		Iterator<Integer> iterator = set.iterator();
		Integer nthInteger;
		
		int count = 1; 
		iterator.hasNext();
		
		while (iterator.hasNext()) {
			nthInteger =  iterator.next();
			System.out.print(nthInteger);
			
			count ++;
		}
		
	}

}

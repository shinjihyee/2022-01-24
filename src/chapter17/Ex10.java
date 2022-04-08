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
		
		System.out.println("초기 :" + set);
		
		set.add(1);
		
		System.out.println("1 저장 :" + set);
		
		if(set.add(3)) {
			System.out.println("3을 추가했음");
		} else {
			System.out.println("3을 추가하지 못했음");
		}
		
		set.remove(1);
		System.out.println("1 삭제 : " + set);
		
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

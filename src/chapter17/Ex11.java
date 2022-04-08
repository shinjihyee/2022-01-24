package chapter17;

import java.util.HashSet;
import java.util.Set;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Character> set = new HashSet <>();
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			set.add(ch);
		}
		
		int count = 1;
		for (Character ch : set) {
			if (count % 2 ==1 ) {
				continue;
			}
			System.out.println(ch + ",");
		}
	}

}

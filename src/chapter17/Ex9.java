package chapter17;

import java.util.ArrayList;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer ("홍길동", "010-1234-5678", 1);
		Customer c2 = new Customer ("홍길동", "010-1234-5678", 3);
		Customer c3 = new Customer ("고영희", "010-1111-2222", 2);
		
		System.out.println("c1,c2가 같나요 ? " + c1.equals(c2));
		
		ArrayList <Customer> list = new ArrayList<> () ;
		list.add(c1);
		list.add(c3);
		
		
		System.out.println(list.contains(c2));
		
//		list.clear();
//		
//		System.out.println(list.isEmpty());
		
		System.out.println("-----------------------------");
		
		Customer removeCustomer = new Customer ("고영희", "010-1111-2222", 2);
		
		System.out.println("삭제 전" + list);
		
		list.remove(removeCustomer);
		
		System.out.println("삭제 후 :" + list);
		
		if(list.remove(removeCustomer)) {
			System.out.println("데이터를 list에서 지웠습니다.");
		} else { System.out.println("지울 데이터가 list에 없습니다. ");
	}
	}
}

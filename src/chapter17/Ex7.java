package chapter17;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer c1 = new Customer ("홍길동" , "010-1473-3698" , 32);
		Customer c2 = new Customer ("김영희" , "5689" ,5) ;
		
		ArrayList <Customer> customerList = new ArrayList <>();

		customerList.add(c1);
		customerList.add(c2);
		Customer wanted = new Customer("홍길동" , "010-1473-3698" , 32);
		
		// contains는 내부적으로 인자로 전달 받은 값과 이 리스트에 들어있는 모든 데이터를 
		// 비교 연산해서 true가 나오면 true를 반환
		// 마지막까지 true가 나오지 않았으면 false를 반환해야한다. 
		// contains가 우리가 의도한대로 동작하도록 할려면 equals 메서드를 오버라이딩을 하면 된다.
		System.out.println(	customerList.contains(wanted));
		
		 
//		customerList.contains(wanted);
//	
 
//		for (int i = 0; i<customerList.size(); i++) {
//			Customer nthCustomer = customerList.get(1);
//			if (nthCustomer.getName ().equals("홍길동") && nthCustomer.getTel ().equals("010-1473-3698") && nthCustomer.getSeat() == 32) {
//				System.out.println("true"); 
//			}else {System.out.println("False");
//			}
		

		
		
	}

}

package chapter17;

import java.util.ArrayList;

public class Ex3 {
	
	public void printAllcustomer (ArrayList <Customer> customerList) {
		for (int i=0; i<=customerList.size(); i++) {
			Customer nthCustomer = customerList.get(i);
			System.out.println(nthCustomer);
			String nthCustomerName = nthCustomer.getName();
			String nthCustomerTel = nthCustomer.getTel();
			int nthCustomerSeat = nthCustomer.getSeat();
			
			System.out.println(i+1 + "¹øÂ° ±¸¸ÅÀÚÀÇ Á¤º¸");
			System.out.println("ÀÌ¸§ :" + nthCustomerName);
			System.out.println("¹øÈ£ : " + nthCustomerTel);
			System.out.println("ÁÂ¼® : " + nthCustomerSeat);
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 mng = new Ex3();
		
		Customer c1 = new Customer ("È«±æµ¿" , "123-4567" , 15);
		Customer c2 = new Customer ("±è¿µÈñ" , "5689" ,5) ;
		
		ArrayList <Customer> customerList = new ArrayList <>();

		Customer c3 = new Customer("±è¿µ¼ö" , "010-7536-9514" , 17) ;
		
		customerList.add(0, c3);
		
		
		customerList.add(c1);
		customerList.add(c2);
		

		
		customerList.remove(1);
		
		mng.printAllcustomer(customerList);

	}

}

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
			
			System.out.println(i+1 + "��° �������� ����");
			System.out.println("�̸� :" + nthCustomerName);
			System.out.println("��ȣ : " + nthCustomerTel);
			System.out.println("�¼� : " + nthCustomerSeat);
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 mng = new Ex3();
		
		Customer c1 = new Customer ("ȫ�浿" , "123-4567" , 15);
		Customer c2 = new Customer ("�迵��" , "5689" ,5) ;
		
		ArrayList <Customer> customerList = new ArrayList <>();

		Customer c3 = new Customer("�迵��" , "010-7536-9514" , 17) ;
		
		customerList.add(0, c3);
		
		
		customerList.add(c1);
		customerList.add(c2);
		

		
		customerList.remove(1);
		
		mng.printAllcustomer(customerList);

	}

}

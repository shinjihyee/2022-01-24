package chapter17;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer c1 = new Customer ("ȫ�浿" , "010-1473-3698" , 32);
		Customer c2 = new Customer ("�迵��" , "5689" ,5) ;
		
		ArrayList <Customer> customerList = new ArrayList <>();

		customerList.add(c1);
		customerList.add(c2);
		Customer wanted = new Customer("ȫ�浿" , "010-1473-3698" , 32);
		
		// contains�� ���������� ���ڷ� ���� ���� ���� �� ����Ʈ�� ����ִ� ��� �����͸� 
		// �� �����ؼ� true�� ������ true�� ��ȯ
		// ���������� true�� ������ �ʾ����� false�� ��ȯ�ؾ��Ѵ�. 
		// contains�� �츮�� �ǵ��Ѵ�� �����ϵ��� �ҷ��� equals �޼��带 �������̵��� �ϸ� �ȴ�.
		System.out.println(	customerList.contains(wanted));
		
		 
//		customerList.contains(wanted);
//	
 
//		for (int i = 0; i<customerList.size(); i++) {
//			Customer nthCustomer = customerList.get(1);
//			if (nthCustomer.getName ().equals("ȫ�浿") && nthCustomer.getTel ().equals("010-1473-3698") && nthCustomer.getSeat() == 32) {
//				System.out.println("true"); 
//			}else {System.out.println("False");
//			}
		

		
		
	}

}

package chapter17;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list = new ArrayList<> () ; 
		
		System.out.println("����ֳ���?" + list.isEmpty());
		
		list.add(0);
		
		if (list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
		} else {System.out.println("�����Ͱ� �ֽ��ϴ�"); }
	}

}

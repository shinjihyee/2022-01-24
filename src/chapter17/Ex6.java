package chapter17;

import java.util.ArrayList;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("1�� �� ����Ʈ�� ����ֳ���? " + list.contains(1));
		// contains�� ���������� ���ڷ� ���� ���� ���� �� ����Ʈ�� ����ִ� ��� �����͸� �� �����ؼ� true�� ������ true�� ��ȯ
		// ���������� true�� ������ �ʾ����� false�� ��ȯ�ȴ�. 
	}

}

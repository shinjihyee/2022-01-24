package chapter05;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner (System.in);
		
		System.out.println("ö���� �̸��� �Է��ϼ��� ->");
		String name = scanf.next();
		
		System.out.println("ö���� ���̸� �Է��ϼ��� ->");
		int age = scanf.nextInt();
		// ����� ���ڱ��� �������� ���ڿ��� �ؾ��Ѵ�. ���ڸ� �ҰŸ� ������ �ϸ� ��
		
		System.out.println("ö���� ����ó�� �Է��ϼ���");
		String str = scanf.next();
		// ���ڿ��� �ϳ��� �������� ���ڿ��̵ȴ�. 
		
		System.out.println("ö���� Ű�� �Է��ϼ���");
		double num = scanf.nextDouble();
		
		System.out.println("ö���� �������� �Է��ϼ���");
		char ch = scanf.next().charAt(0);
		
		System.out.println("�̸� = " + name);
		System.out.println("���� =" + age);
		System.out.println("����ó" + str);
		System.out.println("Ű" + num);
		System.out.println("������" + ch);
		
	}

}

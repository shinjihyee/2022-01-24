package chapter05;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("switch ���α׷� ����");
//		
//		switch (1) {
//			case 1:
//				System.out.println("switch�� ���� ���� 1�Դϴ�.");
//				 break;
//			
//			case 2:
//				System.out.println("switch�� ���� ���� 2�Դϴ�");
//			 	break;
//			 	
//			case 3:
//				System.out.println("switch�� ���� ���� 3�Դϴ�. ");
//			
//		}
//		System.out.println("switch ���α׷� ���� ");
		
		Scanner scanf =  new Scanner(System.in);
		
		System.out.println("--- [���Ǳ�]---");
		System.out.println("1. �ݶ�");
		System.out.println("2. �ݶ�");
		System.out.println("3. ȯŸ");
		System.out.println("4~6 ���̴�");
		System.out.println("7�� ����ƾ��");
		System.out.println("�޴����� ->");
		
		int menu = scanf.nextInt();
		
		switch(menu) {
		
		case 1:
		case 2:
			System.out.println("�ݶ�");
		break;
		
		case 3:
			System.out.println("ȯŸ");
		break;
		
		case 4:
		case 5:
		case 6:
			System.out.println("���̴�");
		break;
		case 7:
			System.out.println("����ƾ��");
		break;
		
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

}

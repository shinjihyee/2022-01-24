package chapter05;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		
		// Random ���̺귯�� -> ���� ������ ���õ� ��ɵ��� ���� �ִ� ���̺귯��
		// ���� -> ������ ���� �Ӿ��� ���ڸ� �������� ������ �� �Ǵ� ����
		Random random = new Random();
		
		int roto = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ" + roto);
		
		int roto1 = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ:" + roto1);
		int roto2 = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ:" + roto2);
		int roto3 = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ:" + roto3);
		int roto4 = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ:" + roto4);
		int roto5 = random.nextInt(45) +1;
		System.out.println("�ζ� ��÷ ��ȣ:" + roto5);
		
		
		
		
//	int su =	random.nextInt();
//		System.out.println(su);
//		
//		// 1 ~ 6 ���� �ִ� ������ü �ֻ����� ������ .
//	    int dice =	random.nextInt(6) +1;
//	    System.out.println("�ֻ����� ������ ���� �� "+ dice);
	}

}

package chapter14;
import java.util.Scanner;

public class Ex12 {

	public static void main (String [] args) {
		
		Scanner scanf = new Scanner (System.in);
		
		System.out.println("���� >> ");
		int val1 = scanf.nextInt();
		
		System.out.println("�и� >>");
		int val2 = scanf.nextInt();
		
		System.out.println("try ��");
		try {int result = val1/val2;
		
		System.out.println("result = " + result);
		
		System.out.println("try ��");}
		catch (ArithmeticException e) {
		System.out.println("�и�� 0�� �� �����ϴ�.");
		
		System.out.println("catch�� ��");
		}

		System.out.println("try��");
	}
}

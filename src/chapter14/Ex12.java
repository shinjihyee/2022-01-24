package chapter14;
import java.util.Scanner;

public class Ex12 {

	public static void main (String [] args) {
		
		Scanner scanf = new Scanner (System.in);
		
		System.out.println("분자 >> ");
		int val1 = scanf.nextInt();
		
		System.out.println("분모 >>");
		int val2 = scanf.nextInt();
		
		System.out.println("try 전");
		try {int result = val1/val2;
		
		System.out.println("result = " + result);
		
		System.out.println("try 끝");}
		catch (ArithmeticException e) {
		System.out.println("분모는 0일 수 없습니다.");
		
		System.out.println("catch의 끝");
		}

		System.out.println("try후");
	}
}

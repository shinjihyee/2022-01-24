package chapter06;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2*1 = 2");
		System.out.println("2*2 = 4 ");
		System.out.println("2*3 = 6");
		System.out.println("2*4 = 8");
		System.out.println("2*5 = 10");
		System.out.println("2*6 = 12");
		System.out.println("2*7 = 14");
		System.out.println("2*8 = 16");
		System.out.println("2*9 = 18");
		
		// ������ 2���� �ݺ��ϴ� �ڵ尡 �ִµ� while������ �����ض� 
		
		int back = 1; 
		
		while ( back <= 9) {
			
			
			System.out.println("2 * " + back +   "=" + (2*back));
			back ++;
		}
	}

}

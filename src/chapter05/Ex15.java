package chapter05;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 1;
		
		// 변수가 만들어지는 시기는 컴퓨터가 변수를 선언하는 코드를 만났을 때 
		// 변수가 사라지는 시기는 변수가 선언된 코드 블록의 끝을 만났을 때
		if (true) {
			int num2 = 2; 
			System.out.println("num 1 = " + num1 );
			System.out.println("num 2 = " + num2 );
		} 
		System.out.println("num 1 = " + num1 );
//		System.out.println("num2 = " );
	}

}

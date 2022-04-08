package chapter08;

public class Object3 {

	
	// 매개변수란 ? : 이 메서드를 호출할 때 반드시 전달해야하는 값의 타입과 개수를 나타냄.
	
		void printLines1() {	
			// 이것은 값을 전달하지 않아야한다. 
			// 매개변수가 비어있는 메서드
			System.out.println("printLines1 메서드 호출");
		}
		
		void printLines2(int n) {	
			// printLines2 메서드는
			// 매개변수가 하나 짜리인 메서드를 호출할 때는 정수 하나를 호출해야된다라고 전달을 한 것. 
			System.out.println("printLines2 메서드 호출");
			System.out.println("매개 변수 n = " + n );
		}
		
		void printLines3(double n) {
			// printLines3 메서드는
			// 매개변수가 하나 짜리인 메서드를 호출할 때는 실수 하나를 호출해야된다라고 전달을 한 것. 
			System.out.println("printLines. 메서드 호출");
			System.out.println("매개 변수 n = " + n );
		}
		
		void printLines4(int x, int y) { 
			// printLines4 메서드는
			// 매개변수가 두개짜리인 메서드를 호출할 때는 정수 두개를 호출해야된다라고 전달을 한 것. 
			System.out.println("printLines4메서드 호출");
			System.out.println("매개 변수 x = " + x );
			System.out.println("매개 변수 y = " + y );
		}
}

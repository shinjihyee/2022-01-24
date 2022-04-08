package chapter08;

public class Calculator {

	// 메서드 호출하는 코드를 만나서 컴퓨터가 메서드 안으로 들어오게 되면
	// 메모리 안에 (RAM ) 메서드의 공간이 생긴다. 
	double study1 (int kor, int Eng, int math) { 
		int total = kor + Eng + math; 
		
		double avg = (double) total/3;
		
		return avg;
		
}

	
	
	
	void swap (int num1, int num2 ) { 
		int temp = num1;
		num1 = num2 ; 
		num2 = temp;
	}
	
	public static void main (String[] args ) {
		Calculator cal = new Calculator (); 
		
		int num1 = 10; 
		int num2 = 20; 
		
		cal.swap(num1, num2);
		
		// 위 프로그램의 동작 원리를 메모리에 그려서 파악하세요 
		// Calculator 메서드에는 swap 메서드만 있다고 생각하면서 파악하면 된다. 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main (String[] args) {
//		Calculator cal = new Calculator();
//		
//		cal.study1(85, 87, 90); // 입력할 값은 처음에 주고 나중에는 동작 끝의 결과값이 자리에 온다
//		
//	}
	
	
	
}

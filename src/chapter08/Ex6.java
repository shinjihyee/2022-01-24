package chapter08;

public class Ex6 {
	// 메서드는 변수와 마찬가지로
	// 기본적으로 중복해서 선언할 수가 없다. 
	// 변수는 데이터 타입이 달라도 이름이 같은 변수는 중복 선언이 되어서 사용할 수 없다.
	// 메서드는 메서드 이름이 같아도 매개변수의 개수나 타입이 다르면 중복으로 판단하지 않아서 사용할 수 있다. 
	
	void func() {
		System.out.println("func");
	}
	
	void func (int num) {
		System.out.println("func");
	}
	
	void func (double num) {
		System.out.println("func");
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 1;
	
		Ex6 ex = new Ex6() ;
		
		ex.func();
		
		ex.func(3.14);
	
		ex.func(3);
	
	}
	
	

}

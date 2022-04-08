package chapter08;

public class Object1 {

	
	
	// void -> 반환타입 void가 있는 자리가 반환 타입이다. 
	// void가 반환 타입 xx : 메서드가 동작하고 난 다음 되돌려받는 값의 타입
	
	// printLines -> 메서드 이름 : 변수 이름을 짓는 규칙과 동일하다. 
	// () -> 매개변수자리 : 메서드가 동작하기 위해서 필요한 값의 개수와 타입.
	// {... } : 메서드에 저장할 소스 코드 / 메서드를 사용하면 이 안의 코드가 불러와진다. 

	void printLines () {
		
		System.out.println("----- ----- ----- ");
		System.out.println("----- ----- ----- ");
	}

	
	void add () { 
		System.out.println("1+1" + "=" +(1+1));
	}
	
	
	
}

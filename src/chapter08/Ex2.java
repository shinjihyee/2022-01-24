package chapter08;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Object3 obj3 = new Object3(); 
		
		obj3.printLines1(); // 매개변수가 없으니 값을 전달하면 안된다. 동작 내용 넣는 것은 출력 됨. 

		// 메서드를 호출할 때 넣는 값을 인자라고 한다. 
		obj3.printLines2(3); // 메서드로 값을 전달할 때는 여닫는 소괄호 () 안에 값을 넣어서 메서드로 값을 전달한다. 
		obj3.printLines2(-1);
		
		// printLinese3 메서드를 호출해보세요.
		
		obj3.printLines3(12.1);
		
		obj3.printLines4(1, 2);
	}

}

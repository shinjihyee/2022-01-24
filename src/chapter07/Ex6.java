package chapter07;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object2 obj2 = new Object2();
		// 여기서 프로그램을 실행하면 해당 챕터에 있는 프로젝트만 보는 것이 아니라 전체 챕터 프로젝트를 분석한다. 
		
		Object2 obj3 = new Object();
		
		obj2.num1 = 1; 
		obj3.num2 =2;
		
		
		System.out.println("obj2.num1 = " + obj2.num1);
		System.out.println("obj3.num1 = " + obj3.num2);
		
		
		Object2.num2 = 3; 
		System.out.println("Object2.num =" + Object2.num2);
		
		obj2.num2 = 4;
		obj3.num2 = 5;
		// Object2 안의 데이터 타입이기에 RAM에서는 obj2의 객체가 없네 왜징 하고 클래스 정보로 들어가서 소스코드를 전부 다 보고 어 여깄네 하고 클래스의 변수인 걸 찾고 클래스 정보에 수를 저장을 한다. 
		System.out.println(obj2.num2);
		System.out.println(obj3.num2);
	}

}

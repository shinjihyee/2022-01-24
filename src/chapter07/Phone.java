package chapter07;

// 데이터 타입이 Phone인 객체 안에는 
// 데이터 타입이 String인 maker 변수가 들어있고
// 데이터 타입이  int인 price 변수가 들어있고 
// 데이터 타입이 double인 displaySize가 들어있고
// 데이터 타입이 int ram변수가 들어있다. 

//우리가 지금 만든 설계도 = 클래스는 이런 뜻 
public class Phone {
	
	// 클래스 멤버 변수 : 클래스 명을 사용해서 접근할 수 있는 멤버 변수 
	//				클래스 멤버 변수는 선언할 때 맨 앞에 static 키워드가 붙음. (인스턴스를 선언안하여도 된다. )
	
	// 인스턴스 멤버 변수 : 우리가 지금 클래스 내 선언한 멤버 변수가 인스턴스 멤버 변수다. 
	// 인스턴스 멤버변수는 클래스의 인스턴스를 만드는 시점에 생성이 됩니다. 
	// 클래스 멤버 변수는 프로그램이 실행되면서 만들어진다. 
	
	
	final static String maker; // static 키워드가 붙은 클래스 멤버변수에 final 키워드 까지 써서 클래스 멤버변수가 상수화가 된 것이니 값을 바꿀 수가 없다 
								// 값을 처음에 삼성으로 줬으면 maker로 다른 제조사를 만들 수가 없다. 
	int price;
	double displaySize; 
	int ram; 

	
	
}

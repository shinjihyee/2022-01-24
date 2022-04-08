package chapter07;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 핸드폰 두개를 만든 것 p1,p2.
		Phone p1 = new Phone();
		
		Phone p2 = new Phone();
		
 
		p1.price = 1200000;
		p1.displaySize = 6.5;
		p1.ram = 8;
		// .maker 안에 내용이 같으면 class 안의 변수에 static을 앞에 붙이면 
		// 하나씩 선언 안 하고 합쳐서 클래스 멤버변수를 사용하여 쓸 수 있다. 
		
		Phone.maker = "삼성";

		p2.price = 5621;
		p2.displaySize = 5.5;
		p2.ram = 5;
		
	}

}

package chapter02;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// final 키워드 : 변수를 상수화 할 때 사용
		// 변수를 상수화 한다 -> 변수에 한번 저장한 값을 바꾸지 않고 사용하겠다 라는 것 
		
		final int num = 10;
		
		System.out.println("num = " + num);
		
		int num2 = 20;
		num2 = 20; 
		
		System.out.println("num =" + num);
	}

}

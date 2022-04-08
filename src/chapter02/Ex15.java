package chapter02;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(3+10);

		int result = 3 - 10;
		System.out.println("result = "  + result);
		
		int val1 = 3;
		result = val1 * 10;
		System.out.println("result =" + result);
		
		int val2 = 10;
		// 우리가 컴퓨터가 되서 동작 원리를 파악하는 것도 중요하지만
		// 우리가 파악한 원리대로 결과가ㅏ 나오는 지도 같이 봐야함! 
		
		// 정수 <연산자 > 정수를 하게 되면 연산의 결과는 정수이다. 
		// 나눗셈의 결과를 실수로 구하고 싶으면
		// 실수 / 실수 를 해야함 
		result = val1 / val2;
		
		System.out.println("result =" + result);
	}

}

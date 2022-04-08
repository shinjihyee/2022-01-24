package chapter02;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 3.14;
		// 다운 캐스팅 할 때는 형 변환 연산자를 반드시 붙여야함
		// 다운 캐스팅 경우에는 원래 데이터가 변형될 수 있으므로 우리가 그걸 인지하고 있다는 의미로 반드시 붙여줘야함
		int num2 = (int) num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num2 = 65;
		
		char ch = (char) num2;
		
		System.out.println("num2 =" + num2);
		System.out.println("ch =" + ch);
		
		
		
		
//		char ch = 'A';
//		// 업캐스팅 : 형 변환 연산자를 생략할 수 있음
//		int num1 =  ch;
//		
//		System.out.println("ch =" + ch);
//		System.out.println("num1 = " + num1);
//		
//		double num2 = (double) num1;
//		
//		System.out.println("num1 =" + num1);
//		System.out.println("num2 = " + num2);
	}

}

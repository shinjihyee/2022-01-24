package chapter17;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer ("홍길동", "010-1234-5678", 1);
		Customer c2 = new Customer ("홍길동", "010-1234-5678", 1);

		// c1에 들어있는 정보와 c2에 들어있는 정보가 같나요 ? 의 결과를  출력하는 코드를 만드세요. 
		
		System.out.println(c1 == c2);
		
		// 정보안에 들어있는 데이터가 같은지 하나씩 다 찾아봐야한다. 
		String c1Name = c1.getName();
		String c1Tel = c1.getTel();
		int c1Seat = c1.getSeat();
		
		String c2Name = c2.getName();
		String c2Tel = c2.getTel();
		int c2Seat = c2.getSeat();
		
		if (c1Name.equals(c2Name) && c1Tel.equals(c2Tel) && c1Seat == c2Seat) {
			System.out.println(true);
		} else { System.out.println(false); }
		

		
//		if (c1.getName().equals(c2.getName())); 
		
		
//		int num1 = 1; 
//		int num2 = 1; 
//		
//		// num1에 들어있는 값과 num2에 들어있는 값이 같나요 ? 의 결과를 출력하는 코드를 만드세요
//		
//		System.out.println(num1 == num2);
		
	}

}

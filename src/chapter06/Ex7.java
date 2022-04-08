package chapter06;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int num = 1; 
//		
//		while (true) {
//			System.out.println("Hello world~!");
//			
//			num ++ ; 	
//			
//			if (num == 4) {
//				break;
//			}
//			
//		}
		
		// 1 ~ 10 사이의 수 중에서 짝수를 출력하는 프로그램을 개발하세요.
		
		int num = 2; 
		
		while ( num <= 10) {
			if (2%num==1) {
				num ++;
				continue;
				
			}
			System.out.println(num); 
		}
	}

}

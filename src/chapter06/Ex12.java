package chapter06;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자에게 문자열을 입력 받아 변수에 저장하고
		
		// 사용자가 입력한 문자열의 처음부터 끝까지 
		//문자 하나씩 접근해서
		
		//사용자가 입력한 문자열의 n(char n)번째 문자가
		// 대문자면 소문자로
		// 소문자면 대문자로 
		// 변환하는 프로그램을 개발하세요. 
		
		Scanner scanf = new Scanner (System.in);
		System.out.println("문자열을 입력하세요 -> ");
		
		String str = scanf.next(); 
		
		
		for (int i=0; i<=str.length(); i++) { 
			char n = str.charAt(i); 
			
			//n번째 문자가 대문자인가요?
			if (n >= 'A' && n <= 'Z') {
				// 대문자를 소문자로 바꾸는 연산
				n = (char)  (n +  32); // 32는 int 타입의 정수이고 n은 char 타입의 문자이기 때문에 
				// 결과를 형변환 하고 싶으면 값을 값을 묶어야하고
				//char를 앞에 붙이면 n을 더해서 32를 더해라가 되서 안된다
				// 그래서 결과값을 형변환 할 땐 (데이터 형태) (결과 식) 
				
				
		}	// n번째 문자가 소문자 인가요?
			else if (n >= 'a' && n <= 'z' ) {
			n = (char) (n - 32);
			// 소문자를 대문자로 바꾸는 연산
		}
		
		
	}
	}

}

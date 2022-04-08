package chapter06;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = " apple"; 
		
		System.out.println("문자열의 길이는 5자 입니다. ");
		
		str.length();
		int strLength = str.length();
		System.out.println("이 문자열의 길이는" + str.length()+ "자 입니다.");
		
		// 이 문자열의 첫번 째 문자부터 마지막 묹까지 하나씩 뽑아서 출력하세요.
		
//		char firstChar = str.length(0);
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(5));
		
		for (int i=0; i<=4; i++) { 
			System.out.println(str.charAt(i));
		}
		// 처음부터 끝까지 쓰는 문자열 반복문 
	}

}

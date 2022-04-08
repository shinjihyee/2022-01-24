package chapter08;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object1 obj1 = new Object1();
		
		obj1.printLines();
		
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 정보수정");
		System.out.println("4. 회원탈퇴");

		
		obj1.printLines();
		
		obj1.add();
		
		// 반복되서 사용되는 코드는 ----- 하이픈이 있는 sysout 
		// 반복되는 건 반복문으로 바꾸라고 했는데 
		// 이런 거에서 반복문으로 바꾸면 가독성이 떨어진다 
		
		Object2 obj2 = new Object2();
		
		obj2.add();
		
		
	}

}

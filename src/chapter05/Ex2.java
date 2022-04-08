package chapter05;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner (System.in);
		
		System.out.println("철수의 이름을 입력하세요 ->");
		String name = scanf.next();
		
		System.out.println("철수의 나이를 입력하세요 ->");
		int age = scanf.nextInt();
		// 세라는 글자까지 넣을려면 문자열로 해야한다. 숫자만 할거면 정수로 하면 됌
		
		System.out.println("철수의 연락처를 입력하세요");
		String str = scanf.next();
		// 문자열이 하나라도 들어가있으면 문자열이된다. 
		
		System.out.println("철수의 키를 입력하세요");
		double num = scanf.nextDouble();
		
		System.out.println("철수의 혈액형을 입력하세요");
		char ch = scanf.next().charAt(0);
		
		System.out.println("이름 = " + name);
		System.out.println("나이 =" + age);
		System.out.println("연락처" + str);
		System.out.println("키" + num);
		System.out.println("혈액형" + ch);
		
	}

}

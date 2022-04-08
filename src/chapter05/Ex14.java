package chapter05;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("switch 프로그램 시작");
//		
//		switch (1) {
//			case 1:
//				System.out.println("switch로 들어온 값은 1입니다.");
//				 break;
//			
//			case 2:
//				System.out.println("switch로 들어온 값은 2입니다");
//			 	break;
//			 	
//			case 3:
//				System.out.println("switch로 들어온 값은 3입니다. ");
//			
//		}
//		System.out.println("switch 프로그램 종료 ");
		
		Scanner scanf =  new Scanner(System.in);
		
		System.out.println("--- [자판기]---");
		System.out.println("1. 콜라");
		System.out.println("2. 콜라");
		System.out.println("3. 환타");
		System.out.println("4~6 사이다");
		System.out.println("7번 마운틴듀");
		System.out.println("메뉴선택 ->");
		
		int menu = scanf.nextInt();
		
		switch(menu) {
		
		case 1:
		case 2:
			System.out.println("콜라");
		break;
		
		case 3:
			System.out.println("환타");
		break;
		
		case 4:
		case 5:
		case 6:
			System.out.println("사이다");
		break;
		case 7:
			System.out.println("마운틴듀");
		break;
		
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

}

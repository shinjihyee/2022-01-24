package chapter06;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 2단을 출력하는 프로그램을 개발하세요.
		// for 문을 배운 후 푸는 문제이므로 왠만하면 for문으로 해결하는게 좋다 
		
		/*
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * 2*4=8
		 * 2*5=10
		 */
			
//		for (int back=1; back <= 5; back++) {
//			System.out.println("2 * " + back + "=" + (2*back));
//			
//		for (int back=1; back <= 5; back++) {
//			System.out.println("3 * " + back + "=" + (3*back));
//				
//		for (int back=1; back <= 5; back++) {
//			System.out.println("4 * " + back + "=" + (4*back));
//			
//	}
		// ctrlc + v 자리는 반복식이 들어갈 자리 
		// 중첩for문 사용해서 for문안에서 2-9단까지 만들어보기
		
		for (int front = 2; front <=2; front++) {
			for (int back =1; back <= 5; back++) {
				System.out.println(front + " * " + back + "=" + (front*back));
		}
		
		}
		
	}}
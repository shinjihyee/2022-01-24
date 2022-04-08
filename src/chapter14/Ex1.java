package chapter14;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub	
		// 이 프로그램은 예외가 발생하는 프로그램입니다. 
		// 예외가 언제 발생하는지 찾고
		// 예외가 발생하지 않도록 처리해보세요 
		Scanner scanf = new Scanner (System.in);
		
		int [] arr = {3,2,1};
		// 3,2,1이 들어있는 배열이 있다. 
		
		System.out.println("인덱스 번호 >>");
		int index = scanf.nextInt();
		// 인덱스 번호를 받는 부분
		
		
		try {	
			System.out.println("arr[" + index + "]=" + arr[index]);
			}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스 번호가 잘못되었습니다.");} 



		
	}

}

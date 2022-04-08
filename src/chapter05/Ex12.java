package chapter05;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanf = new Scanner (System.in);
		
		System.out.print("당신의 몸무게>>");
		double weight = scanf.nextDouble();
		System.out.print("당신의 키>>");
		double height = scanf.nextDouble();
		
		double BMI = (weight/ (height)) * 10000;
		
		System.out.println("당신의 BMI는 " + BMI + "입니다.");
		
		// 효율적인 프로그램이라는 건 무조건 연산횟수가 적은 프로그램이 아니라 
		// 연산횟수도 적고 프로그램의 변경이 유연한 프로그램임 
		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI >= 18.5 && BMI < 25) {
			System.out.println("정상");
		} else if (BMI >= 23 && BMI < 25 ) {
			System.out.println("과체중 의심");
		} else if (BMI >= 25 && BMI >= 30) {
			System.out.println("당신은" + "비만" + " 입니다");
			
		} else if (BMI >= 30) {
			System.out.println("고도 비만");
		}
	}

}
 
// 당신은 ~ 입니다가 되도록 출력형태를 바꾸세요 
// if문 위에 print를 사용하여서 ("당신은")
// if문 아래 print를 사용하여 ("입니다")
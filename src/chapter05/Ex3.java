package chapter05;

import java.util.Random;

public class Ex3 {
	public static void main(String[] args) {
		
		// Random 라이브러리 -> 난수 생성과 관련된 기능들을 갖고 있는 라이브러리
		// 난수 -> 일정한 범우 ㅣ안의 숫자를 무작위로 선택한 수 또는 수열
		Random random = new Random();
		
		int roto = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호" + roto);
		
		int roto1 = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호:" + roto1);
		int roto2 = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호:" + roto2);
		int roto3 = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호:" + roto3);
		int roto4 = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호:" + roto4);
		int roto5 = random.nextInt(45) +1;
		System.out.println("로또 당첨 번호:" + roto5);
		
		
		
		
//	int su =	random.nextInt();
//		System.out.println(su);
//		
//		// 1 ~ 6 까지 있는 정육면체 주사위를 굴린다 .
//	    int dice =	random.nextInt(6) +1;
//	    System.out.println("주사위를 굴려서 나온 수 "+ dice);
	}

}

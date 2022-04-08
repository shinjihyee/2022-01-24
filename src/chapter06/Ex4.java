package chapter06;

import java.util.Random;

public class Ex4 {

	public static void main (String[] args) {
	
		// 복권 1등에 당첨될 때까지 복권을 반복으로 산다.
		// 1 ~ 6등까지 있는 복권 / 낙첨도 있음. 
		// 그럼 1 ~ 6등까지 있고 낙첨도 있기에 총 7개의 수가 있다 
		
		// 복권은 랜덤 수이기 때문에 랜덤 라이브러리 사용
		
		Random random = new Random();
		
		// 복권을 사서 당첨된 등수를 선언하는 변수 
		// 복권을 샀을 때 random.nextInt가 복권을 샀다는 뜻이 된다.
		 int rank = random.nextInt(7) + 1;
		// 1~7의  사이를 무작위로 뽑아달라 
		
		// 당첨된 등수가 != (아니라면) 1등이 아니라면
		// 
		while (true) {
			rank = random.nextInt(7) + 1; // 복권을 사서 당첨된 등수를 저장하고 아니면 또 등수를 보고 아니라면 저장을 하고 (sysout 위/아래 상관xx)
			// 이게 당첨을 샀다는 거니까 변수를 넣어줘야함 데이터 형식 배고 
			System.out.println("복권을 산다. ");
			System.out.println(rank);
			
			
			if(rank == 1) {
				break;
			}
		}
	}
}

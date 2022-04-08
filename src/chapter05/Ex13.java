package chapter05;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				
		// 2022년 8월 날짜를 dayOfMonth 변수에 저장하고 해당 날짜의 요일을 출력하세요
		// 특징 찾기 
		// 요일을 특정을 찾기 위해서는 일주일이 7일이니까 
		// 7로 나눈 나머지들을 찾아보면 특징을 알 수 있다
		// 예 ) 8 % 7 , 1 % 7 , 15 % 7 ... 월요일인 날짜를 다 7로 계산해보면 1이다 
		// 나머지를 생각해봐라
		// 7로 나눈 나머지가 2면 화요일 2수 4 목 5금 6토 7은 0 일요일
		
			int week = 7;
			
			int dayOfMonth = 13;
			
			int dayOfweek = dayOfMonth % week; 
			
			System.out.println("2022년 8월 " +  dayOfMonth + "일은");
			
			if	 (dayOfweek == 0) System.out.println("일요일");
			else if (dayOfweek == 1) System.out.println("월요일");
			else if (dayOfweek == 2) System.out.println("화요일");
			else if (dayOfweek == 3) System.out.println("수요일");
			else if (dayOfweek == 4) System.out.println("목요일");
			else if (dayOfweek == 5) System.out.println("금요일");
			else if (dayOfweek == 6) System.out.println("토요일");
	}

}

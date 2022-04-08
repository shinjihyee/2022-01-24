package chapter17;

public class Customer {

	
	public Customer (String name, String tel, int seat) { // 우리가 원하는 객체가 만들어지도록
		this.name = name;
		this.seat = seat;
		this.tel = tel; 
	}
	
	@Override
	public boolean equals(Object obj) { // 이 객체와 매개변수로 받은 객체를 서로 비교를 해주는 메서드이다. 
		Customer other = (Customer) obj;
		String otherName = other.getName();
		String otherTel = other.getTel();
		int otherSeat = other.getSeat();
		
		boolean nameSame = name.equals(otherName);
		boolean telSame = tel.equals(otherTel);
		boolean seatSame = seat == otherSeat ; 
		
		return nameSame && telSame && seatSame; 

	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = " + name + ", tel" + tel + ",seat" + seat;
	}
	private String name;
	public String getName() { // 메인멤버변수를 리턴해주는 것
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	private String tel;
	private int seat; 
	
	
}

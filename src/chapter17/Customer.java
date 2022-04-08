package chapter17;

public class Customer {

	
	public Customer (String name, String tel, int seat) { // �츮�� ���ϴ� ��ü�� �����������
		this.name = name;
		this.seat = seat;
		this.tel = tel; 
	}
	
	@Override
	public boolean equals(Object obj) { // �� ��ü�� �Ű������� ���� ��ü�� ���� �񱳸� ���ִ� �޼����̴�. 
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
	public String getName() { // ���θ�������� �������ִ� ��
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

package chapter17;

public class Book {
	
	private String title; 
	private int price; 
	
	
	public Book (String titleEx, int priceEx) {
		this.title = titleEx; 
		this.price = priceEx;
	}


	@Override
	public int hashCode() {
		int hashValue = title.hashCode() + price;
		return hashValue;}



	@Override
	public boolean equals(Object obj) {
		Book otherBook = (Book) obj; 
		String otherTitle = otherBook.getTitle();
		int otherPrice = otherBook.getPrice();
		
		boolean titleSame = title.equals(otherTitle);
		boolean priceSame = price == otherPrice;
		
		return titleSame && priceSame;
	}

	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + "(" + price +"¿ø )";
		
	}
	
	

}

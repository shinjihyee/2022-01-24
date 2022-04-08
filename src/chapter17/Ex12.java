package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book ("Java Master" , 34500) ;
		Book b2 = new Book ("JSP?Servlet 입문" , 29000) ; 
		
		Set <Book> bookList = new HashSet <>();
		
		bookList.add(b1);
		bookList.add(b2);
		
		System.out.println(bookList);
		
		Book b3 = new Book ("JSP?Servlet 입문" , 29000);
		
		bookList.add(b3);
		
		System.out.println(bookList);
		
		System.out.println("*** 사내 도서 목록 *** ");
		
		// bookList를 사용해서 사내 도서들의 정보를 출력하세요
		System.out.println("********************");

		for (Book book : bookList) {
			System.out.println("도서명 : " + book.getTitle());
			System.out.println("도서 가격: " + book.getPrice());
		}
		
		Iterator<Book> iterator = bookList.iterator();
		Integer nthInteger;
		
		int count = 1; 
		iterator.hasNext();
		
		while (iterator.hasNext()) {
			nthInteger =  iterator.next();
			System.out.print(nthInteger);
			
			count ++;
		}
		
		
		
	}

}

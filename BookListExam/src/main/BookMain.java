package main;

import java.util.ArrayList;

import vo.Book;



public class BookMain {

	public static void main(String[] args) {
		
		// 1번째 방법
		ArrayList<Book> list = new ArrayList<>();
		Book book = new Book();
		book.setBookName(" 태백산맥");
		book.setAuthor(" 조정래");
		book.setPrice(12000);
		book.setId(1);
		
		list.add(book);
		
		Book book2 = new Book(2, "데미안", "헤르만 헤세", 13000);
		list.add(book2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	
	
	
	
	}
	
	

}

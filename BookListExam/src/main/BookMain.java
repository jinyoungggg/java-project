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
		
		
		list.add(book);
		book.id++;
		
		
		Book book2 = new Book("데미안", "헤르만 헤세", 13000);
		list.add(book2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	//Book [id=1001, bookName= 태백산맥, author= 조정래, price=12000]
		Book [id=1001, bookName=데미안, author=헤르만 헤세, price=13000]
	//static 메모리에 먼저올라감 (먼저 생성돼있다.)
	}
	
	

}

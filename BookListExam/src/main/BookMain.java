package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import utill.DateTimeUtill;
import vo.Book;



public class BookMain {
	//static쓰면 미리 올라가서 굳이생성자로 생성안해도됨!
	public static void printBookList(ArrayList<Book> bookList) {
		/*for (int i = 0; i< bookList.size(); i++) {
			bookList.get(i).getPrice();
			System.out.println(bookList.get(i).toString());
	}*/   // 저 for문을 enhanced for문으로(예쁘게)
		//enhanced for문
		for ( Book book : bookList ) {
			String result = "";
			result += "책의 고유 번호 : " + book.getBookId();
			result += " 제목 : " + book.getBookName();
			result += " 작가 : " + book.getAuthor();
			result += " 가격 : " + book.getPrice();
			result += " 생성일 : " + book.getCreateDate();
			
			// String으로 문자열을 완성한거와 StringBuilder로 문자열을 완성한
			StringBuilder str = new StringBuilder();
			str.append(" 책의 고유 번호 : " + book.getBookId());
			str.append(" 제목 : " + book.getBookName());
			str.append( " 작가 : " + book.getAuthor());
			str.append(" 가격 : " + book.getPrice());
			str.append(" 생성일 : " + book.getCreateDate());
			System.out.println(str.toString());
		
			
			//append 이어붙히는것
			
			
			
			System.out.println(result);
		}
	}
	public static void main(String[] args) {

		
		
		// 1. 날짜 생성해서 createDate에 파라미터로 넣기
				//2. 메시지를 띄운다. (1 : book 추가생성 ㅣ\list에 밀어넣어, 2. book 항목 삭제
		
DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//현재시간 출력하는 공식
String formatedDate = LocalDateTime.now().format(dFormatter);
	
		// 1번째 방법
		ArrayList<Book> list = new ArrayList<>();
		
		Book book = new Book();
		book.setBookName(" 태백산맥");
		book.setAuthor(" 조정래");
		book.setPrice(12000);
		book.setCreateDate(formatedDate);
		
		
		
		list.add(book);
		

		
		
		Book book2 = new Book("데미안", "헤르만 헤세", 13000, formatedDate);
		list.add(book2);
		list.add(new Book("책1", "11", 13000, formatedDate));
		list.add(new Book("책2", "11", 13000, formatedDate));
		list.add(new Book("책3", "11", 13000, formatedDate));
		list.add(new Book("책4", "11", 13000, formatedDate));
		
		
		
	   // list.add(new Book("23", "33", 33));
		//추가할건지 삭제할건지 메세지를 띄운다.
		// 1을 고르면 책을 추가하는 코드를 작성한다.
		// 2를 입력하면 책을 삭제한다. 삭제할때 책의 식별자는 bookId 값으로 판단한다.
		// 3을 입력하면 책의 id값을 입력 받아서 해당 객체만 정보를 출력.
		// 4를 입력하면 책의 id값을 입력받고, 입력받은 객체의 정보를 별도로 입력받아서 수정처리
		//삭제할때 bookId를 입력받을 수 있게 scanner를 띄운다.
		//값을 입력 받으면 list를 순화하면서 동일한 bookId가 있으면 해당 책을 지운다.
		
		for(int j=0;j<list.size();j++)
			System.out.println(list.get(j));
		
		do {
		System.out.print("할일을 골라라.");
		Scanner scanner = new Scanner(System.in);
		int workId = scanner.nextInt();
		
		// CRUD
		//C : create
		//R : read
		//U : update
		//D : delete
		
		if(workId == 1) {
			//추가
			Book newBook = new Book();
			list.add(newBook);
			System.out.println("책 제목: ");
			String bookName = scanner.next();
			newBook.setBookName(bookName);
			System.out.println("저자 입력: ");
			String bookAuthor = scanner.next();
			newBook.setAuthor(bookAuthor);
			System.out.println("가격 입력");
			int bookPrice = scanner.nextInt();
			newBook.setPrice(bookPrice);
			
			newBook.setCreateDate(formatedDate);
			
			BookMain.printBookList(list);
			
			
		}else if (workId == 2) {
			//삭제
			System.out.println("삭제할 ID를 입력하세요.");
			int bookId = scanner.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (bookId == list.get(i).getBookId()) {
					list.remove(i);
				}
			}
			BookMain.printBookList(list);
		} else if (workId == 3) {
			//1개 조회
			System.out.println("조회할 ID를 입력하세요.");
			int bookId = scanner.nextInt();
			for (int j = 0; j <list.size(); j++) {
				if (bookId == list.get(j).getBookId() ) {
					System.out.println("조회결과:"+list.get(j));
				}
				// enhance for문사용하면
				/* for (Book item : list) {
				 * if (bookId == item.getBookId(){
				 * 	system.out.println(item.toString());
				 }
				 }*/
			}
			 
		}else if (workId == 4) {
			// 1개 조회 후 수정
			//수정:내용만바뀌면됨
			//(1) 새 책을 만들어서 원래 책을 빼고 그자리에 넣기
			//(2) 원래책한테 set~해서 고치기
			//1.원래책찾기 (3번응용)
			//2.원래책.set머시기하기
			
			System.out.println("조회할 ID를 입력하세요.");
			int bookId = scanner.nextInt();
			for (int j = 0; j <list.size(); j++) {
				if (bookId == list.get(j).getBookId() ) {
					System.out.println("조회결과:"+list.get(j));
					
					do {
					System.out.println("수정한 책 제목: ");
					String bookName = scanner.next();
					list.get(j).setBookName(bookName);
					System.out.println("수정한 작가");
					bookName = scanner.next();
					list.get(j).setAuthor(bookName);
					System.out.println("수정한 가격");
					int bookPrice = scanner.nextInt();
					list.get(j).setPrice(bookPrice);
					
					System.out.print("책 제목 : "+ bookName + 
							", 책 작가 : " + bookAuthor + 
							" 이 내용이 맞습니까? (y/n)");
					String yn = scanner.next();
					if (yn.equals("y")) {
						item.setBookName(bookName);
						item.setAuthor(bookAuthor);
						item.setPrice(bookPrice);
						BookMain.printBookList(list);
						break;
					}
					}while(true);
					
					
					
					
				}
			}
			System.out.println("수정");
			
		}else {
			//1,2,3,4이외 다른 숫자는 프로그램종료
			System.out.println("프로그램 종료");
			break;
		}
		for(int j=0;j<list.size();j++)
			System.out.println(list.get(j));
		
		}while(true);
		
		
		
	
		
	}
	}
		

		
	
		
		
	
	
	



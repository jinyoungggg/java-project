package vo;

public class Book {

	
	// 고유번호
	public static int id = 1000;
	//책이름
	private String bookName;
	//작가
	private String author;
	//가격
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book( String bookName, String author, int price) {
		
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public Book() {}
	@Override
	public String toString() {//객체생성 프라이빗 게터세터 투스트링(오버라이드) 한세트!
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}

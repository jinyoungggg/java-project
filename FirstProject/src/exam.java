import java.util.ArrayList;

import vo.Book;

public class exam{
 public static int id = 1000;
 private String bookName;
 private String authors;
 
 
 
 
 
	public static int getId() {
	return id;
}



public static void setId(int id) {
	exam.id = id;
}



public String getBookName() {
	return bookName;
}



public void setBookName(String bookName) {
	this.bookName = bookName;
}



public String getAuthors() {
	return authors;
}



public void setAuthors(String authors) {
	this.authors = authors;
}



public exam getBoo() {
	return boo;
}



public void setBoo(exam boo) {
	this.boo = boo;
}





	public exam(String bookName, String authors, exam boo) {
	super();
	this.bookName = bookName;
	this.authors = authors;
	this.boo = boo;
}
	
	



	public exam() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "exam [bookName=" + bookName + ", authors=" + authors + ", boo=" + boo + "]";
	}



	public static void main(String[] args) {
		
		ArrayList<exam> ll = new ArrayList<>();
		
		exam boo = new exam();
		








	}
  }























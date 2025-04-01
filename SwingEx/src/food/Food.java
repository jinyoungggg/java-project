package food;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Food {
	String food = "과자";
	String 상품명 = "고래밥";
	int 가격 = 2000;
	
	

	




@Override
	public String toString() {
		return "Food [food=" + food + ", 상품명=" + 상품명 + ", 가격=" + 가격 + "]";
	}







public Food(String food, String 상품명, int 가격) {
		super();
		this.food = food;
		this.상품명 = 상품명;
		this.가격 = 가격;
	}







public String getFood() {
		return food;
	}







	public void setFood(String food) {
		this.food = food;
	}







	public String get상품명() {
		return 상품명;
	}







	public void set상품명(String 상품명) {
		this.상품명 = 상품명;
	}



	




	public int get가격() {
		return 가격;
	}







	public void set가격(int 가격) {
		this.가격 = 가격;
	}







public static void main(String[] args) {
	
	
	
	
	ArrayList<Food> list = new ArrayList<>();
	list.add( new Food("분식", "순대", 4000));
	list.add(new Food("과자", "고래밥", 2000));
	
	
	
	
	
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println(list.get(i).toString());
	}
	
}
}
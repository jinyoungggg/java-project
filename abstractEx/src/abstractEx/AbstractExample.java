package abstractEx;

import java.util.ArrayList;
	/* Buyer 클래스 : money, 
 * cart(배열)  
 * 메서드: buy(구입),add(장바구니추가),summary(구입한물건목록,사용금액,남은금액)
		Product 클래스 어레이선언 초기화: price
		상속받는 클래스 Tv(100), Computer(200), Audio(50)
		
	메서드명 : buy
	기능: 물건구입, 가진 돈에서 물건값을 빼고 장바구니에 담는다. 만약
		     가진돈이 물건의 가격보다 적으면 바로 종료한다.
        반환타입 : x
	 파라미터 : Product(구입할물건) 

    메서드명: add

		 기능: 지정된 물건(a)을 장바구니(cart)에 담는다.(.add)

		 반환타입 : x
		 파라미터 : Product
		 
		 메서드명 : summary
		 기능 : 구입한 물건의 목록(cart)과 사용금액(p.price), 남은금액(money) 출력
		 반환타입: x
		 파라미터: x    */


class Buyer {
	int money = 1000;
	int price;
	
	
	
	ArrayList<Product> cart = new ArrayList<>();
	
	Buyer (int price){
		System.out.println("cart"+ cart);
	}
	

	
void buy(Product p) {//파라미터 : Product(구입할물건)
	if(money < p.price) { //만약   가진돈이 물건의 가격보다 적으면 
		System.out.println("잔액부족해서 "+p+"를 못샀다");
		
		return; //바로 종료한다.
		
	} 
	money = money - p.price; //가진 돈에서 물건값을 빼고
	cart.add(p); //장바구니에 담는다. 
	
}
void add(Product a) {
	cart.add(a);
}

void summary() {
	//for(~;~;~) (평소
	//목록같은거를 자동으로 반복하게 하려면
	// for( 목록에들어간내용 변수명 : 목록이름)  <이러면 목록에 들어가있는 개수만큼 알아서 반복
	for(Product p : cart) {
		System.out.print(p+"사용한 금액은:");
		System.out.println(p.price);
		
		
		
		
	}
	System.out.println("남은 돈은:" + money);
}


}
class Product {
int price;
Product(int price){
this.price = price;

}

}


class Tv extends Product{
Tv(){
super(100);//파라미터없으면 디폴트메서드생성 파라미터 있으면 부모클래스 파라미터호출
}
@Override
public String toString() {
return "TV";
}
}
class Computer extends Product{
Computer(){
super(200);
}
@Override
public String toString() {
return "Computer";
}
}
class Audio extends Product{
Audio(){
super(50);
}
@Override
public String toString() {
return "Audio";
}
}









public class AbstractExample {
public static void main(String[] args) {


Buyer a = new Buyer(1000);
a.buy(new Tv());
a.buy(new Computer());
a.buy(new Audio());
a.buy(new Computer());
a.buy(new Computer());
a.buy(new Computer());
a.buy(new Computer());
a.summary();


	








}

}







package abstractEx;

import java.util.ArrayList;
import java.util.Arrays;

class Buyer {
	int price;
	int money = 1000;
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//목록 <여기에 들어갈수있는 종류 (숫자만들어와,글자만,Product> 배열명
	
		Buyer(int price) {
			System.out.println("cart"+cart);
		}
		/*
		 * 메서드명 : buy
		기능: 물건구입, 가진 돈에서 물건값을 빼고 장바구니에 담는다. 만약
		     가진돈이 물건의 가격보다 적으면 바로 종료한다.
		    반환타입 : x
		    파라미터 : Product(구입할물건) 
		 */
		
		//메서드 ()  < ()의 내용은 메서드를 실행할때 추가요청사항
		//예시) 커피주세요(사이즈업,크림추가)
		//커피기능 +사이즈변경+크림까지
		
		//사주세요()  << ??
		
		//사주세요(tv)
		//돈 - TV.가격
		//장바구니.추가(tv)
		//만약(가진돈<물건가격)
		
		//코딩하다가 고려해야할점.
		
		//지금 가진돈에서 가격을빼고, 돈이적은지 판단하는데
		//내가 100원있는데 1000원tv를살수있다

		//내가돈이있으면?
		//살수있다
		
		//살수있다
		//내가돈이있으면?
		
		//바로종료
		
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
				 파라미터: x   
				    
		    
		*/
		Buyer a = new Buyer(1000);
		a.buy(new Tv());
		a.buy(new Computer());
		a.buy(new Audio());
		a.buy(new Computer());
		a.buy(new Computer());
		a.buy(new Computer());
		a.buy(new Computer());
		a.summary();
		
		
    /*
      cart[]
잔액부족해서 Computer를 못샀다
TV사용한 금액은:100
Computer사용한 금액은:200
Audio사용한 금액은:50
Computer사용한 금액은:200
Computer사용한 금액은:200
Computer사용한 금액은:200
남은 돈은:50

      */
	}
	
	
}
	
	










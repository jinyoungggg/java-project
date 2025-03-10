
import java.util.Scanner;

 
	
		
interface Predator {
	String getFood ();//(인터페이스는 구현하는게아니고 선언부만)
	// 디폴트 메서드
	default void printFood() {
		// %d, %s, %n (=\n)
		System.out.printf("my food is %s%n", getFood());
	}
	
}


interface Barkable {
	void bark();
}


class Animal {
	
	String name;
	void setName(String name) {
		this.name = name;
		
	}

}

// interface
// 나는 동물원(zoo)의 사육사(zooKeeper)이다.
// 육식동물(Predator)이 들어오면 먹이를 던져준다(feed).
// 호랑이(tiger)가 오면 사과(apple)를 던져준다.
// 사자(lion)가 오면 바나나(banana)를 던져준다.

class Tiger extends Animal implements Predator, Barkable {

	@Override // 어노테이션 (생략가능)
	public String getFood() {
		
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
		
		
}
	
}     //Tiger은 Ani의 객체이기도하고 Pre의 객체기도함
class Lion extends Animal implements Predator, Barkable{ //다형성: 여러개 상속 

	@Override
	public String getFood() {
		
		return "banana";
}

	@Override
	public void bark() {
		System.out.println("으르렁");
	}
}


class ZooKeper {
	
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
	void feed(Tiger tiger) {
		

	}
	
}

class Cry{
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}

  public class exam{

	public static void main(String[] args) {
		
		ZooKeper zooKeeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		
		Cry cry = new Cry();
		cry.barkAnimal(tiger);
		cry.barkAnimal(lion); // 어흥
							//  으르렁
		
	}
  }
		
		
		
		

	

      





































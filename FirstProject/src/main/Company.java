package main;

import java.util.HashMap;
import java.util.HashSet;


class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}
	
class CarFactory{
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if (instance == null)instance = new CarFactory();
		return instance;
	}
	public Car createCar(String name) {
		if (carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
		
	}
}
public class Company {
	
	private static Company instance = new Company();
	private Company() {}
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	public static void main(String[] args) {
		
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		System.out.println(com1 == com2); // true
		
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2); // true로 나와야한다.
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1==avante2); //true로 나와야한다.
		
		System.out.println(sonata1==avante1);//false로 나와야한다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

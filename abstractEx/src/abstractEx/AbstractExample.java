package abstractEx;

import java.util.ArrayList;
import java.util.Arrays;

//public 어디서든 접근가능
//private 같은 클래스 내부에서만 접근가능
// protected 같은 패키지 안에 있는 자바파일들 또는 상속받는 클래스 관계
class Calculator {
	int value=0;
	Calculator(){
		this.value = 0;
	}
	void add(int val) {
		this.value += val;
	}
	int getValue() {
		return this.value;
	}
	public boolean isOdd(int i) {
		return i % 2 == 1 ? true : false;
	}
	//메소드 오버로딩
	public int avg(int[] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		return total / data.length;
	}
	public int avg(ArrayList<Integer> data) {
		
		int total = 0;
		for(int item : data) {
			total += item;
		}
			
		return total / data.size();
	}
}




class MaxListCalculator extends Calculator{

	@Override
	int getValue() {
		
		return this.value > 100 ? 100 : this.value;
	}


}
public class AbstractExample {
	public static void main(String[] args) {
	
	
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		
		System.out.println(cal.isOdd(3));//3 홀수 : true
		System.out.println(cal.isOdd(4));// 4 짝수 : false
		
		//배열로 받는 파라미터의 평균을 정수 리턴
		
		
		int[] data1 = {1,3,5,7,9};
		int result1 = cal.avg(data1);
		System.out.println(result1);
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		int result2 = cal.avg(data2);
		System.out.println(result2);
		
		
		
		//1. UpgradeCalculator클래스를 만들고
		// 값을 뺄 수 있는 minus 메서드를 추가하자.
		UpgradeCalculator ucal = new UpgradeCalculator();
		
		ucal.add(10);
		ucal.minus(3);
		System.out.println(ucal.getValue()); //7
		
		
		
	//객체 비교	
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> b = a;
		
		
		
		
		a.add(4);
		
		
		System.out.println(b == a); //true
		
		
		
	}
}
	
	










package Baekjoon;

import java.util.ArrayList;
import java.util.List;

public class Sample implements Runnable {

	private int seq;
	public Sample(int seq) {
		this.seq = seq;
	}
	@Override
	public void run() {
		System.out.println(this.seq +"thread run");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.seq +"thread end");
	}
		
	
	
	public static void main(String[] args) {
		

		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i <10; i++) {
	Thread test = new Thread(new Sample(i));
	// start() 메서드로 thread를 실행한다.
	test.start();
	threads.add(test);
		}
		
		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("반복문 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
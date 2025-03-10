class Student{

	
										String name;
										int ban;
										int no;
										int kor;
										int eng;
										int math;
										
										
										
										
										
										@Override
										public String toString() {
											return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor="
													+ kor + ", eng=" + eng + ", math=" + math + "]";
											
										}
										public String getName() {
											return name;
										}
										public void setName(String name) {
											this.name = name;
										}
										public int getBan() {
											return ban;
										}
										public void setBan(int ban) {
											this.ban = ban;
										}
										public int getNo() {
											return no;
										}
										public void setNo(int no) {
											this.no = no;
										}
										public int getKor() {
											return kor;
										}
										public void setKor(int kor) {
											this.kor = kor;
										}
										public int getEng() {
											return eng;
										}
										public void setEng(int eng) {
											this.eng = eng;
										}
										public int getMath() {
											return math;
										}
										public void setMath(int math) {
											this.math = math;
										}
										
										double getTotal(){
											double dd = this.getKor()+this.getEng()+this.getMath();
											return dd; // dd가 getTotal로 반환됨. 이제 버리는거!
										}
										double getAverage() {
											double cc = getTotal()/3;
											return cc;
										}
										
}									
	


public class exam {
			public static void main(String[] args) {
				
				// Student클래스에 평균을 구하는 getTotal()
				// 국, 영, 수의 점수 합산값을 리턴 받아서 출력
				
				// Student 클래스에 평균을 구하는 getAverage()
				// 총점의 평균을 구한다.}
				
				//국영수 중에 가장 점수높은과목 출력하는 getHigh()
				
				Student s1 = new Student();
				s1.setName("홍길동");
				s1.setBan(5);
				s1.setNo(1);
				s1.setKor(80);
				s1.setEng(90);
				s1.setMath(95);
				
				
				System.out.println(s1.toString());
				System.out.println("이름: " + s1.getName());
				System.out.println("총점: "+ s1.getTotal() + "점");
				System.out.println("평균: "+s1.getAverage() + "점");
				
			
			

	}

			
} 
/*
public class exam {
	
	public static void main(String[] args) {
		
	
	// 1번 >>> 1~100 사이의 랜덤값 출력	
		
	
			int a = (int) (Math.random()*100);
			
			
			System.out.println(a);
		}*/
      


      





































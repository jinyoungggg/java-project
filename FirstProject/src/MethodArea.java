
public class MethodArea {
	
		
	
	public static void main(String[] args) {
		Person person = new Person("정진영",160.1, 62.3); //객체생성
		
		Person person2 = new Person(); // 위랑 똑같음 다른 방식
		person2.setName("홍길동");
		String name = person2.getName();
		System.out.println(person2.name);
//		person2.name = "홍길동";
//		person2.height = 185.5F;
//		person2.weight = 80.3F;		
//		
	
	}

}

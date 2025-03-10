
public class ArrayExample {

	public static void main(String[] args) {
		//배열: 자료형의 집합체
		int a;
		a = 0;
		
		int[] odds = {1, 3, 5, 7, 9};//1. 배열 자료형 선언 첫번째 방법
		System.out.println(odds[2]); // 5
		int[] odds2 = new int[5];   // 2. 배열 자료형 선언 두번째 방법
		odds2[0] = 1; // 저 위에 0번째 1(컴퓨터는 0부터시작)
		odds2[1] = 2;
		odds2[2] = 3;
		odds2[3] = 4;
		odds2[4] = 5;
		 System.out.println(odds2[4]); // 5
		
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
	}

}

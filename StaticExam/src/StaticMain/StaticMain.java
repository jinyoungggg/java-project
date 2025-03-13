package StaticMain;

import sfuffle.Shuffle;



	

public static void main(ArrayList<sfuffle.shuffle>) {
		
		//문제. 1~9까지의 숫자를 랜덤하게 뒤섞어서 result에 담아서 출력
	// 1.original 길이만큼 반복 
	//2.랜덤함수 사용 
	//3.임시로 배열의 n번째 값 담을 변수 선언
	//4. 파라미터로 받은 배열의 n번째랑 랜덤으로 생성한 배열의 n 값바꿔서 리턴
	
	
	int[] original = {1,2,3,4,5,6,7,8,9};
	
	
	
	
	
	int result = Shuffle.excute(original);
	
	
	//랜덤 범위를 배열 길이 내에서만 나오게 작성
	for (int i = 0; i < original.length; i++) {
		
		int rnd = Math.random();
		
		System.out.println(rnd);
		
		//임시로 배열의 i번째를 저장할 변수
		
		// 배열의 위치를 변경
		// 바꾸는 요령은 배열의[i] =에 랜덤으로 생성한 번호의 배열요소
		// 랜덤으로 생성한 배열요소에 i번째 임시 배열 저장 변수값 대입
		
	
	}
	
}

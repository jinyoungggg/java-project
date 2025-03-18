package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test  {
	
	
	/* 1. 문자열바꾸기
	다음과 같은 문자열이 있다
	
	문자열의 split과 String.join 메서드를 이용해서 다음과 같이 출력하자.
	a#b#c#d
	*/
	/* 2. 맴에서 값 추출하기
	 * 맵에서 'c'라는 key에 해당하는 value를 출력하는 프로그램이다.
	 * 하지만 맵 a에는 'c'라는 key가 없어서 null이 출력된다.
	 * 코드를 수정해서 'c'에 해당하는 key값이 없을 경우 null대신 70을 출력하자.
	 */
	

	public static void main(String[] args)  {
		
		// 1번
//		String s = "a:b:c:d";
//	String[] ss = s.split(":");
//	String result = String.join("#", ss);
//		System.out.println(result);
			//2번
//		Map<String, Integer> a = new HashMap<>();
//        a.put("A", 90);
//        a.put("B", 80);
//        Integer c = a.get("C") == null ? 70 : a.get("C");
//        
//      
//        System.out.println(a.get("C"));

			
			// stream API를 사용해서 배열의 합과 평균을 구하는 코드로 개선하기
			int[] nums = {1,2,3,4,5};
			int sum = 0;
			for (int i = 0; i <nums.length; i++) {
				sum += nums[i];
				
			}
			double avg = (double) sum / nums.length;
			Arrays.stream(nums).
			int sum2 = Arrays.stream(nums).sum(); // 이 두줄만 추가함 됨.
			double avg2 = Arrays.stream(nums).average().orElse(0.0);
			
			System.out.println(avg);//3.0
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
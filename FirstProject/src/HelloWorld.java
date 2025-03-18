// 1일차




/*

//	예제	// Student클래스에 평균을 구하는 getTotal()
		// 국, 영, 수의 점수 합산값을 리턴 받아서 출력
		
		// Student 클래스에 평균을 구하는 getAverage()
		// 총점의 평균을 구한다.}
	
import java.util.Scanner;

public class HelloWorld {
// public : 접근제어자
	public static void main(String[] args) {
		System.out.print("Hello World");
		
		// int : 정수
		// String : 문자 
		int a = 2; // a : 변수
					// ; : 명령종료
	
		
		// 이름 짓는 규칙
		String jongSunChoi = "최종선"; // 카멜 케이스(주로 카멜 씀)
		String jong_sun_choi = "최종선"; // 언더스코어 케이스
		
		// 문자끼리 연산도 ㄱㄴ
		String a = "최";
		String b = "종선";
		int c = 100;
		
		System.out.println(a + b + c); // 최종선100
		
		//정수
		int age = 10;
		long age2 = 2147483648L; // long 2147..47초과시 L
				
		//실수
		//float, double
		float a = 3.141592F;
				
		//나머지값 : %
		
		// sum
		int a = 3;
		int b = 4; 
		int sum = ( a + b);
		sum = sum + b; // ㄱㄴ
		System.out.println(sum); // 11
		
		
	//2일차	     // boolean
			    // 참(true), 거짓(false)
				boolean b1 = true;
				boolean bf = false;
				// char, string(문자) ASCII(영문숫자,특수기호,1바이트 한글은 2바이트여서 x)
				// unicode(2바이트)
				
				char ch = 'A';
				System.out.println((int)ch); // 65
				
				int z = 65;
				System.out.println((char)z); // A
				
				// char은 홋따옴표'', string은 쌍따옴""
				
				int i = 0;
				var j = 0;
				var k = "aaa"; // var 알아서 변환
				
		//변수
				int i = 0;
				i = 1;
				i = 2; //재정비가능
				
				// 상수
				// 변수슨 소문자 또는 카멜케이스
				// 언더스코어 케이스
				// system out println
				// systemOutPrintln
				// system_out_println
				
				// 상수는 무조건 대문자 + 언더스코어 암묵적인 룰
				final int J = 10;
				final doble PI = 3.14;
				pi = 10.1; // error 상수는 재정비 불가능
				
				
	// 연습문제. 주민번호 변수선언 (앞자리 6자리만)
			//1. 자료형ㅇ? 변수명?  // int residentRegistrationNumber = 941029;( 041029는 String사용)
				
			//2. 아래 문장에서 리터럴, 변수, 상수를 써라.
			int i = 100;
			long l = 100L;
			final float PI = 3.14F;
			// 100;, 100L;, 3.14F;(리터럴(변수값)), i, l, PI(변수), final(상수)
			
 //연습문제 // 다음의 연산 결과를 예상해보고 실행 
			// 문자열과 덧셈연산 => 항상 문자열
			// 문자열 + 아무자료형 => 문자열 + 문자열 = 문자열
			// "" + 7 => "" + "7" => "7"
				System.out.println("1" + "2"); //12
				System.out.println('A' + 'B'); // 65, 66, 131
				System.out.println('1' + 2);   // 캐릭터타입49, 2, 51
				System.out.println('1' + '2'); // 캐릭터타입49, 50, 99
				System.out.println('J'+ "ava");//Java
				
				
		// 형변환
				int n = 10;
				double d = n;
				System.out.println(n); //10
				System.out.println(d); //10.0 묵시적형변환(자동형변환)
				// 형변환
				// 바이트가 작은 자료에서 큰 자료로 바뀌는건 : 묵시적형변환(자동형변환)
				// 위와 같이 int 4바이트, double 8바이트
				int i = 100; // 100
				float f = i; // 100.0
				double r = i + f; 
				System.out.println(r); // 200.0
				
				// 바이트가 큰 자료에서 작은 자료로 바뀌는 것 : 명시적형변환(강제형변환)
				double a = 10.5;
				int b = (int) a; // 명시적형변환
				System.out.println(b); //10	
				
	//연습문제(명시적형변환)
				double dNum1 = 1.2;
				float fNum2 = 0.9F;
				
				int iNum3 = (int)dNum1 + (int)fNum2;
				int iNum4 = (int)(dNum1 + fNum2);
				System.out.println(iNum3); //1
				System.out.println(iNum4); //2
				
				
	// 연산자
		// + - * / 사칙연산
				int a = 2;
				int b = 5;
		// 나머지값 %
			   double result = (double)a % b;//명시적형변환
				System.out.println(result); // 2.0 정확한 실수값
	
		// ++ : 값의 증가
		// -- : 값의 감소
				int a = 1;
				System.out.println(a); //1
				a++; // a = a + 1;와 동일하다.
				System.out.println(a); //2
				a--; // a = a - 1;와 동일하다.
				System.out.println(a); //1
				
		// ++, --가 변수 앞에오냐 뒤에오냐 위치에 따라 결과가 달라짐
		// a++ 후위, ++a 전위		
				int a = 1;
			
				System.out.println(a++); //1(++가 결과 나온 후에 실행됨)
				System.out.println(a);  //2
				System.out.println(++a);//3(++가 앞서 실행됨)
				System.out.println(a); //3 
				
				int a = 1; 
				int b = a++;
	// ㅈㄴ헷갈림
				System.out.println(a); //2
				System.out.println(b); //1
						
				int a = 1; 
				int b = ++a;
			    System.out.println(a); //2
				System.out.println(b); //2
				
	// 관계연산자*****
			boolean isSuccess = true;// true;(1) or false;(0)
			// 좌항과 우항을 비교해서 참 true, 거짓 false로 출력한다.
			// 2 > 1 좌항이 우항보다 크면 true, 아니면 false
			// 2 < 1 좌항이 우항보다 작으면 ture, 아니면 false
			// 2 >= 1 좌항이 우항보다 크거나 같으면 true, 아니면 false
			// 2 <= 1 좌항이 우항보다 작거나 같으면 true, 아니면 false
			// 2 == 1 좌항과 우항이 같으면 true, 아니면 false
			// 2 != 1 좌항과 우항이 같지 않으면 true, 아니면 false
				
			System.out.println(2 > 1);// true
  // 연습문제 .내 나이가 30살 보다 크면 true, 아니면 false
			int myAge = 22;
			boolean result = myAge > 30; // result 30 >= myAge;
                                         // 코드컨벤션
			
			System.out.println(result); // false	
		// 잡담
			// API : Application Programming Interface
			// JSON(데이터)을 말아서 달라
			
			// EndPoint : 특정한 데이터를 요청하는 웹의 경로 URL
			// Request : 무언가를 요청한다.
			// Response : 데이터의 응답	
			
			boolean result = 3 % 2 == 0;
			System.out.println(result); // false
			
	// 조건연산자(= 상황연산자)
			//     연산자    ?   참  :   거짓;
			// (1 + 1 == 2) ? true : false;
			// boolean : true, false
			boolean result = (1 + 1 == 2) ? true : false;
			System.out.println(result);//  true
			String res = (1 + 1 == 3) ? "같다" : "다르다";
			System.out.println(res);

// 연습문제!!
			
			int numOfApples = 123; // 사과의 갯수
			int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
			int numOfBucket =
					numOfApples/sizeOfBucket 
			+(numOfApples % sizeOfBucket > 0 ? 1 : 0);
			System.out.println
			("필요한 바구니의 수 : " + numOfBucket); // 필요한 바구니의 수 : 13
			
	// 양수, 음수, 0 : 비교연산자 + 3항 연산자
			// 1차 : 양수, 음수만 판단
			// 2차 : 0까지 판단
			int num = 10;
			String step1= num > 0 ? "양수" : "음수"; // 양수
			
			int num = 0;
			// (비교식) ? 참 : (비교식) ? 참 : 거짓
			String step1 = num > 0 ? "양수" : num < 0 ? "음수" : "0";
			
	;
			System.out.println(step1);//0
	//연습문제// 457 > 400// 400출력하기

			
			int num1 = 457;
			System.out.println(num1 / 100 * 100);//400
			
// 비교문, 반복문, 배열
			// (조건) ? 참 : 거짓
			// if (조건) { 참 } else { 거짓 }
			// else는 상황에 따라 없을 수도 있다.
//			if (조건) {
//				// 참일때 코드
//			} else {
//			   // 거짓일 때 코드
			}
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		//String result = (height > base) ? "크다" : "작다";
		//		System.out.println(result);
		// 이것을 if 문으로 ->
		  if (isTall) {
			System.out.println("크다");
		} else {
			System.out.println("작다");
		}
		  
	// 연습문제// 내가푼풀이
			int i = 3;
			// 1번 : 3항 연산자로 변수값 i가 홀수인지 짝수인지 판단
			// 2번 : 위 내용을 if else 구문으로 출력
			
		     String result =i % 2 == 1 ? "홀수" : "짝수";
		     System.out.println(result);
		//쌤풀이 
		  // 1번
				//boolean res1 = (i % 2 == 1);
				//boolean res2 = (i % 2 == 1) ? true : false;
				String res3 = (i % 2 == 1) ? "홀수" : "짝수";
				System.out.println(res3);
				
			// 2번
				int j = 3;
				if (j % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}	
		
	// 논리연산자
				boolean resultA = a > 0;
				System.out.println(resultA);
				boolean resultB = b > 0;
				System.out.println(resultB);
				
		// && : 논리곱 => &&로 구분된 좌측과 우측이 모두 true일 때
			// and
				String resultC = (a > 0) && (b > 0) ? "참" : "거짓";
				System.out.println(resultC);// 참
				
		// || : 논리합 => ||로 구분된 좌측과 우측 중 하나가 true일 때
			// or
				String resultD = (a > 0) || (b < 0) ? "참" : "거짓";
				
		// ! : 부정 => !true 는 false, !false 는 true
				// not
				String resultE = !(a > 0) ? "참" : "거짓";		
				System.out.println(resultE); // 거짓
				
			// 이것을 if문으로 바꾸어보자 =>
				if (a < 0 || b < 0) {
					System.out.println("참");
				}else {
					System.out.println("거짓");// 참
				
// 3일차  
	// else if 반복조건문		
					public class examm {

						public static void main(String[] args) {
							int age = 21
									;
							if (age < 8 ) {
								System.out.println("미취학아동이다.");
							}	
							if (age <= 19) {
								System.out.println("학생이다.");
							} else if (조건) {
							} else if (조건) {	
							} else if (조건) {	
							} else if (조건) {
								
							}
							else{
								System.out.println("성인이다.");//마지막 else
							}
							}
						}	
	// 연습문제
					// 점수
					int score = 85;
					// 둥급텍스트
					//String result = "";
					// 90 이상 : A등급입니다.
					// 80~ 90 미만 : B등급입니다.
					// 70~ 80 미만 : C등급입니다.
					// 70 이하 : F등급입니다.
					
			//내풀이		 
					String result = "등급입니다.";
					if  (score >= 90) {
						System.out.println('A'+ result);
					}else if (score < 90 && score >= 80) {
						System.out.println('B' + result);
					}else if (score < 80 && score >= 70) {
					    System.out.println('C' + result);
			        }else {
						System.out.println('F' + result);
			        } // B등급입니다.
					
		// 쌤풀이
					String result = "등급입니다.";
					if  (score >= 90) {
						result = "A";
					}else if (score < 90 && score >= 80) {
						result = "B";
					}else if (score < 80 && score >= 70) {
						result = "C";
			        }else {
			        	result = "D";
			        } 
					System.out.println(result + "등급입니다.");
					
					
			// 자동완성은 ctrl + space
					// 자동완성 목록이 나오면 방향키 상, 하 + 엔터를 이용해서 완성가능
					
		//콘솔 사용자 입력하는법(실행후 입력)=>
					Scanner scanner = new Scanner(System.in);
					String str = scanner.next();//사용자에게 문자형태로 입력받는다.
					int in = scanner.nextInt();//사용자에게 숫자형태로 입력받는다.
					
					
	// 연습문제    //정진영
				//정진영님 반가워요.
					Scanner scanner = new Scanner(System.in);
					System.out.print("문자를 입력하세요 :");
					String str = scanner.next();
					System.out.println(str + "님 반가워요.");//정진영 입력 후 Enter//정진영님 반가워요.
					
					
//개헷갈림// 연습문제	//숫자 2개를 입력 받아서 덧셈 연산 후 출력
					
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("숫자 1번 입력: ");
				int in = scanner.nextInt();
				System.out.print("숫자 2번 입력: ");
				int in2 = scanner.nextInt();
				
				
				System.out.println("두 수의 합: " + (in + in2)); 
				//숫자 1번 입력: 10
                //숫자 2번 입력: 50
                // 두 수의 합: 60
				
// 연습문제 ㅈㄴ헷갈림!!!! 중요!!
			// + - * / a\문자열로 받아
			// in = 5 in2 = 10 연산기호 /
				
				Scanner scanner = new Scanner(System.in);
				System.out.print("숫자 1번 입력: ");
				int in = scanner.nextInt();
				System.out.print("숫자 2번 입력: ");
				int in2 = scanner.nextInt();
				System.out.print("연산 기호 입력 : ");
				String operator = scanner.next();  //연산수행***** operater
				
				int result = 0;
				if (operator.equals("+")) {
					result = in + in2;
				} else if (operator.equals("+")) {
					result = in - in2;
				} else if (operator.equals("*")) {
					result = in * in2; 
			    } else if (operator.equals("/")) {
					result = in / in2;}
				
				System.out.println(result);
     // 실행결과 숫자 1번 입력: 8
			// 숫자 2번 입력:2
			//연산 기호 입력: 4
			/ 4
			
	// => switch문 형
			switch(operator) {
			case ("+"): 
				in = in + in2;
				break;
			case ("-"):
				in = in - in2;
				break;
			case ("*"):
				in = in * in2;
				break;
			case ("/"):
				in = in / in2;
				break;
			
			
			
			
	//equal과 wrapper클래스
//			//String은 wrapper class(ctrl 하면 막 설명나오는것 다 wrapper클래스)
//			//integer (메모누락함; 설명이 스치듯 날아감;)
//			//equal: 메모리주소비교하는게아니고 메모리안의 변수(값)를비교 
//			//프리미티브 타입이아니고 wrapper 클래스의 경우 == 사용x equal 사용
//			//call by reference 창조에의한호출
//			//call by value 값에 의한 호출
//			System.out.println(a==c);//기본자료형에 쓰임 프리미티브
//			System.out.println(a.equals(c));//래퍼클래스
//			
//			//primitive type
//			byte, short, int, long, float, double, char, boolean
//			// wrapper class
//			Byte, Shout, Integer, Long, Float, Double, 
//			
//			//String a ="a";
//			String b ="b"; // 리터럴이 같기에 메모리 주소가 같음 메모리내용 비교 x
//			
//			System.out.println(a.hashCode());
//			System.out.println(b.hashCode());
//					
//			
// if문 => Switch문 
			
			if (month == 1) {
				monthString = "January";
			} else if (month == 2) {
				monthString = "Feburary";
			} else if (month == 3) {
				monthString = "March";
			} else {
				monthString = "error";
			}
			
			System.out.println(monthString);
			
	//Switch문
			
			switch(month) {
			case 1: 
				monthString = "January";
				break;
			case 2:
				monthString = "Feburary";
				break;
			case 3:	
				monthString = "March";
				break;
			default:
				monthString = "Error";
				break;
	}		
		
							
			int i = 0;
			// i값을 1씩 증가시키는 방법 3가지
			// 1. i = i + 1;
			// 2. i++;
			// 3. i += 1;
			System.out.println(i);
							
			
			// for 문 : 연산을 반복한다.
			if (n개의 조건) {
				// 내용
			}
			
			for ( 초기값;  조건문;  증가값) {
				//내용
				
				
	// 1 + 2 +....+ 10 => 55출력하기
				int sum = 0;
				for ( int i = 0; i <= 10; i++) {
					sum += i;
				}// 이 i++값은 중괄호안에서만 활성화가 됨. 빠져나감 x
				
				System.out.println(sum);// 55
			
				
				
	 // 연습문제(ㅠㅠ)
			// 1~ 20까지의 정수 중에 2 또는 3의 배수가 아닌 수의 합
			// 2의배수: 특정값을 2로 나눌 때 나머지 0
			// 3의 배수: 특정값을 3으로 나눌 때 나머지 0
				
				
				int sum = 0;
				for ( int i = 1; i <= 20;  i++) {
					if(i % 2 != 0 && i % 3 != 0) {
						
						sum += i;
				} 
			} System.out.println(sum); // 73
			}
			
	// 연습문제(ㅠㅠ)
			
			//1 + ( 1 + 2) + (1 + 2 + 3) + ...(1 + 2 +.. 10)
			// 220
			
			int sum = 0;
			int totalSum = 0;
			for (int i = 1; i <= 10; i++) {
			
			sum += i;
			
				totalSum += sum;
			
			}
		System.out.println("totalSum=" + totalSum);
		
		
		// i 값이 증가
		// sum에 i값을 누적 저장하면
		// sum = 1+3+6+10+...55
		// totalSum >>> sum을 누적
		
		// i      sum  totalSum
		// 1        1     1
		// 2		3     4= 1+3 = 1+(1+2)
		// 3        6     10
	// 1 3 6
		
		}	
			
			
	4일차		// (반복문종료) break나오면 뒷문장 무시하고 즉시 반복문 빠져나옴.
			// 반복문의 현재 단계 종료 continue;(특정부분 건너뛰기)
			for (int i = 1; i <= 5; i++) {
				if (i == 3) {
					continue;
				}
				System.out.println(i);
			}			
					
	//연습문제 // 반복문: for, while, do ~ while
	for (int i = 0; i < 10; i++) {
		//
	}
	int treeHit = 0;
	while (treeHit < 10) {
		// 수행할 문장
		++treeHit;//코드의 위치 중요!
		System.out.println("나무를" + treeHit + "번 찍었슴니다.");
		
		if (treeHit == 10) {
		System.out.println("나무가 넘어갑니다");
	} 
		
		
	// 연문
		
		int coffe = 10;
		int money = 300;
		
		while (money > 0) {
		
			System.out.println("돈을 받았다. 커피를 준다.");
			System.out.println("남은 커피의 양은" + --coffe + "입니다.");
		
		if (coffe == 0) {
			System.out.println("커피 판매 종료");
			break;
				
			
			
			int i = 0;
			while ( i < 10) {
				i++;
		   // 홀수만 출력, continue로
				 System.out.println(i);
			    if (i % 2 == 0) 
				 continue;
			 
			 
	// for while do ~ while // 
				int num = 1;
				int sum = 0;

				do {
					sum += num;
					num++;
				} while (num <= 10);
					System.out.println(sum);
	//구구단만들기 ㅜㅜ
					
					
					// 2 * 1 = 4
					// 2 * 2 = 4
					// .....
					// 2 * 9 = 18
				
					for (int i = 2; i <= 9; i++) {
						
						for (int j = 1; j <= 9; j++) {
							
							System.out.println(i +"*"+j + "=" + (i * j));
					}
						System.out.println();// 단마다 뛰어쓰기 하고싶으면
							//ex)  	2*1=2
//						        	2*2=4
//									2*3=6
//									2*4=8
//									2*5=10
//									2*6=12
//									2*7=14
//									2*8=16
//									2*9=18
//
//									3*1=3
//									3*2=6
//									3*3=9
//									3*4=12
//									3*5=15
//									3*6=18
//									3*7=21
//									3*8=24
//									3*9=27
//			
		
			// 연습문제// 두개의 주사위를 던졌다.
						// 눈의 합이 6이 되는 모든 경우의 수를 출력
						// 1+ 5, 2+ 4, 3 + 3, 4+ 2, 5 + 1
						
						
						
						for( int a= 1; a <= 5; a++ ) {
							for(  int b = 5; b >= 0; b--) {
								if (a + b == 6)
								System.out.println("주사위 경우의 수 = "+ a + " + "+ b);
								
			// %n 개행(Enter),  %d 정수출력, %s 문자출력, %f 소수점출력
					System.out.printf("%d + %d = %d %n", a, b, a+b);
								
					//System.out.println(a + " + " + b + " = " + (a + b));
					
			
	//연습문제 123페이지
				//	구구단 짝수 
					
					for(int a = 2; a < 10; a++ ) {
						for (int b = 1; b < 10; b++) {
							if(a % 2 != 0) 
							continue;
								System.out.println(a+ " * " + b + "= " + a*b);
							
						}
					}
								
	// 구구단 단보다 곱하는수작거나 같은경우만 출력
					
					for(int a = 2; a < 10; a++ ) {
						for (int b = 1; b < 10; b++) {
							if ( a < b)
								break;
							
								System.out.println(a+ " * " + b + "= " + a*b);
							}
							continue;
							
	// *피라미드 만들기ㅠㅠㅠㅠㅠ
							
			//   *
		//		***       int starCnt = 1;
		//     *****
		//	  *******	  int spaceCnt = 4/2 + 1;

							for (int i = 0; i < 4; i++) {

								for (int j = 0; j < spaceCnt; j++) {

									System.out.print(" ");

								}

								for (int j = 0; j < starCnt; j++) {

									System.out.print('*');

								}

									spaceCnt -= 1;

									starCnt += 2;

								System.out.println();

							}
							
							
		// *다이아몬드만들기
							
							int starCnt = 1;

							int spaceCnt = 7/2 + 1;

							for (int i = 0; i < 7; i++) {

								for (int j = 0; j < spaceCnt; j++) {

									System.out.print(" ");

								}

								for (int j = 0; j < starCnt; j++) {

									System.out.print('*');

								}

								for (int j = 0; j < spaceCnt; j++) {

									System.out.print(" ");

								}

								if (i < 7 / 2) {

									spaceCnt -= 1;

									starCnt += 2;

								} else {

									spaceCnt += 1;

									starCnt -= 2;

								}

								System.out.println();

							}

					 
							
							
							
							
	// class 자바프로젝트	
							
							class Calculator1 {
								int result = 0;
								int add(int num) {   // add 호출
									result += num;
									return result;
									
								}
								int sub(int num) {
									result -= num;
									return result;
								}
							}





							public class Sample {

								public static void main(String[] args) {
									// 계산기 1번 객체를 생성한다
									Calculator cal1 =  new Calculator();
									// 계산기 2번 객체를 생성한다.
									Calculator cal2 =  new Calculator();
									
									System.out.println(cal1.add(3));
									System.out.println(cal1.add(4));
									
									System.out.println(cal2.add(3));
									System.out.println(cal2.add(7));
									
									
								}

							}


//클래스, 메서드생성
							
							class Animal {
								String name; // 멤버 변수, 객체 변수, 속성
									// 멤버변수에 값을 넣기 위해서는 메서드를 생성해야함
									// 메서드 method == 함수
									// war 와르, jar 자르
									//	cat.setName("냥이");
									//                 파라미터
								public void setName(String name) {
									this.name = name; // this 지워도 작동
									
									
								}
								
								
								
							}


							public class sampleClass {

								public static void main(String[] args) {
									// 객체, 인스턴스 ==> 클래스에 의해 만들어졌다. 
									Animal cat = new Animal();
									Animal dog = new Animal();
									Animal horse = new Animal();
									// 접근하는법=> 객체.객체변수
									cat.setName("냥이");
									System.out.println(cat.name);	
									dog.setName("댕댕이");
									System.out.println(dog.name);
									// null => 값이 할당되지 않았다.
									
								}

							}

							
	// 5일차 //class Calculator 
							
							class Calculator {
								// a, b 매개변수
								// 메서드의 구조
								// 리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수2,.....) {
										연산
										 // 리턴할 자료가 없으면 return문이 필요 없다.
														// 이 경우에는 리턴자료형을 void로 한다.
							
							// 입력과 출력이 모두 있는 메서드
								
								int sum(int a, int b) {
									return a + b; // return 연산한결과를 되돌려줌
								
								
								}
							
								
						  // 입력과 출력이 모두 없는 메서드
								String say() {		
									return "Hi";
								}
							
							
				
								
						// 입력은 없고 출력은 있는 메서드
							void sum2(int a, int b) {
								System.out.println(a + "와" + b + "의 합은 "+ (a+b) + "입니다.");
							}
							
								
							
							// 객체. 메서드명 (파라미터1, 파라미터2,...)
							
							// 입력은 있고 출력이 없는 메서드
								
						 void say2() {
							 System.out.println("Hi");
						 }
						 void sayNick(String nick) {
							 System.out.printf("나의 별명은 %s 입니다.");
						 }
								

							public class Sample {

								public static void main(String[] args) {
									// 계산기 1번 객체를 생성한다.
									Calculator cal1 = new Calculator();
									// 계산기 2번 객체를 생성한다.
									Calculator cal2 = new Calculator();
									
									// 3, 4 인수// 보통 매개변수와 인수는 파라미터라고 통칭
									int result = cal1.sum(3, 4);
									System.out.println(result);
									String hi = call.say();
									
									System.out.println (hi);
									call.sum2(3, 4);

								}

							}				
				
		
		
				
			
// return			

							public class MethodArea {
								int varReturn(int 숫자) {
									숫자++; 
									//class안에서만 a 밖의 a와는 다른거
									return 숫자;
								}

								void varvoid(int 숫자) {
									숫자++;
								}
								public static void main(String[] args) {
									int a = 1; // 여기서 선언 된 숫잔 이 중괄호 범위 내에서만 사용가능
									MethodArea m = new MethodArea();
									a = m.varReturn(a);
									System.out.println(a);
	// this
									
									public class MethodArea {
										int a; // 객체 변수 a
										void varTest(MethodArea methodArea) { // 보통 클래스 이름과 변수이름 똑같이씀 
																			//	그대신 변수이름은 소문자시작
											methodArea.a++;
											}
										void varTest2() { // 위에거 보통 이렇게 간단하게 씀
											this.a++;
											
										}
										public static void main(String[] args) {
											// int a = 1;
											MethodArea m = new MethodArea();
											m.a = 1;
											m.varTest(m);
											System.out.println(m.a);// 2
											MethodArea m2 = new MethodArea();
											m2.a = 1;
											m2.varTest2();
											System.out.println(m2.a);// 2
											
										
										}

									}
							
							
				
									
					
									
									
									
									
									
									
	//			
									package vo;

									public class Person {

										
										String name;
										float height;
										float weight;
										public Person() {}
										
										
										public Person(String name, float height, float weight) {
											this.name = name;
											this.height = height;
											this.weight = weight;
										}
										
										public void setName(String name) {
												this.name = name;
										}
										
										public String getName() {
											return this.name;
										}
										
										
//										
										import vo.Person;

										public class MethodArea {
											
												
											
											public static void main(String[] args) {
												Person person = new Person("정진영",160.1F, 62.3F); //객체생성
												
												Person person2 = new Person(); // 위랑 똑같음 다른 방식
												person2.setName("홍길동");
												String name = person2.getName();
												System.out.println(name);
//												person2.name = "홍길동";
//												person2.height = 185.5F;
//												person2.weight = 80.3F;		
//												
											
											}}

									}
									
									
									
									
									
									package vo;

				// VO, DTO// 객체를 지칭하는 말 둘다 똑같다고봄됨.
									// VO :  Value Object
									// DTO : Data Transfer Object

									
									
									
									class test{
		//								
										int sum(int a,int b) {
											return a+b;
										}
										
									}
									public class exam {

										public static void main(String[] args) {
											
											 test a=new test();
											int sum = a.sum(3, 4);
											System.out.println(sum);
											
											
											
			//								
											
		//지환님이 알려주신것!!
											
//											클래스덩어리{
//											클래스의 특징(INT A 그런거)
//											
//											클래스의 특징을 밖에서 정하고싶을때 setter(set한다고 해서 setter)
//											클래스의 특징을 밖에서 가져오고싶을떄 getter(get/getter)
//											
//											
//										}
//										
//										동물{
//											특징:이름 string name
//											특징:소리 string sound
//											
//											setter
//											setname / setsound
//											
//											getter
//											getname / getsound
//											
//										}
//										
//										
//										main{
//											동물 a = new 동물();
//											a.setname("동물이름");
//											a.getname("동물이름");
	//누가 물어봤을때
		//뭐를 답할건지(답의형태: 글자인지 숫자인지 그런거를 미리 정해야함)
											
//											
//										}

	class food{
		String name;
		int price;
		
		void setname(String s) {
			this.name=s;
		}
		
		String getname() {
			return name;
		}
		
		
		public food() {
			System.out.println("food가 생성되었습니다");
		}  
		public food(int a) {
			System.out.println("food가 생성되었습니다 숫자와 함께");
		}
		public food(String name,int price) {
			this.name=name;
			this.price=price;
			System.out.println("food가 생성되었습니다");
			System.out.println("이 food의 이름은"+this.name+"이고, 가격은"+this.price+"원입니다");
		}
		
		
		
		
		
	}
		class exam{
			public static void main (String args[]) {
				
				food b = new food();
				food c = new food(1);
				food d = new food("과자",1000);
				
				
				
				
				
				
			}
		}
		
		
	// 상속
				class Animal {
					String name;
					void setName(String name) {
						this.name = name;
						
					}
				}
		
				class Dog extends Animal {
					void sleep() {
						System.out.println(this.name + " zzz");
					}
				}
		
				class HouseDog extends Dog {
					
					
				}
		
		
		
		
		
		
				public class Sample {
		
					public static void main(String[] args) {
						Animal animal = new Animal();
						Dog dog = new Dog;
						
						//IS -A 관계
						//Dog > Animal, Dog는 Animal의 하위 개념
						// Dog는 Animal에 포함되기에 Dog은 Animal, 반댄아님
						// 이것을 IS-A 관계라고한다.
						Animal a = new Dog();//ㅇㅇ
		//				Dog b = new Animal();// ㄴㄴ
						Object c = new Animal();
						
						
						
						
					}
		
				}
				
	//연습  class test{
				String result="글자";
				String return_result() {
					return result;
				}
				void print_result() {
					System.out.println(result);
				}
				int add(int num1,int num2) {
					int res;
					res=num1+num2;
					return res;
				}
			}


			public class exam {
				public static void main(String args[]) {
					test a= new test();
					
					System.out.println(  a.return_result()   );
					a.print_result();
					
					a.add(3, 4);
					System.out.println(  a.add(3, 4)   );// 글자
														//  글자
														// 7
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				// 6일차
					
					
					
	//메소드 오버라이딩
	//메소드 오버로딩class Animal {
						
						String name;
						void setName(String name) {
							this.name = name;
							
						}
					}

					class Dog extends Animal {
						void sleep() {
							System.out.println(this.name + " zzz");
						}
					}

					class HouseDog extends Dog {
						// 메소드 오버라이딩 //덮어쓰기
						void sleep() {
							System.out.println(this.name + " zzz in house");
						}
						// 메소드 오버로딩
						void sleep(int hour) {
							System.out.println(this.name + " zzz in house for " + hour + " hours");
						}
						
						
					}






					public class Sample {

						public static void main(String[] args) {
							Animal animal = new Animal();
							Dog a = new Dog();
							a.setName("강아지"); // 강아지 zzz
							a.sleep();
							
							HouseDog b = new HouseDog();
							b.setName("우리집 강아지"); //같은 클래스 상속밭을 때 우선순위 
							b.sleep();
							b.sleep(3); // 우리집 강아지 zzz in house for 3 hours
						

							
							
							
							
							
							
							
							
	// 오크셔, 불독 출력(1,2)
		//지환님 추가설명!!
						}
						
						
						class Animal {
							
							String name;
							void setName(String name) {
								this.name = name;
								
							}
						}

						class Dog extends Animal {
							void sleep() {
								System.out.println(this.name + " zzz");
							}
						}

						class HouseDog extends Dog {
							HouseDog(){}
							HouseDog(String name) {
								this.setName(name);{
									// 이름 지정안하면 오류뜨도록 지정
								}
							}// 요크셔테리어, 불독
							HouseDog(int type) {
								this.setType(type);{
									
									
								}
							}
								public void setType(int type) {
								
								String s1 = "요크셔테리어";
								String s2 = "불독";
								
								if( type ==1 )
									System.out.println(s1);
								else if( type ==2 )
									System.out.println(s2);
								else
									System.out.println("1도 2도 아님");
								//그릇 이름 = 들어갈내용
								
								//HouseDog c = new HouseDog(1);
								//HouseDog d = new HouseDog(2);
								// switch (type) {
//								case 1:
//									this.name = "요크셔테리어";//name대신 setName 사용가능 아무거나
//									break;
//									...
//									...
								// 삼항연산자사용하면
								this.name = type == 1 ? "요크셔" : "불독";
								this.setName(type = 1 ? "요크셔" : "불독");
//							}
								}
								
							

						class Person{
							String gender;
							String name;
							int age;
							
							//기능
							//뱉어야하는값의종류 기능이름()
							
							//숫자를뱉어야하면
							int 자기나이말하기() {
								return this.age;
							}
							//뱉는거없이아무거나해도상관x
							void 자기나이말하기2() {
								System.out.println(this.age);
							}
							//오버로딩=기능이름이똑같은데, 인자(부탁할때 같이말하는거)가 다를때
							//반환값 기능이름(  ) <= 안에들어가는 건, 자기가 쓸 종류의 데이터, 이름 상관x
							void 자기나이말하기2(int input_age) {
								System.out.println("내 나이는 "+this.age+"지만,"+input_age+"라고 할게요");
							}
							
							void 말하기() {
								System.out.println("그냥말하기");
							}
							void 말하기(int a) {
								System.out.println("말하기인데 숫자를 입력");
							}
							void 말하기(String a) {
								System.out.println("말하기인데 글자를 입력");
							}
							void 말하기(int a,int b) {
								System.out.println("말하기인데 숫자숫자를 입력");
							}
						}





						public class Sample {

							public static void main(String[] args) {
								
//								HouseDog b = new HouseDog("우리집 강아지");
//								HouseDog c = new HouseDog(3);
////								b.setName("우리집 강아지"); 
//								b.sleep();
							
								Person kim = new Person();
								//Person Lee = new Person();
								
								kim.age = 14;
								
								kim.말하기();
								kim.말하기(1);
								kim.말하기("ㄱㄴㄷㄹ");
								kim.말하기(1,1);
								
								)
						}
			

	//interface
							
							
							interface Predator {
								String getFood ();//(인터페이스는 구현하는게아니고 정의)
								// 디폴트 메서드
								default void printFood() {
									// %d, %s, %n (=\n)
									System.out.printf("my food is %s%n", getFood());
								}
								
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

							class Tiger extends Animal implements Predator {

								@Override // 어노테이션 (생략가능)
								public String getFood() {
									
									return "apple";
								}
								
							}     //Tiger은 Ani의 객체이기도하고 Pre의 객체기도함
							class Lion extends Animal implements Predator {

								@Override
								public String getFood() {
									
									return "banana";
							}
							}


							class ZooKeper {
								
								void feed(Predator predator) {
									System.out.println("feed " + predator.getFood());
								}
								void feed(Tiger tiger) {
									

								}
								
							}



							public class Sample {

								public static void main(String[] args) {
									
									ZooKeper zooKeeper = new ZooKeper();
									Tiger tiger = new Tiger();
									Lion lion = new Lion();
									zooKeeper.feed(tiger);
									zooKeeper.feed(lion);
									
									
									
									
									
									
									
									
		//getter, setter 예제
		//지환님 + 예제 				// 다음과 같은 멤버 변수를 갖는 Student 클래스를 생성해라
									//타입 : String, 변수명 : name => 학생이름
									//타입 : int, 변수명 : ban =>반
									//타입 : int, 변수명 : no =>번호
									//타입 : int, 변수명 : kor =>국어점수
									//타입 : int, 변수명 : eng =>영어점수
									//타입 : int, 변수명 : math =>수학점수

									class Student{
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
										String name;
										int ban;
										int no;
										int kor;
										int eng;
										int math;
										// getter, setter, constructor
									}

									public Student() {} // 생략 ㄱㄴ
									
									public Student(String name, int ban, int no, int kor, int eng, int math) {
										super();
										this.name = name;
										this.ban = ban;
										this.no = no;
										this.kor = kor;
										this.eng = eng;
										this.math = math;
									}
									public class Sample {	
										public static void main(String[] args) {
											//손수 적는 코딩출력은 해당 class 메인 메소드에서 !!!
												Student a = new Student();
												a.setName("정진영");
												a.setBan(1);
												a.setNo(2);
												a.setKor(100);
												a.setEng(95);
												a.setMath(97);
												System.out.println("(1)");
											System.out.println("이름: " + a.getName());	
											System.out.println(a.getBan()+"반");
											System.out.println(a.getNo()+"번");
											System.out.println(a.getKor()+"점");
											System.out.println(a.getEng()+"점");
											System.out.println(a.getMath()+"점");
										
											Student b = new Student();
											b.setName("김김김");
											b.setBan(3);
											b.setNo(4);
											b.setKor(50);
											b.setEng(50);
											b.setMath(37);
											System.out.println("(2)");
										System.out.println("이름: " + b.getName());	
										System.out.println(b.getBan()+"반");
										System.out.println(b.getNo()+"번");
										System.out.println(b.getKor()+"점");
										System.out.println(b.getEng()+"점");
										System.out.println(b.getMath()+"점");
											System.out.println("(3)");
										b=a;
										System.out.println("이름: " + b.getName());	
										System.out.println(b.getBan()+"반");
										System.out.println(b.getNo()+"번");
										System.out.println(b.getKor()+"점");
										System.out.println(b.getEng()+"점");
										System.out.println(b.getMath()+"점");
											
										
//										(1)
//										이름: 정진영
//										1반
//										2번
//										100점
//										95점
//										97점
//										(2)
//										이름: 김김김
//										3반
//										4번
//										50점
//										50점
//										37점
//										(3)
//										이름: 정진영
//										1반
//										2번
//										100점
//										95점
//										97점

										
										
										}
										}
							
									
									
									import java.security.PublicKey;

									class Student{

										String name;
										int ban;
										int no;
										int kor;
										int eng;
										int math;
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
										public class Sample {
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
											s1.setKor(100);
											s1.setEng(90);
											s1.setMath(95);
											
											
											
											System.out.println("이름: " + s1.getName());
											System.out.println("총점: "+ s1.getTotal() + "점");
											System.out.println("평균: "+s1.getAverage() + "점");
											
											//이름 : 
											//총점 : 점
											//평균 : 점   //   이름: 홍길동
											             //   총점: 285.0점
											              //  평균: 95.0점

											
											
										}	
									}
										
	//국영수 중에 가장 점수높은과목 출력하는 getHigh()		
										
										
	       String gethigh() {
				int a = this.getKor();
				int b = this.getEng();
				int c = this.getMath();
				
				if ((a>b)&&(a>c)) {
					return "국어"; 
				}
				else if((a<c)&&(b<c)) {
					
					return "수학";
				}
				else
					return "영어";
				
			} // 요 if문 한줄로 요약 ㄱㄴ!!
	       //return ((a>b)&&(a>c))?"국어":((a<c)&&(b<c))?"수학":"영어";
			
			
			

		}
			public class Sample {
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
				
				
				
				System.out.println("이름: " + s1.getName());
				System.out.println("총점: "+ s1.getTotal() + "점");
				System.out.println("평균: "+s1.getAverage() + "점");
				
				System.out.println(s1.gethigh()); // 수학

		
								}
								}
			
							
							
							
	// toString     소스 toString
	
	
	// 결과값 => Student [name=홍길동, ban=5, no=1, kor=80, eng=90, math=95]
	 
	
							
 
							
							
							
							
							
							
							
							
							
							
	// 1번 >>> 1~100 사이의 랜덤값 출력	
		
	import java.util.Scanner;
			int a = (int) (Math.random()*100) + 1;
			                                        //Math.Random() 0.0~0.999999
													//따라서 X100 하면
													//0~99
													//그래서 +1해줘야함!
														//1~100
			
			
			
			System.out.println(a);
						
						
											
//예제 //값이 작다, 크다, 같다
		// 작을 때 : 더 큰 수를 입력하세요.
		// 클때: 더 작은수를 입력하세요
		// 맞췄습니다. 시도 횟수는 몇회입니다.	
											

		public class exam{
	
	public static void main(String[] args) {
		
	
	// 1번 >>> 1~100 사이의 랜덤값 출력	
		
	
			int a = (int) (Math.random()*100);
			
			
			System.out.println(a);
		


      // 1번 >>> 1~100 사이의 랜덤값
  int answer = (int) (Math.random()* 100)+ 1;
	//사용자가 입력할 변수
	int input = 0;
	// answer를 맞출 때까지 시도한 횟수
	int count = 0;
	
	//사용자가 숫자를 입력한다.
	Scanner scanner = new Scanner(System.in);
	
	
	
		System.out.println("테스트용, 정답:"+answer);
		do {
			count +=1;
			//count +=1;// 위치 중요!!
			System.out.print("1~100사이의 값을 입력하세요: ");
			int input1 = scanner.nextInt();
			
			
			
			
			if(input1< answer)
				System.out.println("더 큰 수를 입력하세요.");
			else if(input1 > answer)
				System.out.println("더 작은 수를 입력하세요.");
			else if(input1==answer) {
				System.out.println("맞췄습니다. 시도 횟수는" + count +"회입니다.");
				break;	
			}   //만약 count +=1; 의 위치가 여기 있으면 한번에 맞춰도 0회라고 뜸!
		}while(true); // (  )  <-안의 내용이 맞다면 반복한다
		
		
//		1~100사이의 값을 입력하세요: 2
//		더 큰 수를 입력하세요.
//		1~100사이의 값을 입력하세요: 2
//		더 큰 수를 입력하세요.
//		1~100사이의 값을 입력하세요: 2
//		더 큰 수를 입력하세요.
//		1~100사이의 값을 입력하세요: 76
//		맞췄습니다. 시도 횟수는4회입니다.

		
		/*
		 * while(){  ()<-안의 내용이 맞다면 반복
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * do{
		 * }
		 * while()  ()<-안의 내용이 맞다면 반복하긴하는데,do 안을 무조건 1번은 실행함
		 * 
		 * 
		 */




// 다형성: 여러개상속

import java.util.ArrayList;

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
  
  //배열 자료형선언
  
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

// 7일차
  
  		// SQL
  			//INSERT INTO "데이터베이스이름" VALUES 데이터칸이름{학년=3,나이=17,이름=ㅇㅇㅇ}


//배열
  
	String[] weeks = new String[7];
	for (int i = 0; i <=6; i++){
		
	
		 weeks[0] = "월";
		weeks[1] =  "화";
		weeks[2] =  "수";
		weeks[3] =  "목";
		weeks[4] =	"금";
		weeks[5] =	"토";
		weeks[6] =  "일";
		
		System.out.println(weeks[i]);// (각각개행)월화수목금토일
	}
		
		
	
	//length자동완성
	
	System.out.println(weeks.length);// 배열로 선언하고 자동완성 length: 길이를 알아서 측정해줌.
	
		for (int i = 0; i <=weeks.length; i++){// 배열로 선언하고 자동완성 length: 길이를 알아서 측정해줌.
			System.out.println(weeks[i]);
		}

		
		//연습문제
		
	

//배열총합구하기 문제
		
		public static void main(String[] args) {
			//배열, array
			// 1차원 배열
				int[] arr = {10, 20, 30, 40, 50};
				int sum = 0;
				
				// 반복문으로 위의 배열 함산
				
				for(int i = 0; i <arr.length; i++) {// length는 개수(5개)이므로 < 써야함 
					
					 sum = sum + arr[i];
				}
				
				System.out.println("sum = " + sum); //150
				
			}

//2차원배열
		
		public class ArrayExample {

			public static void main(String[] args) {
			// 2차원 배열
				int[][]arr = {
						{5, 5, 5, 5, 5},
						{10, 10, 10, 10, 10},
						{20, 20, 20, 20, 20},
						{30, 30, 30, 30, 30}
				};
				
				int total = 0;
				
				float average = 0;
				
				
				for (int i = 0; i < arr.length; i++) {
					
					for (int j = 0;j < arr[i].length; j++) {
						total += arr[i][j];
						//System.out.println("현재위치["+i+"]["+j+"]");
					} 
					
			
				} 
				 average =  ((float)total / (arr.length * arr [0].length));//float으로 실수형태나오게
				System.out.println("total = " + total);
				System.out.println("average = " + average);
				
				
//				total = 325
//				average = 16.25

				
				
				
//				System.out.println("세로길이:"+arr.length);//세로4
//				System.out.println("가로길이:"+arr[0].length);//가로5
//				
			}

		}

/*출력문제!!!!!
500원: 5
100원: 1
50원: 1
10원: 3	
 */                  	public static void main(String[] args) {
		            // 큰 금액의 동전을 우선적으로 거슬러 준다.	
		                  int[] coinUnit = {500, 100, 50, 10};
		
		                  int money = 2680;
		 
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+ "원: " + money / coinUnit[i]);
			money = money % coinUnit[i];	
			
			 
		}	
			
//		   500원: 5
//		   100원: 1
//		   50원: 1
//		   10원: 3

	
		
		
	}
 

//일반 List와 ArrayList 차이
 
 import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
 import java.util.ArrayList;
 import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import vo.Book;
import vo.Material;

import java.util.ArrayList;

			import vo.Book;



			public class BookMain {

				public static void main(String[] args) {
					
					// 1번째 방법
					ArrayList<Book> list = new ArrayList<>();
					Book book = new Book();
					book.setBookName(" 태백산맥");
					book.setAuthor(" 조정래");
					book.setPrice(12000);
					book.setId(1);
					
					list.add(book);
					
					Book book2 = new Book(2, "데미안", "헤르만 헤세", 13000);
					list.add(book2);
					
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
				
				
				
				
				}
				// 클라스 Book
				
				package vo;

				public class Book {

					
					// 고유번호
					private int id;
					//책이름
					private String bookName;
					//작가
					private String author;
					//가격
					private int price;
					
					
					public int getId() {
						return id;
					}
					public void setId(int id) {
						this.id = id;
					}
					public String getBookName() {
						return bookName;
					}
					public void setBookName(String bookName) {
						this.bookName = bookName;
					}
					public String getAuthor() {
						return author;
					}
					public void setAuthor(String author) {
						this.author = author;
					}
					public int getPrice() {
						return price;
					}
					public void setPrice(int price) {
						this.price = price;
					}
					public Book(int id, String bookName, String author, int price) {
						
						this.id = id;
						this.bookName = bookName;
						this.author = author;
						this.price = price;
					}
					public Book() {}
					@Override
					public String toString() {//객체생성 프라이빗 게터세터 투스트링(오버라이드) 한세트!
						return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
					}
					
					
				
	//static 메모리에 먼저올라감 (먼저 생성돼있다.) 교재 181p
					
					public class Book {

						
						// 고유번호
						public static int id = 1000;
						
						public class BookMain {

							public static void main(String[] args) {
								
								
								ArrayList<Book> list = new ArrayList<>();
								Book book = new Book();
								book.setBookName(" 태백산맥");
								book.setAuthor(" 조정래");
								book.setPrice(12000);
								
								
								list.add(book);
								book.id++;
								
								
								Book book2 = new Book("데미안", "헤르만 헤세", 13000);
								list.add(book2);
								
								for (int i = 0; i < list.size(); i++) {
									System.out.println(list.get(i).toString());
								}
								
							
							//static 값공유, 메모리에 먼저올라감 (먼저 생성돼있다.)

		
								
								
								
								
	// 8일차
								
								package main;

								import java.util.ArrayList;

								import vo.Book;



								public class BookMain {

									public static void main(String[] args) {
										
										// 1번째 방법
										ArrayList<Book> list = new ArrayList<>();
										Book book = new Book();
										book.setBookName(" 태백산맥");
										book.setAuthor(" 조정래");
										book.setPrice(12000);
										
										
										
										list.add(book);
										
										
										
										
										Book book2 = new Book("데미안", "헤르만 헤세", 13000);
										list.add(book2);
										
										for (int i = 0; i < list.size(); i++) {
											System.out.println(list.get(i).toString());
										}
										
									//Book [bookId=1001, bookName= 태백산맥, author= 조정래, price=12000]
									//Book [bookId=1002, bookName=데미안, author=헤르만 헤세, price=13000]
									//static 메모리에 먼저올라감 (먼저 생성돼있다.)
									}
									
								
									
									
									
									
									
									
									package vo;

									public class Book {

										//static으로 선언하면 클라스로 공유
										// 고유번호
										private static int id = 1000;
										private int bookId;
										//책이름
										private String bookName;
										//작가
										private String author;
										//가격
										private int price;
										
										
										
										
										public int getBookId() {
											return bookId;
										}
										public void setBookId(int bookId) {
											this.bookId = bookId;
										}
										public int getId() {
											return id;
										}
										public void setId(int id) {
											this.id = id;
										}
										public String getBookName() {
											return bookName;
										}
										public void setBookName(String bookName) {
											this.bookName = bookName;
										}
										public String getAuthor() {
											return author;
										}
										public void setAuthor(String author) {
											this.author = author;
										}
										public int getPrice() {
											return price;
										}
										public void setPrice(int price) {
											this.price = price;
										}
										public Book( String bookName, String author, int price) {
											
											this.bookName = bookName;
											this.author = author;
											this.price = price;
											this.generateId();
											
										}
										private void generateId() {
											id++;
											this.bookId = id;
										}
										
										public Book() {
											System.out.println();
											id++;
											this.bookId = id;//gsdfghsfgsfg
										}
										@Override
										public String toString() {
											return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
										}
										
										
										}
										
										

								}
								
								
								
	//parseInt			
								String bookIdStr = sc.next();
								//Integer.parseInt : String 형태의 숫자를 int 형태의 숫자로 바꿔준다.
								bookId = Integer.parseInt(bookIdStr);
								Double.parseDouble(bookIdStr);
								String.valueOf(false);							
								
								
								
								
								
		//!!!지환님이 알려주신것		
								
								
								
								
								
								
								
								package vo;

								public class Book {

									//static으로 선언하면 클라스로 공유
									// 고유번호
									private static int id = 1000;
									public int bookId;
									//책이름
									private String bookName;
									//작가
									private String author;
									//가격
									private int price;
									// 생성일
									private String createDate;
									
									
									
									
									public String getCreateDate() {
										return createDate;
									}
									public void setCreateDate(String createDate) {
										this.createDate = createDate;
									}
									public int getBookId() {
										return bookId;
									}
									public void setBookId(int bookId) {
										this.bookId = bookId;
									}
									public int getId() {
										return id;
									}
									public void setId(int id) {
										this.id = id;
									}
									public String getBookName() {
										return bookName;
									}
									public void setBookName(String bookName) {
										this.bookName = bookName;
									}
									public String getAuthor() {
										return author;
									}
									public void setAuthor(String author) {
										this.author = author;
									}
									public int getPrice() {
										return price;
									}
									public void setPrice(int price) {
										this.price = price;
									}
									public Book( String bookName, String author, int price, String createDate ) {
										
										this.bookName = bookName;
										this.author = author;
										this.price = price;
										this.generateId();
										this.createDate = createDate;
										
									}
									
										
									
									private void generateId() {
										id++;
										this.bookId = id;
									}
									
									public Book() {
										System.out.println();
										id++;
										this.bookId = id;//
									}
									@Override
									public String toString() {
										return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
												+ ", createDate=" + createDate + "]";
									}
									
									
									
									}
									
									


								
								
								
								
								
								
								package main;

								import java.time.LocalDateTime;
								import java.time.format.DateTimeFormatter;
								import java.util.ArrayList;
								import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Baekjoon.Sample;
import abstractEx.Calculator;
import abstractEx.Computer;
import abstractEx.MaxListCalculator;
import abstractEx.NoteBook;
import abstractEx.UpgradeCalculator;
import calc.SwingEx;
import main.Car;
import main.CarFactory;
import main.Company;
import main.Person;
import main.Student;
import util.Calc;
import utill.DateTimeUtill;
								import vo.Book;



								public class BookMain {

									public static void main(String[] args) {
								DateTimeUtill.getDateTime();
										
										
										// 1. 날짜 생성해서 createDate에 파라미터로 넣기
												//2. 메시지를 띄운다. (1 : book 추가생성 ㅣ\list에 밀어넣어, 2. book 항목 삭제
										
								DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


								String formatedDate = LocalDateTime.now().format(dFormatter);
										
										// 1번째 방법
										ArrayList<Book> list = new ArrayList<>();
										Book book = new Book();
										book.setBookName(" 태백산맥");
										book.setAuthor(" 조정래");
										book.setPrice(12000);
										book.setCreateDate(formatedDate);
										
										
										
										list.add(book);
										

										
										
										Book book2 = new Book("데미안", "헤르만 헤세", 13000, formatedDate);
										list.add(book2);
										list.add(new Book("책1", "11", 13000, formatedDate));
										list.add(new Book("책2", "11", 13000, formatedDate));
										list.add(new Book("책3", "11", 13000, formatedDate));
										list.add(new Book("책4", "11", 13000, formatedDate));
										
										
										
									   // list.add(new Book("23", "33", 33));
										//추가할건지 삭제할건지 메세지를 띄운다.
										// 1을 고르면 책을 추가하는 코드를 작성한다.
										// 2를 입력하면 책을 삭제한다. 삭제할때 책의 식별자는 bookId 값으로 판단한다.
										//삭제할때 bookId를 입력받을 수 있게 scanner를 띄운다.
										//값을 입력 받으면 list를 순화하면서 동일한 bookId가 있으면 해당 책을 지운다.
										
										for(int j=0;j<list.size();j++)
											System.out.println(list.get(j));
										
										do {
										System.out.print("할일을 골라라.");
										Scanner sc = new Scanner(System.in);
										int workId = sc.nextInt();
										
										if(workId == 1) {
											//추가
											System.out.println("추가할 ID를 입력하세요.");
											int addBook = sc.nextInt();
											Book tmp = (new Book("책4", "11", 13000, formatedDate));
											tmp.bookId=(addBook);
											 list.add(tmp);
											
											
										}else if (workId == 2) {
											//삭제
											System.out.println("삭제할 ID를 입력하세요.");
											int bookId = sc.nextInt();
											for (int i = 0; i < list.size(); i++) {
												if (bookId == list.get(i).getBookId()) {
													list.remove(i);
												}
											}
											
											/*list.get(i)
											list목록안에서 i번째에있는것
											의bookid를가져와*/
											
											//System.out.println(list.toString());
											
										}else {
											//1,2이외 다른 숫자는 프로그램종료
											System.out.println("프로그램 종료");
											break;
										}
										for(int j=0;j<list.size();j++)
											System.out.println(list.get(j));
										
										}while(true);
										
										
										
									
										
									}}
										

										
//********연습문제개중요!!
								
								
								package vo;

								import utill.DateTimeUtill;

								public class Book {

									//static으로 선언하면 클라스로 공유
									// 고유번호
									public static int id = 1000;
									private int bookId;
									//책이름
									private String bookName;
									//작가
									private String author;
									//가격
									private int price;
									// 생성일
									private  String createDate;
									
									
									
									
									public String getCreateDate() {
										return createDate;
									}
									public void setCreateDate(String createDate) {
										this.createDate = createDate;
									}
									public int getBookId() {
										return bookId;
									}
									public void setBookId(int bookId) {
										this.bookId = bookId;
									}
									public int getId() {
										return id;
									}
									public void setId(int id) {
										this.id = id;
									}
									public String getBookName() {
										return bookName;
									}
									public void setBookName(String bookName) {
										this.bookName = bookName;
									}
									public String getAuthor() {
										return author;
									}
									public void setAuthor(String author) {
										this.author = author;
									}
									public int getPrice() {
										return price;
									}
									public void setPrice(int price) {
										this.price = price;
									}
									public Book( String bookName, String author, int price, String createDate ) {
										
										this.bookName = bookName;
										this.author = author;
										this.price = price;
										this.generateId();
										this.createDate = createDate;
										
									}
									
										
									
									private void generateId() {
										id++;
										this.bookId = id;
									}
									
									public Book() {
										System.out.println();
										id++;
										this.bookId = id;//
									}
									@Override
									public String toString() {
										return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
												+ ", createDate=" + createDate + "]";
									}
									
									
									
									}
									
									

								package main;

								import java.time.LocalDateTime;
								import java.time.format.DateTimeFormatter;
								import java.util.ArrayList;
								import java.util.Scanner;

								import utill.DateTimeUtill;
								import vo.Book;



								public class BookMain {
									
									public static void printBookList(ArrayList<Book> bookList) {
										/*for (int i = 0; i< bookList.size(); i++) {
											bookList.get(i).getPrice();
											System.out.println(bookList.get(i).toString());
									}*/   // 저 for문을 enhanced for문으로(예쁘게)
										//enhanced for문
										for ( Book book : bookList ) {
											String result = "";
											result += "책의 고유 번호 : " + book.getBookId();
											result += " 제목 : " + book.getBookName();
											result += " 작가 : " + book.getAuthor();
											result += " 가격 : " + book.getPrice();
											result += " 생성일 : " + book.getCreateDate();
											
											// String으로 문자열을 완성한거와 StringBuilder로 문자열을 완성한
											StringBuilder str = new StringBuilder();
											str.append(" 책의 고유 번호 : " + book.getBookId());
											str.append(" 제목 : " + book.getBookName());
											str.append( " 작가 : " + book.getAuthor());
											str.append(" 가격 : " + book.getPrice());
											str.append(" 생성일 : " + book.getCreateDate());
											System.out.println(str.toString());
										
											
											
											
											
											
											System.out.println(result);
										}
									}
									public static void main(String[] args) {

										
										
										// 1. 날짜 생성해서 createDate에 파라미터로 넣기
												//2. 메시지를 띄운다. (1 : book 추가생성 ㅣ\list에 밀어넣어, 2. book 항목 삭제
										
								DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


								String formatedDate = LocalDateTime.now().format(dFormatter);
										
										// 1번째 방법
										ArrayList<Book> list = new ArrayList<>();
										Book book = new Book();
										book.setBookName(" 태백산맥");
										book.setAuthor(" 조정래");
										book.setPrice(12000);
										book.setCreateDate(formatedDate);
										
										
										
										list.add(book);
										

										
										
										Book book2 = new Book("데미안", "헤르만 헤세", 13000, formatedDate);
										list.add(book2);
										list.add(new Book("책1", "11", 13000, formatedDate));
										list.add(new Book("책2", "11", 13000, formatedDate));
										list.add(new Book("책3", "11", 13000, formatedDate));
										list.add(new Book("책4", "11", 13000, formatedDate));
										
										
										
									   // list.add(new Book("23", "33", 33));
										//추가할건지 삭제할건지 메세지를 띄운다.
										// 1을 고르면 책을 추가하는 코드를 작성한다.
										// 2를 입력하면 책을 삭제한다. 삭제할때 책의 식별자는 bookId 값으로 판단한다.
										// 3을 입력하면 책의 id값을 입력 받아서 해당 객체만 정보를 출력.
										// 4를 입력하면 책의 id값을 입력받고, 입력받은 객체의 정보를 별도로 입력받아서 수정처리
										//삭제할때 bookId를 입력받을 수 있게 scanner를 띄운다.
										//값을 입력 받으면 list를 순화하면서 동일한 bookId가 있으면 해당 책을 지운다.
										
										for(int j=0;j<list.size();j++)
											System.out.println(list.get(j));
										
										do {
										System.out.print("할일을 골라라.");
										Scanner scanner = new Scanner(System.in);
										int workId = scanner.nextInt();
										
										// CRUD
										//C : create
										//R : read
										//U : update
										//D : delete
										
										if(workId == 1) {
											//추가
											Book newBook = new Book();
											list.add(newBook);
											System.out.println("책 제목: ");
											String bookName = scanner.next();
											newBook.setBookName(bookName);
											System.out.println("저자 입력: ");
											String bookAuthor = scanner.next();
											newBook.setAuthor(bookAuthor);
											System.out.println("가격 입력");
											int bookPrice = scanner.nextInt();
											newBook.setPrice(bookPrice);
											
											newBook.setCreateDate(formatedDate);
											
											BookMain.printBookList(list);
											
											
										}else if (workId == 2) {
											//삭제
											System.out.println("삭제할 ID를 입력하세요.");
											int bookId = scanner.nextInt();
											for (int i = 0; i < list.size(); i++) {
												if (bookId == list.get(i).getBookId()) {
													list.remove(i);
												}
											}
											BookMain.printBookList(list);
										} else if (workId == 3) {
											//1개 조회
											System.out.println("조회할 ID를 입력하세요.");
											int bookId = scanner.nextInt();
											for (int j = 0; j <list.size(); j++) {
												if (bookId == list.get(j).getBookId() ) {
													System.out.println("조회결과:"+list.get(j));
												}
											}
											 
										}else if (workId == 4) {
											// 1개 조회 후 수정
											//수정:내용만바뀌면됨
											//(1) 새 책을 만들어서 원래 책을 빼고 그자리에 넣기
											//(2) 원래책한테 set~해서 고치기
											//1.원래책찾기 (3번응용)
											//2.원래책.set머시기하기
											
											System.out.println("조회할 ID를 입력하세요.");
											int bookId = scanner.nextInt();
											for (int j = 0; j <list.size(); j++) {
												if (bookId == list.get(j).getBookId() ) {
													System.out.println("조회결과:"+list.get(j));
													System.out.println("고치려고 하는 책 제목: ");
													String bookName = scanner.next();
													list.get(j).setBookName(bookName);
													System.out.println("수정한 작가");
													bookName = scanner.next();
													list.get(j).setAuthor(bookName);
													System.out.println("수정한 가격");
													int bookPrice = scanner.nextInt();
													list.get(j).setPrice(bookPrice);
													
													
			// 4 결과 대충 이렇게 나옴
													
				/*		Book [bookId=1001, bookName= 태백산맥, author= 조정래, price=12000, createDate=2025-03-12 16:44:13]
						Book [bookId=1002, bookName=데미안, author=헤르만 헤세, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1003, bookName=책1, author=11, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1004, bookName=책2, author=11, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1005, bookName=책3, author=11, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1006, bookName=책4, author=11, price=13000, createDate=2025-03-12 16:44:13]
						할일을 골라라.4
						조회할 ID를 입력하세요.
						1004
						조회결과:Book [bookId=1004, bookName=책2, author=11, price=13000, createDate=2025-03-12 16:44:13]
						고치려고 하는 책 제목: 
						오오
						수정한 작가
						진영
						수정한 가격
						1234
						수정
						Book [bookId=1001, bookName= 태백산맥, author= 조정래, price=12000, createDate=2025-03-12 16:44:13]
						Book [bookId=1002, bookName=데미안, author=헤르만 헤세, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1003, bookName=책1, author=11, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1004, bookName=오오, author=진영, price=1234, createDate=2025-03-12 16:44:13]
						Book [bookId=1005, bookName=책3, author=11, price=13000, createDate=2025-03-12 16:44:13]
						Book [bookId=1006, bookName=책4, author=11, price=13000, createDate=2025-03-12 16:44:13]
						할일을 골라라.				 */							
					
					
												}
											}
											System.out.println("수정");
											
										}else {
											//1,2,3,4이외 다른 숫자는 프로그램종료
											System.out.println("프로그램 종료");
											break;
										}
										for(int j=0;j<list.size();j++)
											System.out.println(list.get(j));
										
										}while(true);
										
										
										
									
										
									}
									}
										

										
									
										
										
									
									
		//while, do while								
								
								public class Loop {

									public static void main(String[] args) {
										// for, while(false면 아예 실행 ㄴ), do while(false여도 한번은 무조건실행)
										
										//while문
									/*	int i = 0;
										while(i > 0) {
											System.out.println(Math.random());
											
										}
								*/
										
										//do while문(false여도 한번은 무조건실행)
										int i = 0;
										do {
											System.out.println(Math.random());
											
											
										}while(i>0);
										//한번실행됨
									}

								}						
								
								
								
								
	//9일차
								
								
		//abstract, interface
								
								
								abstract class Computer{
									abstract void display();
									abstract void type();
									public void turnOn() {
										System.out.println("전원을 켠다.");
									}
									public void turnOff() {
										System.out.println("전원을 끈다.");
									}
								}

								class DeskTop extends Computer {

									@Override
									void display() {
										System.out.println("computer display()");
										
									}

									@Override
									void type() {
										System.out.println("computer type()");
										
									}
									
									
								}
								class NoteBook extends Computer {

									@Override
									void display() {
										System.out.println("notebook display()");
										
									}

									@Override
									void type() {
										System.out.println("notebook type()");
										
										
									}

								}

								public class AbstractExample {

									public static void main(String[] args) {
										NoteBook noteBook = new NoteBook();
										noteBook.display();
										noteBook.type();
										noteBook.turnOn();
										noteBook.turnOff();
										//notebook display()
										notebook type()
										전원을 켠다.
										전원을 끈다.

									}

								}						
								
								
								
	//상속문제
								
								
								package abstractEx;


								class Calculator{
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
										
										
										//1. UpgradeCalculator클래스를 만들고
										// 값을 뺄 수 있는 minus 메서드를 추가하자.
										UpgradeCalculator ucal = new UpgradeCalculator();
										
										ucal.add(10);
										ucal.minus(3);
										System.out.println(ucal.getValue()); //7
										
										
										
										 //2. 객체변수 value가 100보다 큰 값을 가질 수 없도록 제한하는 동작
										MaxListCalculator mcal = new MaxListCalculator();
										mcal.add(50);
										mcal.add(60);
										System.out.println(mcal.getValue());//100출력
								}
								}


								
								package abstractEx;

								public class UpgradeCalculator extends Calculator {

									void minus(int val) {
										this.value -= val;
										
									}

								}

								
								
								//객체 비교	
								ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
								ArrayList<Integer> b = new ArrayList<Integer>(a);//b에다가 a의 내용을 가진 list를 새로만들어서 넣어라.
								// a와 b는 서로 다른 존재
								
								
								
								
								a.add(4);// a값은 (1,2,3,4) b값은 (1,2,3)
								
								
								System.out.println(b == a); //false
								
								
								
								
								ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
								ArrayList<Integer> b = a;// b에 a가 컴퓨터에 저장된 위치를 넣는다.(a와 b는 같은존재)
								
								
								
								
								a.add(4); //  a값은 (1,2,3,4) b값도 (1,2,3,4)
								
								
								System.out.println(b == a); //true
								
								
								
			//쓰는법printf("글자글자%s%d",얘를첫번째나온%에넣어주세요,2번째%,3,4,5,...)
						System.out.printf("%d번입니다 %s쓸수있습니다",1,"이렇게");	
					//1번입니다 이렇게쓸수있습니다	

 	}
 	}




10일차

String a = "aa";
//Object에서 공통으로 사용하는 메서드
String b = a.toString();// 객체를 문자열로 표현
boolean r = a.equals(""); // .앞에 있는 내용과 괄호 안의 내용 비교
a.hashCode();//해시코드 : 메모리주소값 출력
a.getClass();// 객체의 class를 반환



String a = "hello world";
// index 번째 문자 출력
System.out.println(a.charAt(0)); // charAt(0); : 인덱스 0번째  출력 h
System.out.println(a.concat("!!"));// concat(); 이어붙히기 hello world!!
System.out.println(a.contains("w"));// contains(); : 포함여부 true
System.out.println(a.length()); // 문자열 길이 11
System.out.println(a.substring(3));// 문자열의 인덱스번호 부터 끝까지의 문자열반환  lo world
System.out.println(a.substring(3,6)); // 문자열의 beginIndex부터 endIndex까지 문자열 반환 lo
System.out.println(a.indexOf("world"));// 문자열에서 주어진 문자열이 처음 나타나는 index반환 6
String str = "Hello world world";
System.out.println(str.lastIndexOf("world")); // 문자열에서 주어진 문자열이 마지막으로 나타나는 index 반환 12
String str1 = "hello";
String str2 = "Hello";
System.out.println(str1.equals(str2));//문자열이 동일한지 비교 true
String str3 = new String("hello");
String str4 = new String("Hello");
System.out.println(str3 == str4); // false 객체의 값을 비교하는게 아니고 객체 그 자체를 비교 
System.out.println(str3.equals(str4));// true  String은 equals로 비교!!
System.out.println(str1 == str2);// false 문자열을 대소문자 구분하지 않고 비교+
System.out.println(str1.equalsIgnoreCase(str2));// true문자열을 대소문자 구분하지 않고 비교+
System.out.println(a.replace("world", "java"));// 문자열에서 특정 문자열을 다른 문자열로 바꾼다. hello java
System.out.println(a.toUpperCase());// 문자열을 대문자로 변환 HELLO WORLD
String str6 = "HELLO WORLD";
System.out.println(str6.toLowerCase());// 문자열을 소문자로 변환 hello world
String str7 = " hello ";
System.out.println(str7.trim());// 문자열의 앞 뒤 공백 제거 hello
String str8 = "apple,banana,cherry";
String[] fruits = str8.split(",");
System.out.println(Arrays.toString(fruits)); // split 지정한 구분자를 기준으로 문자열을 배열로 반환 [apple, banana, cherry]
String str9 = "Hello";
System.out.println(str9.startsWith("He"));// 문자열이 지정된 접두어로 시작하는지 확인 true
System.out.println(str9.endsWith("lo")); // 문자열이 지정된 접미어로 끝나는지 확인  true
String str10 = "";
System.out.println(str10.isEmpty());// 문자열이 비어 있는지 확인(길이가 0인지 확인) true
String str11 = " ";
System.out.println(str11.isBlank());// 문자열이 비어있거나 공백만 있는지 확인 true
int num = 123;
String str12 = String.valueOf(num);
System.out.println(str12); //객체를 문자열로 변환 123
String str100 = "abc123";
boolean match = str100.matches("[a-z]+\\d+");
System.out.println(match);// 문자열이 주어진 정규식과 일치하는지 확인 true



//연습문제
		//문자열의 길이가 홀수일 경우, 한 문자를 출력하고, 짝수일 경우 중간 두 문자를 출력
		//입력 : Java 
		//출력 : av 2
		//입력 : Programming 11
		//출력 : a
			
			/*String exStr = "Java";
			int exStrLength = exStr.length();
			String exResult = (exStrLength % 2 - 1, exStrLength / 2 + 1);
				exStr.substring(exStrLength / 2, exStrLength / 2 + 1);
				System.out.println(exResult);*/
				
			
		   //아래 문자열에서 첫번째 단어를 추출해라. 단어는 공백으로 구분된다.
				String ex2 = "I Love Java";
				String firstWord = ex2.split(" ")[0];
				System.out.println(firstWord); // I I
				
				//010-1234-5678 주어진 문자를 - 를 제거하고 숫자만 출력
			
				String ex3 = "010-1234-5678";  
				System.out.println(ex3.replace("-", " ")); //010 1234 5678
				
				
			//https://www.naver.com/path 문자열에서 naver.com만 출력
				
				String naver = " https://www.naver.com/path";
				String domain = naver.substring(naver.indexOf("www.")+ 4, naver.indexOf(".com")+4);
				
				System.out.println(domain); //naver.com
				
			// 20250314 => 2025-03-14	
				String date = "20250314";
				
				System.out.println(date.substring(0,4)+ "-"+date.substring(4, 6)+ "-"+ date.substring(6,8));
		
				

				
		//연습문제 클래스, 배열, 메소드생성 총정리할 수 있을듯
				//꼭다시한번 볼것		
				
				
				
				
			문제	/* Buyer 클래스 : money, 
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
<<<<<<< HEAD
						
						
						
						
						
						
	//11일차
						
		//초보자가 많이하는실수
			//wrapper , primitive type 차이구별
					//primitive type
						//int, double, float, boolean, char 등등
						//값 자체를 메모리(stack)에 직접 저장
						
					
						int a= 10;
						int b = a;
						b = 20;
						System.out.println(a);//10
						
			    //wrapper class, reference type
						//String, Integer, Boolean, Double, Float, ArrayList 등등
						//boolean true, false
						// Boolean true, false, null
						//wrapper클래스는 메모리(Heap)에 저장되고, 메모리(Stack)는 참조(주소)만 저장된다.
						//Integer는 참조타입인데 불변 객체라서 y = 200을 대입하면
						//새로운 객체를 생성하고 y에 값을 할당
						//따라서 x값은 그대로 남았다.
						
						//int z = null; // wrapper 클래스 써야 null;쓸수있다.
						Integer z = null;
						String zz = null;
						
						Integer x = 100;
						Integer y = x;
						y = 200;
						System.out.println(x);//100
						
						
				//배열 또는 ArrayList
						int[]arr1 = {1, 2, 3};
						int[]arr2 = arr1;
						arr2[0] = 100;
						System.out.println(arr1[0]); //100
						// 100나오는 이유: 배열은 참조타입 그래서 arr1과 arr2가 같은 배열을 가르킴
						// arr2의 값을 바꾸면 arr1의 값도 바뀐다.
						int[] arr3 = arr1.clone();		//복사
						arr3[0] = 100;
						System.out.println(arr1[0]);
						
							
			 // ==와 .equals()
						// 기본타입은 ==로 비교
						int a = 0;
						int b = 0;
						System.out.println(a == b);
						
						Integer c = new Integer(100);
						Integer d = new Integer(100);
						System.out.println(c == d); // false 메모리주소비교
						System.out.println(c.equals(d)); // true	
						
						
						

				// 자동 형변환과 강제 형변환
					// 자동 형변환
						// 자료형이 작은타입에서 큰타입으로 바꿀때는 자동 형변환
						// 큰 타입에서 작은 타입으로 바꿀때는 캐스팅 필요
						int num = 10;
						double d = num;
						System.out.println(d); //10.0
						
						double d2 = 10.55;
						int num2 = (int)d2;
						System.out.println(num2); // 10
						
						// int / int =>> (double) 앞에붙혀줘야함
						int a = 5;
						int b = 2;
						System.out.println((double)a/b);//2.5
						
						// int 범위를 벗어나는 변수값
						// 214783648
						//int max = 12345678900;
						// 범위를 벗어나면 long을 사용하자
						long max2 = 12345678900L;
						
						
			// 객체 초기값 누락 null point exception  (NPE)
//						String str;
//						System.out.println(str.length());
						
				//대입연산자와 비교연산자 혼동
						boolean result = true;
						if(result == true) 
							System.out.println(true);// =, == 헷갈 ㄴ
								
						// ArrayList와 for each
						ArrayList<String> list = new ArrayList<String>(Arrays.asList("1","2","3"));
						for ( String s : list ) {
							if (s.equals("2")) s= "100"; //[1, 2, 3]  ArrayList에선 이렇게함안됨 밑에 루프문으로
							}
							for (int i = 0; i < list.size(); i++) {
								if(list.get(i).equals("2")) {
									list.set(i, "100");
								}
							}
							System.out.println(list); // [1, 100, 3]		
						
						
						
						
							class Person{
								String name;
								
								Person(){
									this(); // 생성자가 없을때 this 쓰면 호출할게없으니 오류뜸
								}
							}			
						
						
						
						
						
						
							public class exam{
								// static 변수  메모리 엑세스 속도 빠르다
								static int staticVar = 0;
								//final 상수 재정의못함(걍한번에구분하려고변수언더스코어로 씀)
								static final int STATIC_FINAL_VAR = 0;
								
								
								
								public static void main(String[] args) {
									
									// static 변수 접근 시간 측정
									long startTime = System.nanoTime();
									for (int i = 0; i < 1000000000; i++) {
										staticVar = staticVar  + 1; // static 변수에 접근
										
										
										
									}
									long endTime = System.nanoTime();
									long staticTime = endTime = startTime;
									
									//static final 변수 접근 시간 측정
								    startTime = System.nanoTime();
								    for (int i = 0; i < 1000000000; i++) {
										int temp = STATIC_FINAL_VAR; 
								    }
									
								    endTime = System.nanoTime();
								    long staticFinalTime = endTime = startTime;
								    
								    System.out.println("Static 속도 :"+ staticTime + "ns"  );
								    System.out.println("Static final 속도 :"+ staticFinalTime + "ns"  );
									//static final이 더빠르다
												
						
						
						
						
						
	// 제네릭
								    
								    
		   package main;

		 import java.util.ArrayList;
         import vo.Plastic;
	     import vo.Powder;
import vo.StudentVO;
import vo.ThreeDPrinter;

								    public class Main {

								    	public static void main(String[] args) {
								    		
//								    		ThreeDPrinter p1 = new ThreeDPrinter();
//								    		Powder p = new Powder();
//								    		p1.setMaterial(p);
//								    		
//								    		powder pp = p1.getMaterial();
//								    		
								    		ThreeDPrinter<Powder> p1 = new ThreeDPrinter();
								    		Powder p = new Powder();
								    		p1.setMaterial(p);
								    		Powder pp = p1.getMaterial();
								    		
								    		ThreeDPrinter<Plastic> p2 = new ThreeDPrinter();
								    		Plastic ps = new Plastic();
								    		p2.setMaterial(ps);
								    		Plastic pss = p2.getMaterial();//다운캐스팅할필요없이 바로 형변환
								    		
								    		
								    		
								    		
								    		
								    }

								    }
								    
								    package vo;

								    public class ThreeDPrinter<T extends Material> {
								    	
								    	private T material;

								    	public T getMaterial() {
								    		return material;
								    	}

								    	public void setMaterial(T material) {
								    		this.material = material;
								    	}
								    	

								    }
				    
								    package vo;

								    public class Powder extends Material {
								    	public void doPrint() {
								    		System.out.println("Powder 재료로 출력");
								    	}

								    	@Override
								    	public String toString() {
								    		return "재료는 Powder입니다";
								    	}
								    	
								    }
								    
								    package vo;

								    public class Plastic extends Material {
								    	public void doPrint() {
								    		System.out.println("Plastic 재료로 출력");
								    	}

								    	@Override
								    	public String toString() {
								    		return "재료는 Plastic입니다";
								    	}
								    }
				    
								    
								    
								    package vo;

								    public abstract class Material {

								    }
		    
								    
		//12일차
								    
								    class Person {
								    	String name;
								    	String birth;
								    	int age;
								    	public int getAge() {
								    		return age;
								    	}
								    	public void setAge(int age) {
								    		this.age = age;
								    	}
								    	public String getName() {
								    		return name;
								    	}
								    	public void setName(String name) {
								    		this.name = name;
								    	}
								    	public String getBirth() {
								    		return birth;
								    	}
								    	public void setBirth(String birth) {
								    		this.birth = birth;
								    	}
								    	
								    	// getter, setter, constructor
								    }

								    public class Mainn {

								    	public static void main(String[] args) {
								    		// 컬렉션 프레임 워크
								    		// 자바에서 데이터를 저장하고 관리하는 방법을 제공하는 클래스, 인터페이스의 집합
								    		// 여러개의 데이터를 효율적으로 다루기 위한 도구
								    		//핵심
								    		// 데이터구조 : 데이터를 어떻게 저장하고 접근할건가의 구조 정의
								    		// 효율적관리 : 데이터를 쉽게 추가, 삭제, 변경, 순회하는 작업을 효율적으로 할 수 있게 해준다.
								    		
								    		// 컬렉션 프레임워크 : 컬렉션, 맴 두가지로 나뉜다.
								    		// 1. 컬렉션 : 여러 개의 데이터를 하나의 객체로 다루는 방법을 제공
								    		// 2. 맵 : 키와 값 쌍으로 이루어진 데이터 구조이고 중복되지 않는 키를 사용해서 값을 찾을 수 있다.
								    		
								    		String [] nums = new String[] {"333", "123", "256"};
								    		List<String> numsList = new ArrayList<String>(Arrays.asList("333", "123", "256"));
								    		numsList.sort(Comparator.naturalOrder()); // naturalOrder 오름차순해주는 자동메서드 [123, 256, 333]
								    		System.out.println(numsList);
								    		numsList.sort(Comparator.reverseOrder());
								    		System.out.println(numsList);//reverseOrder 내림차순해주는 자동메서드 [333, 256, 123]
								    		
								    		// add 컬렉션에 데이터를 추가한다.
								    		numsList.add("444");
								    		System.out.println(numsList); //[333, 256, 123, 444]
								    		numsList.remove("444"); // remove
								    		numsList.remove(0); 
								    		System.out.println(numsList);  // [256, 123]
								    		
								    		// size()
								    		System.out.println(numsList.size()); //4
								    		
								    		//clear()
								    		numsList.clear();
								    	    System.out.println(numsList); //[]
								    	    
								    	    //Iterator
								    	    
								    	    //맵 : 사전과 비슷하다.
								    	    // people : 사람, baseball : 야구
								    	    // name : 최종선, birth : 20000101
								    	    //   key        :   value
								    	    // key와 value가 쌍으로 이루어 진걸 맵이라고 한다.
								    	    // Map : HashMap, LinkedHashMap, TreeMap 등등
								    	    // VO
								    	    Person person = new Person();
								    	    person.setName("최종선");
								    	    person.setBirth("20000101");
								    	    person.setAge(10);
								    	    String name = person.getName();
								    	    String birth = person.getBirth();
								    	    int age = person.getAge();
								    	    List<Person> personList = new ArrayList<>();
								    	    personList.add(person);
								    	    
								    //HashMap사용법	   
								    	    HashMap<String, Object> hashMap = new HashMap<>();
								    	    hashMap.put("name", "최종선");
								    	    hashMap.put("birth", "20000101");
								    	    hashMap.put("age", 10); //저위에 Object로 해놔서 숫자 넣을수있음
								    	    String name2 = (String) hashMap.get("name");
								    	    String birth2 = (String) hashMap.get("birth");
								    	    int age2 = (int) hashMap.get("age");
								    	    // containsKey : 맵에 해당 key가 있는지 true, false로 리턴
								    		   System.out.println(hashMap.containsKey("birth")); // true
								    		  // remove : 맵의 항목을 삭제한다. 해당 key로 항목을 삭제 후 value를 리턴
								    		   System.out.println(hashMap.remove("name"));//최종선
//								    		   System.out.println(hashMap.toString()); //{birth=20000101, age=10} 이름지워짐 ㅇㅇ
								    		
								    		   System.out.println(hashMap.size());
								    		    System.out.println(hashMap.keySet()); 
								    		    List<String> KeyList = new ArrayList<>(hashMap.keySet());
								    		    

								    		   
								    	   List<HashMap<String, Object>> hashMapList = new ArrayList<>();	
								    	   hashMapList.add(hashMap);
								    	
					//중요			    	   //Map >>> HashMap, LinkdeHashMap, TreeMap
								    	   // LinkdeHashMap : 입력된 순서대로 데이터를 저장
								    	   // TreeMap : 입력된 Key의 오름차순으로 데이터를 저장
								    	   
								    	   
								    	
								    	 //집합 : 중복 허용 불가, 순서가 없다
								   		//HashMap, LinkedHashMap,  TreeMap
								   		// 집합자료형 : 집합과 관련된 것을 쉽게 처리하기 위해 만들었다.
								   		// HashSet, LinkedHashSet, TreeSet
								   		
								   		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//								   		System.out.println(set);
								   		
								   		
								   		
								   		
								   		// 교집합구하기 : retainAll
								   		// HashSet 하나 더 생성 >>> new 연산자의 파라미터를 s1넣는다.
								   		// retainAll 메서드의 파라미터를 s2 넣는다
								   		//로그에찍는다
								   		
								   		
								   		
								   		
								   		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
								   		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
								   		
								   		 HashSet<Integer> 교집합세트 = new HashSet<>(s1);
								    	    교집합세트.retainAll(s2);
								   		System.out.println(교집합세트); //[4, 5, 6]
								   		
								   		//합집합구하기 : addAll
								   		
								   		 HashSet<Integer> 합집합세트 = new HashSet<>(s1);
								   		 합집합세트.addAll(s2);
								   		 System.out.println(합집합세트); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
								   		 
								   		//차집합구하기 : removeAll
								   		 HashSet<Integer> 차집합세트 = new HashSet<>(s1);
								   		 차집합세트.removeAll(s2);
								   		 System.out.println(차집합세트); // [1, 2, 3]
								   	
								   		 // add, addAll, remove
								   		 차집합세트.add(100);
								   		 차집합세트.addAll(Arrays.asList(55,66,77));
								   		 차집합세트.remove(55);
								   		 
								   		 
								   		// HashMap, List
								   		 // LinkdeHashMap : 입력된 순서데로 데이터 저장
								   		 // TreeMap : 입력한 key의 오름차순 데이터 저장			    	
								    	
								    	
								    	
								    	
								    	}

								    }
				   
								    
								    
								    
								    
								    
								    
								    package main;

								    import java.util.HashSet;

								    class Student {
								    	String name;
								    	String id;
								    	public Student(String id, String name) {
								    		this.id = id;
								    		this.name = name;
								    	}
								    	
								    	나랑 쟤랑 같은지 검사해줘
								    	나(학생) 쟤(??)
								    	나(학생) 쟤(학생) 이면 둘이 같은건지 검사
								    	나(학생) 쟤(학생은아닐때) 그럼 무조건 다른거니까 하지마
								    	나(학생) 쟤(학생)
								    	쟤(사람)
								    	나(학생) 쟤( (학생)사람 )
								    	
								    	public boolean equals(Object obj) {
								    		if (obj instanceof Student) {
								    			Student s = (Student) obj;
								    			return (this.id == s.id) ? true : false;
								    		}
								    		return false;
								    	}
								    	@Override
								    	public String toString() {
								    		return "Student [name=" + name + ", id=" + id + "]";
								    	}
								    	
								    }

								    public class StudentTest {

								    	public static void main(String[] args) {
								    		
								    		HashSet<Student> set = new HashSet<Student>();
								    		set.add(new Student("100", "홍길동"));
								    		set.add(new Student("200", "강감찬"));
								    		set.add(new Student("300", "이순신"));
								    		set.add(new Student("400", "정약용"));
								    		set.add(new Student("500", "송중기"));
								    		
								    		System.out.println(set); // [Student [name=홍길동, id=100], Student [name=정약용, id=400], Student [name=강감찬, id=200],
								    		                         //Student [name=송중기, id=500], Student [name=이순신, id=300]]
								    	}

								    }						    
								    
								    
								    
								 // 싱글톤 패턴 무조건1개만있다
									

								    public class Company {
								    	
								    	private static Company instance = new Company(); //코드가 처음 실행될때, 회사를 1개 만든다
								    	private Company() {}
								    	public static Company getInstance() {
								    		if (instance == null) { //만들어진 회사가 없으면
								    			instance = new Company(); //새로운회사
								    		}
								    		return instance;//아까 처음 만든회사
								    	}
								    	public static void main(String[] args) {
								    		
								    		Company com1 = Company.getInstance(); //만들어진 회사가 없으면 새로운회사
								    		Company com2 = Company.getInstance(); //만들어진 회사가 없으면 새로운회사
								    		System.out.println(com1 == com2); // true
								    	}

								    }						    
								    
								    
								    
								    
	
								    
								    
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
		//싱글톤패턴, HashMap 이용						    	
								    	private static Company instance = new Company();
								    	private Company() {}
								    	public static Company getInstance() {
								    		if (instance == null) {
								    			instance = new Company();// instance생성 안되어있으면 새로운 Company객체생성
								    		}
								    		return instance;//instance가 이미 생성된 상태라면, new Company()는 실행되지 않고, 
								    		                 //기존의 Company 객체가 그대로 반환됩니다.
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
								    	
								    	
								    	
								    	
								    
								    
								    
								    
								    
								    
=======
>>>>>>> origin/main
					}
					
					
				}
					
					
13일차 Iterator
//지환님 총정리

class Student{
	String name;
	int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}

/*
 * 클래스 파일이름  (여기서는 Ex.java니까 class이름도 Ex이어야함 무조건){
 * 	그 안에있는
 * 	public static void main(String args[]){
 * 				계산기 a=new 계산기(); //이렇게 main(책상)을 깔끔하게 쓸수있음 + 내가만든계산기 코드를 나중에 또 쓸수있음
 * 				a.더하기 
 * 
 * 
 * }
 * 컴퓨터는 java를 실행하면 이 main 안에 있는 내용만 실행함
 * main 이 책상임.
 * 공부할때 필요한거 다 책상에 올려놓으면 더러워지니까
 * 막 옆에있는 서랍에도 넣고 가방에도 넣어야함 
 * 그게 밖에있는 class
 * 
 * class 계산기{
 * 	int 값
 * 	기능 더하기(){
 * 
 * 	}
 * 
 * }
 * 이렇게 서랍에 정리해놓으면  <<44L
 * 
 * 애초에 왜 이렇게 하는지 알려면 프로그래밍언어가 2가지가 있는데
 * 
 * 1코드
 * 2
 * 3
 * 4
 *  코드를 위에서부터 1234로밖에 못읽는 절차지향 언어가 있고
 *  
 *  1
 *  3
 *  2
 *  4
 *  51
 *  2
 *  3
 *  순서 상관없이 아무데서나 읽으면서 객체를 만들어 쓰는 객체지향 언어가 있음
 *  
 *  절차지향은 배우기 쉽고 프로그래밍 기초를 알기 좋음  (1990년대 2000년대 나온애들)
 *  근데 객체지향은 코딩기초+객체가뭔지까지 알아야해서 처음에 배우기 어려움 <<왠만한 애들이 다 이거씀(최신
 * 
 * 메인{
 * 
 * }
 * 
 * 클래스 {
 *   기능{}
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */









class EasyTest{
	public void Easy() {
		
		//막 계산함
		//막 연결함
		//막 뭐함
		System.out.println("계산완료");
		
	}
	
}
public class Ex {

	public static void removeLowScore(List<Student> students) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			
			if (s.getScore() <= 50) iterator.remove();
				
			
		}
		
	
	}
	public static void main(String args[]) {
		ArrayList<StudentVO> list = new ArrayList<>();
		list.add(new StudentVO("이지은", 2, 1, 70, 90, 70));
		list.add(new StudentVO("적재", 2, 2, 60, 100, 80));
		list.add(new StudentVO("최유리", 1, 3, 100, 100, 100));
		list.add(new StudentVO("존박", 1, 1, 90, 70, 80));
		list.add(new StudentVO("황소윤", 1, 2, 80, 80, 90));
		//(String name, int ban, int no, int kor, int eng, int math)
		
		// 정렬 수행
		Calc.calcRank(list);
		
		Iterator<StudentVO> iterator = list.iterator();
		
//		while(iterator.hasNext()) {
//			//System.out.println("[Main출력]"+iterator.next());
//		}
		
		/**
		 * 아래는 콘솔 출력 결과
		 * 최유리, 1, 3, 100,100, 100, 300, 100.0, 1
		 * 황소윤, 1, 2, 80,80, 90, 250, 83.3, 2
		 * 적재, 2, 2, 60,100, 80, 240, 80.0, 3
		 * 존박, 1, 1, 90,70, 80, 240, 80.0, 3
		 * 이지은, 2, 1, 70,90, 70, 230, 76.7, 5
		 */
		
		// Iterator >>> for for each enhanced for while do while
		// 반복문이다
		// 컬렉션 객체에서 요소를 순차적으로 접근하고 제거하는 방법을 제공하는 인터페이스다.
		// List, Set, Map => 컬렉션 클래스
		// Iterator를 쓰면 컬렉션 내부 구조에 의존하지 않고도 요소를 순차적으로 탐색 가능
		
		//메서드
		// hasNext() : 다음 요소가 있는지 확인 > true false
		// next() : 컬렉션에서 다음 요소를 반환하고, 그 다음 요소로 이동한다.
		//            NoSuchElementException
		// remove() : 요소 삭제 ( next()로 반환한 요소를 컬렉션에서 제거)
		
		// 리스트 생성
		List<String> strList = new ArrayList<>(Arrays.asList("Apple","Banana"));
		
		// Iterator 객체 생성
		Iterator<String> iterator2 = strList.iterator();
		
		//Iterator 를 사용해서 요소 출력
//		while(iterator2.hasNext()) {
//			System.out.println(iterator2.next());
//		}
				
		// 특징
		/* 컬렉션변경 : Iterator 컬렉션을 순회하는 동안 안전하게 요소를 제거할 수 있다.
		   next() => remove()로 제거
		   for loop. Iterator 차이 : 순회 방식과 컬렉션을 변경할 때 안전성
		   
		
		*/
		
	 //for(int i = 0; i < strList.size(); i++) {
	//	 System.out.println(strList.get(i));
	// }
		
	/*	for (String item : strList) {
			System.out.println(item);
			if(item.equals("Apple")) {
				strList.remove(item);
			}
		}
		 
		while(iterator2.hasNext()) {
			String item = iterator2.next();
			
			if (item.equals("Apple")) {
				iterator2.remove();
			}
		}
		System.out.println(strList);*/
		
		// for index기반, iterator index값 생성안해서 성능 더좋음
		// for >>>> index를 사용해서 요소에 접근할 때 유용, 컬렉션 변경이 없을 때 유용
		// iterator >>> 컬렉션을 순회하면서 안전하게 제거 또는 변경할 때 유용
		
		
		//지금 구조
		//클래스 메인 {  }
		//클래스 Ex {  }

		List<Student> students = new ArrayList<>();  //목록<들어갈내용:학생> 목록이름 = 만들어라 목록<>;
		students.add(new Student("홍길동", 85));  //학생목록.추가해라( 학생(이름은홍길동점수는85)  )
		//위 내용은 압축된 형태
		//원래 학생 a = 새 학생
		//학생목록.추가( 학생 a ) 하는데 이 두줄을 압축한게
		//학생목록.추가(새 학생(생성자 요청사항)  )
		
		
		students.add(new Student("홍길순", 40));
		students.add(new Student("이순신", 60));
		students.add(new Student("강감찬", 30));
		students.add(new Student("전현무", 45));
		
		removeLowScore(students);// 불러주기  (클래스 Ex 에서 만든 메소드)
		
		for (Student item : students) {   //반복하세요(학생목록안에 있는 학생만큼 ==>  학생 (임시이름): 학생목록
											//이러면 1번째 반복에서는 (임시이름).getName하면 홍길동이나오고 2번째는 이순신...
											//이렇게 쓰기 위해서 (임시이름) 이 필요함 여기서는 item이라고 씀
			
			
			System.out.println(item); //Student [name=홍길동, score=85]
			                           //Student [name=이순신, score=60]

		}
		
		
		
		//점수가 50 이하인 학생들을 삭제하는 메서드를 만들어서 호출
		//removeLowScore
//		List<Student> lst = new ArrayList<>(Arrays.
//		for (Student item : students) {
//			if( students <= 50)
//			System.out.println(item);
//		}
	}
	
	*/iterator : 반복쉽게해주는거

	Iterator<Student> iterator = students.iterator
	//반복기 <내용의종류> 변수이름 = 목록이름.iterator
	//<  > 안에는 목록 안에서 내가 빼오고 싶은 종류의 데이터
	<숫자만>  <글자만> <학생만>  <사람만>

	//이터레이터 목록 을 하면
	//목록내용이 알아서 이터레이터 안으로 들어감.

	//이터레이터.다음내용  (iterator.next)하면 알아서 다음내용으로감

	//목록(1,2,3,4)면
	//for문 쓸때는 막i=0;i<4;i++해야되는데
	//그냥 이터레이터.목록  하고 이터레이터.다음 을 4번하면
	 1234 나옴



	while(iterator.hasNext()){  //반복기에 아직 반복할 내용이 남아있습니까
		iterator.next():        //그럼 다음내용으로
	}

	for쓰는건 원하는 횟수만큼 무언가 해야 할때
	iterator 쓰는건 목록같은 거 내용을 꺼낼때 */

}



public class Main {
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Comparator<String> comparator = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o1.length() - o2.length();
				
			}
		};
		//람다식 변형하면
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();
		
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
		list.stream().forEach(s-> System.out.println(s)); //  순차스트림 stream 
		list.parallelStream().forEach(s-> System.out.println(s)); // 병렬스트림 parallelStream
		
		list.stream().filter(s -> {
			System.out.println(s);
			return s.startsWith("o");
			
		}).map(String::toUpperCase).limit(4).forEach(System.out::println);
		
		//람다식은 (요청사항)->요청사항가지고할내용;
		//람다식 테스트하려면 막 내가 내 클래스 만들고 기능만들고 해야하는데
		//그냥 딱 마침 저 람다식을 쓰면 작동하는 java 기본 클래스가 있어서 그냥 테스트용으로쓴거
		//
		
		
		
   /*순차스트림apple
			banana
			orange 
	병렬스트림	banana
			orange
			apple
	람다식 apple
		banana
		orange
		ORANGE*/ // 실행결과

		//연습문제	
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Sara", "Jin");
			//1. 이름이 J로 시작 하는것만 선택
			//2.정렬
			//3.대문자로변환
			//4. 리스트로 수집
			List<String> result = names.stream() 
				.filter(x -> x.startsWith("j"))
				.sorted()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
			
			// 리스트에서 짝수만 필터링해서 출력 
			List<Integer> nums =Arrays.asList(1,2,3,4,5,6,7,8,9,10);  
			
			
			
			List<Integer> nr = nums.stream()
					.filter(n -> n % 2 == 0)
					.collect(Collectors.toList());
			
			System.out.println(nr); //[2, 4, 6, 8, 10]
			
			// 람다스트림 핵심요약 3가지
			// 1.Predicate : 조건검사
			Predicate<Integer> isEven = n -> n % 2 == 0;
			System.out.println(isEven.test(4)); // true
			System.out.println(isEven.test(5)); // false
			//2. Function : 변환 함수
			Function<String, Integer> str = s -> s.length();
			System.out.println(str.apply("hello")); // 5
			// 3. Consumer : 값을 소비
			Consumer<String> consumer = s -> System.out.println(s);
			consumer.accept("hello world"); // hello world


			public class Main {
				
				public static void main(String[] args) {
					//연습문제	
					List<String> names = Arrays.asList("John", "Jane", "Jack", "Sara", "Jin");
						//1. 이름이 J로 시작 하는것만 선택
						//2.정렬
						//3.대문자로변환
						//4. 리스트로 수집
						
					
					// 익명클래스
					Predicate<String> startsWithJ = new Predicate<String>() {
						@Override
						public boolean test(String t) {
							return t.startsWith("J");
						}
					};
					Comparator<String> naturalOlder = new Comparator<String>() {
						
						@Override
						public int compare(String o1, String o2) {
							
							return o1.compareTo(o2);
						}
					};
					Function<String, String> toUpperCase = new Function<String, String>() {
						
						@Override
						public String apply(String t) {
							
							return t.toUpperCase();
						}
					};
					List<String> result = names.stream()
							.filter(startsWithJ)
							.sorted(naturalOlder)
							.map(toUpperCase)
							.collect(Collectors.toList());
					
					System.out.println(result); //[JACK, JANE, JIN, JOHN]



					// 예외 : 프로그램 실행중에 발생할 수 있는 예상하지 못한 오류 또는 문제
					// ex : 0으로 나누기를 시도, 배열의 index범위를 초과하는걸 조회한다.
					// 예외가 발생하면 프로그램이 중단된다. 따라서, 이를 처리하는 법을 배운다.
					
					int a = 5;
					int b = 4;
					
					try {
						//예외가 발생 할 수 있는 코드
						System.out.println(a/b);
					
						// 예외 처리 코드
						
					} catch (ArithmeticException  | NullPointerException e) {
						System.out.println("0으로 나눌 수 없습니다.");
					} finally {
						System.out.println("예외가 발생하던 말던 무조건 항상 실행되는 코드");
					} //1 예외가 발생하던 말던 무조건 항상 실행되는 코드
					
					String str = null;
					// str = ""; // 빈문자를 str에 대입
					// str = null; // 선언만하고 초기값을 안넣어 아무것도 없는것
					try {
						System.out.println(str.length());
					} catch (NullPointerException e) {
						System.out.println("str은 null이다."); //str은 null이다.
					}
					
					
					int[] arr = new int[5];
					
					try {
						for (int i = 0; i <= 5; i++) {
						arr[i]= i;
						System.out.println(arr[i]);
						}
						
					
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("배열 번호 틀렸다."); //배열 번호 틀렸다.
					}
					
					

//14일차 
					
		//Optional : NullPointException 방지
			// null 체크 : java 8이전에는 없다.
			/ NullPointException NPE			
			
			public class test {


						
						public static Optional <String> getUserById(int id) {
							return Optional.ofNullable(null);
							
							
						}
						
						
						public static void main(String[] args) throws IllegalAccessException {
							
							//Optional : NullPointException 방지
							// null 체크 : java 8이전에는 없다.
							// NullPointException NPE
							Optional<String> user = getUserById(1111);
							System.out.println(
									      //클래스명 :: 메소드명
									user.map(String::toUpperCase).orElse("이름이 없습니다.")
									
									
									);
							
							//null이 아닌 값을 가지는 Optional 객체 생성
							Optional<String> optional = Optional.of("hello");
							// null일 수도 있는 Optional 객체 생성
							Optional<String> optional2 = Optional.ofNullable(null);
							//값이 비어 있는 Optional 객체 생성
							Optional<String> optional3 = Optional.empty();
							// Optional 객체가 값을 포함하고 있는지 확인하는 메서드
							if (optional.isPresent()) {
								System.out.println(optional.get());// 그냥 optional하면 optional hello출력됨 //hello
								
							}
							// Optional 객체가 값을 포함하고 있을 때 특정한 작업 수행
							optional.ifPresent(v -> System.out.println(v));//hello
							// orElse >> Optinal 객체가 값을 포함하고 있으면 그 값을 반환하고
							// 그렇지 않으면 기본 값을 반환한다.
							String v = optional.orElse("기본값");
							System.out.println(v); // optional1 : hello, 2: 기본값 ,3: 기본값
							//orElseGet : Optional 객체가 값을 포함하고 있으면 그 값을 반환하고
							// 그렇지 않으면 람다 표현식이나 메서드 참조를 통해 기본값을 반환한다.
							v = optional2.orElseGet(() -> "기본값 2");
							System.out.println(v);
							// orElseThrow : Optinal 객체가 값을 포함하고 있으면 그 값을 반환하고 
							// 그렇지 않으면 예외를 던진다.
							v = optional2.orElseThrow(() -> new IllegalAccessException("오류"));
							
							
							
							
							
							String optional = "Hello";
							//값이 존재하면 출력
							if (optional != null) {
								System.out.println(optional);
								
							}
							
							//뭔가 연산 후
							if (optional != null) {
								optional = optional.toUpperCase();
							}
							
							// 뭔가 연산 후
							if (optional != null) {
								System.out.println(optional);
							}
							
							//Optional 사용
							Optional<String> optional2 = Optional.of("Hello");
							optional2.ifPresent(System.out::println);
							optional2.ifPresent(String::toUpperCase);
							
							String msg = optional2.orElseThrow(() -> new IllegalAccessException("값이 없다."));
							System.out.println(msg);
							
							
			
							
							
							
		// 예제
					// 배열 길이값 안에 index 있는건지 체크
					// 있을 때 또는 없을 때 리턴 어떻게 할건가					
							public class test {
								

								public static Optional<String> getValueAtIndex(List<String> list, int index){
									
									
									if (index >= 0 && index < list.size()) {
										return Optional.ofNullable(list.get(index));
									}
									// 값이 없을 때 리턴
									 return Optional.empty();
									 }
								
								
								public static void main(String[] args) throws IllegalAccessException {
									
									//Optional : NullPointException 방지
									// null 체크 : java 8이전에는 없다.
									// NullPointException NPE
								
									List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
									
									Optional<String> optionalValue = getValueAtIndex(list, 1);
									
									String defaultValue = getValueAtIndex(list, 10).orElse("기본값");
									
												
							
									
									
									
									
		// 입출력
			// system.in : 1바이트만 읽고 ascii code형식의 값을 반환
		  // InputStream : 바이트 단위의 데이터를 읽어 들일때 사용하는 내장 클래스					
									public class test {
										
										public static void main(String[] args) throws IOException {
											
										
											// 입출력
										// system.in : 1바이트만 읽고 ascii code형식의 값을 반환
											// InputStream : 바이트 단위의 데이터를 읽어 들일때 사용하는 내장 클래스
											InputStream in = System.in;
//											int a = in.read();
//											System.out.println(a);
											
											/*		// 사용자가 3바이트를 입력했을 때 3 바이트 모두 읽고 싶다.
											int a;
											int b;
											int c;
											a = in.read();
											b = in.read();
											c = in.read();
										System.out.println(a);
										System.out.println(b);
										System.out.println(c); // abc입력하면 97 97 99 출력
										
										byte[] byteArr = new byte[3];
										in.read(byteArr);
										
										System.out.println(byteArr[0]);
										System.out.println(byteArr[1]);
										System.out.println(byteArr[2]); // abc입력하면 97 97 99 출력*/
										
										//InputStreamReader
										InputStreamReader reader = new InputStreamReader(in);
//										char[] charArr = new char[3];
//										reader.read(charArr);
									//	
//										System.out.println(charArr);//abc입력하면 abc 출력
										
										
										BufferedReader br = new BufferedReader(reader);
										String brString = br.readLine();
										System.out.println(brString); // 문자열 막길게 써도 다 출력됨
										
								
										
										
										
										
										
										
										
										
										
										
										
										
										// 파일 입출력
										// 파일 쓰기
										// input stream >> 읽기
										// output stream >> 쓰기
										// FileOutputStream : 지정한 경로에 파일을 생성한다.	
											FileOutputStream output = new FileOutputStream("C:/java/out.txt");
											
											for (int i = 1; i < 11; i++) {
												// \r\n 줄바꿈 문자
												// 유닉스 계열에서는 \n만 있어도 된다.
												// 윈도우는 \r\n으로 작성해야 개행된다.
												String data = i + "번째 줄입니다.\r\n";
												//OutputStream : InputStream 처럼 바이트 단위로 데이터를 처리하는 클래스다.
												//FileOutputStream : OutputStream 클래스를 상속 받는다.
												// 따라서 데이터를 바이트 단위로 처리한다.
												output.write(data.getBytes());
											}
											
											//사용한 파일 객체를 닫아주는 메서드
											output.close(); // java폴더안에 out파일생김
											
											// FileWriter
											// 파일을 쓸때 바이트 배열 대신 문자열을 사용 할 수 있다.
											FileWriter fw = new FileWriter("C:/java/out2.txt");
											for (int i = 1; i < 11; i++) {
												String data = i + "번째 줄입니다.\r\n";
												fw.write(data);
											}
											fw.close();
											
											// PrintWritter
											// 개행문자를 안써도 된다.
											PrintWriter pw = new PrintWriter("C:/java/out3.txt");
											for (int i = 1; i < 11; i++) {
												String data = i + "번째 줄입니다.";
												pw.println(data);
											}
											pw.close();
											
											// 추가작성 - FileWriter
											FileWriter fw2 = new FileWriter("C:/java/out3.txt", true);
											for (int i = 11; i < 21; i++) {
												String data = i + "번째 줄입니다.\r\n";
												fw2.write(data);
												
											}
											fw2.close();
											// 추가작성 - PrintWriter
											PrintWriter pw2 = new PrintWriter(new FileWriter("C:/java/out3.txt", true));
											for (int i = 21; i < 31; i++) {
												String data = i + "번째 줄입니다.\r\n";
												pw2.write(data);
												
											}
											pw2.close();
											
											
										// FileInputStream
										// 바이트배열 읽어야하는데 배열의 길이를 모를 경우 좀 불편, 
										//따라서 예제에는 1024바이트만 읽게 하자	
											
											byte[] b = new byte[1024];
											FileInputStream input = new FileInputStream("c:/java/out.txt");
											input.read(b);
											System.out.println(new String(b));
											input.close();
											
											
											// BufferdeReader
											// 파일을 한줄단위로 읽는다.
											// FileReader
											BufferedReader br = new BufferedReader(new FileReader("c:/java/out.txt"));
											while (true) {
												String line = br.readLine();
												if (line == null) break;
												System.out.println(line);  
//												                            1번째 줄입니다.
//																			2번째 줄입니다.
//																			3번째 줄입니다.
//																			4번째 줄입니다.
//																			5번째 줄입니다.
//																			6번째 줄입니다.
//																			7번째 줄입니다.
//																			8번째 줄입니다.
//																			9번째 줄입니다.
//																			10번째 줄입니다.
//												
											}
											
											
											
											
											
	
											
	// Thread와 Runnable
				
		
				package Baekjoon;

				import java.util.ArrayList;
				import java.util.List;

				public class test extends Thread {
					
					private int seq;
					
					public test(int seq) {
						this.seq = seq;
					}

					public void run() {
						// Thread를 상속하면 run 메서드를 구현해야 한다.
						System.out.println(this.seq +"thread run");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(this.seq +"thread end");
					}
					
					public static void main(String[] args)  {
						
						// 동작하고 있는 프로그램을 프로세스 process
						// 한개의 프로세스에는 한가지의 일을 수행한다
						// 하지반 스레드 thread를 이용하면 프로세스 내에서
						// 두가지 또는 그 이상의 일을 동시 수행할 수 있다.
						List<Thread> threads = new ArrayList<>();
							for (int i = 0; i <10; i++) {
						test test = new test(i);
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
//														4thread run
//														6thread run
//														1thread run
//														3thread run
//														7thread run
//														8thread run
//														5thread run
//														2thread run
//														9thread run
//														0thread run
//														8thread end
//														0thread end
//														1thread end
//														5thread end
//														2thread end
//														7thread end
//														3thread end
//														9thread end
//														4thread end
//														6thread end
//														반복문 종료

															
		//이걸 Runnable 로 (거의비슷)
														
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
				
				
				
										
										
										
										
			// 예제
										
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
//											String s = "a:b:c:d";
//										String[] ss = s.split(":");
//										String result = String.join("#", ss);
//											System.out.println(result);
						//2번
//											Map<String, Integer> a = new HashMap<>();
//									        a.put("A", 90);
//									        a.put("B", 80);
//									        Integer c = a.get("C") == null ? 70 : a.get("C");
//									        
//									      
//									        System.out.println(a.get("C"));

						
						// stream API를 사용해서 배열의 합과 평균을 구하는 코드로 개선하기
						int[] nums = {1,2,3,4,5};
						int sum = 0;
						for (int i = 0; i <nums.length; i++) {
							sum += nums[i];
							
						}
						double avg = (double) sum / nums.length;
						
						int sum2 = Arrays.stream(nums).sum(); // 이 두줄만 추가함 됨.
						double avg2 = Arrays.stream(nums).average().orElse(0.0);
						
						System.out.println(avg);//3.0
						
	
						
						
						
		// 15일차
						
						
						public class SwingEx extends JFrame {
							// 창을 만드는 객체, 파리미터를 지정하면 제목출력됨.
							//JFrame frame = new JFrame("제목 출력");
							// 버튼 객체
							JButton btn1 = new JButton("확인");
							JButton btn2 = new JButton("취소");
							JButton btn3 = new JButton("1");
							JButton btn4 = new JButton("2");
							JButton btn5 = new JButton("3");
							
							JPanel jpanel = new JPanel();
							
							
							
							
							public  SwingEx() {
								// 제목 설정
								super("제목이다.");
								// 프레임 크기 지정
								this.setSize(300, 400);
								/*
								 * GridLayout(세로 몇줄, 가로 몇줄)
								 */
								this.setLayout(new BorderLayout());
							//	jpanel.add(btn1);
							//	jpanel.add(btn2);
								this.add(jpanel, "North");
//								this.add(btn3, "west");
//								this.add(btn4, "Center");
								
								
								//텍스트 필드 생성 사용자가 값 입력할수있게
								JTextField text = new JTextField("0");
								// 사용자가 직접 입력하지 못하게 막는다.
								text.setEditable(false);
								//텍스트 우측 정렬
								text.setHorizontalAlignment(JTextField.RIGHT);
								//텍스트 필드를 상단에 배치한다.
								this.add(BorderLayout.NORTH, text);
								
								// 컴포넌트를 담을 컨테이너 설정
							//	Container container = this.getContentPane();
//								container.add(btn1);
//								container.add(btn2);
//								container.add(btn3);
//								container.add(btn4);
//								container.add(btn5);
//								container.add(btn1, BorderLayout.NORTH);
//								container.add(btn2, BorderLayout.EAST);
//								container.add(btn3, BorderLayout.WEST);
//								container.add(btn4, BorderLayout.SOUTH);
//								container.add(btn5, BorderLayout.CENTER);
								
								/* 레이아웃 설정
								 * 1. FolwLayout : 컴포넌트를 좌에서 우로 배치 + 중앙정렬
								 * 2. BorderLayout : 배치 위치를 정할 수 있다. 동서남북 + 중앙
								 * 3. GridLayout : 테이블 형태의 레이아웃
								 */
								this.setLayout(new FlowLayout());
								
								// 버튼 추가
//								this.add(btn1);
//								this.add(btn2);
								// 프레임 보이기
								this.setVisible(true);
								// 닫기 버튼 클릭시 처리
								this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
								
								
							}
									
							public static void main(String[] args) {
								/*용어
								 * 1. Container : 컴포넌트를 담는 역할
								 * 2. Component : 버튼, 인풋박스, 텍스트 에어리어 등
								 * 3. Layout : 컨테이너를 담는다. 화면에 자리 배치
								 */
								// 창 띄우기
								
								new SwingEx();
								

								
								
								
			// 계산기 만들기
								
								// ActionListener은 사용자의 인터렉션 감지
								public class Calc extends JFrame implements ActionListener {
									private JPanel panel; // numberInput의 패널
									private JPanel  panel2; // otherInput의 패널
									private GridLayout gridLayout; // 계산기 버튼을 담을 레이아웃
									private JButton btns;
									private JTextField numberInput; // 숫자 입력
									private JTextField otherInput; // 연산 기호 입력
									
									private String[] strGrid = {"7","8","9","/","4","5","6","*","1","2","3","-" ,"0","C","+","="};

									
									// 숫자누적배열
									ArrayList<Integer> 숫자배열 = new ArrayList<>();
									//연산자 누적 배열
									ArrayList<String> 연산자배열 = new ArrayList<>();
									// 숫자 누적 값
									private String num1 = "";// 첫 번째 숫자
									// 결과값
									private String num2 = "";// 두 번째 숫자
									
								    private String operator = ""; // 연산자
								    
									public Calc() {
										// 제목 설정
										super("계산기");
										// 프레임 크기 지정
										this.setSize(800,700);
										// 버튼을 담기 위한 객체
										
										
								    
										this.panel = new JPanel();
										
										this.panel2 = new JPanel();
										
										
										
										
										this.numberInput = new JTextField("0");
										
										// 숫자 입력 칸 (결과 출력 칸) 크기 및 글자 크기 확대
										this.numberInput.setFont(new Font("Arial", Font.BOLD, 50)); // 글자 크기 키움
										this.numberInput.setPreferredSize(new Dimension(800, 100)); // 높이 조정
										this.otherInput = new JTextField("");
										// 연산자 입력 칸 크기 및 글자 크기 확대
										this.otherInput.setFont(new Font("Arial", Font.BOLD, 30)); // 글자 크기 키움
										this.otherInput.setPreferredSize(new Dimension(800, 50)); // 높이 조정
										//텍스트의 우측 정렬
										this.numberInput.setHorizontalAlignment(JTextField.RIGHT);
										this.otherInput.setHorizontalAlignment(JTextField.RIGHT);
										// 입력 못하게 처리
										this.numberInput.setEditable(false);
										this.otherInput.setEditable(false);
										
										this.panel2.setLayout(new BorderLayout());
										this.panel2.add(BorderLayout.NORTH, this.numberInput);
										this.panel2.add(BorderLayout.CENTER, this.otherInput);
										
										
										
										// 배열을 순회하면서 버튼 삽입
										for(int i=0; i<strGrid.length; i++){
											this.btns = new JButton(strGrid[i]);
											this.btns.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
											this.btns.setBackground(new Color(255, 192, 203));
											// 버튼 누름을 감지한다. 누르면 antionPerformed 메서드가 실행된다.
											this.btns.addActionListener(this);
											this.panel.add(this.btns);
										}
										// 버튼을 담은 panel을 GridLayout에 담는다.
										this.panel.setLayout(new GridLayout(4,3,6,6));
										this.add(BorderLayout.CENTER,panel);
										this.add(BorderLayout.NORTH,panel2);
										this.setVisible(true);
										this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									}
									public static void main(String[] args) {
										new Calc();
									}
									@Override
									public void actionPerformed(ActionEvent e) {
										String cmd = e.getActionCommand();
										//숫자를 입력했는지 연산기호를 입력했는지 판단
										// C버튼 (초기화) 눌렀을 때, = 버튼 눌렀을 때
										
										if (cmd.matches("[0-9]")) {  // 0~9 입력 처리
								            if (operator.isEmpty()) {
								                num1 += cmd;
								                numberInput.setText(num1);
								            } else {
								                num2 += cmd;
								                numberInput.setText(num2);
								            }
								        } 
								        // 연산자 버튼 클릭 시
										// num1에 값이 있어야 operater에 추가됨.
								        else if (cmd.matches("[\\+\\-\\*/]")) {
								            if (!num1.isEmpty()) {
								                operator = cmd;
								                otherInput.setText(operator);
								            }
								        } 
								        // "=" 버튼 클릭 시 (계산 실행)
								        else if (cmd.equals("=")) {
								            if (!num1.isEmpty() && !num2.isEmpty() && !operator.isEmpty()) {
								                double result = calcul(Double.parseDouble(num1), Double.parseDouble(num2), operator);
								                numberInput.setText(String.valueOf(result));
								                otherInput.setText("");
								                
								                // 계산 완료 후 초기화 (계속 연산 가능하도록 설정)
								                num1 = String.valueOf(result);
								                num2 = "";
								                operator = "";
								            }
								        } 
								        // "C" 버튼 클릭 시 (초기화)
								        else if (cmd.equals("C")) {
								            숫자배열.clear();
								            연산자배열.clear();
								            //연산변수초기화
								            num1= "";
								            num2 = "";
								            //인풋박스 값 초기화
								            this.numberInput.setText("0");
								            this.otherInput.setText("");
								        }
								    }

								    // 실제 연산을 수행하는 메서드
								    private double calcul(double a, double b, String op) {
								    	 return switch (op) {
								            case "+" -> a + b;
								            case "-" -> a - b;
								            case "*" -> a * b;
								            case "/" -> (b != 0) ? a / b : 0; // 0으로 나누는 경우 예외 처리
								            default -> 0;
								        };
								    }

										
										
									}

		
							}

						}
						
						
						
						
						
						
						
						
						
						
						
							}
									
							
							
							
						}		
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					





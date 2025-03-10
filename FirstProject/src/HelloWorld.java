// 1일차






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
						// 메소드 오버라이딩 
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
			
							
						
						
											
												
												

											

								
			
		
						




package Baekjoon;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.UUID;


public class StreamBasic {

	public static void main(String[] args)    {


		
		/*
		 * 
		 * PK 기본키
		 * 특별한 의미를 지닌 열, 키 
		 * >>학번과 같은 느낌 가장 기본이 되는 중복x 특별 키
		 * 아이디와 주민번호는 보조키(대체키)라 볼수 있음
		 * 기콘키와 보조키를 아울러 후보키
		 * FK 외래키
		 * >>학과코드
		 * 다른테이블을 참조하기위한 특정한 컬럼이름
		 * 복합키
		 * >>과목코드가 같은데 담당교수가 다를때
		 * 
		 * 
		 * sqlplus sys/oracle as sysdba 
		 * 
		 * ALTER SESSION SET"_oracle_script"=true >>> 기본적인 c## 접두사 삭제
		 * 
		 * 사용자 계정 생정
		 * create user scott identified by tiger
		 * default tablespace users quota unlimited on users;
		 * 
		 * grant create session, create table to scott; // 관리자권한이 부여되었습니다.
		 * 
		 * conn scott/tiger // 연결
		 * 
		 * 
		 * desc emp;
		 * desc dept;
		 * desc salgrade;
		 * 
		 * exit
		 * 
		 * 
		 * */
}
}
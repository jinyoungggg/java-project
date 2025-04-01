package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.net.ServerSocket;

import java.net.Socket;

 

public class Server {

 

	public static void main(String[] args) {

		
		 /* 통신 흐름
		 * 1. 서버 소켓 생성 : 서버는 특정 포트에서 클라이언트의 연결을 기다린다.
		 * (포트 Port : 데이터를 특정 프로그램이나 서비스를 전달하는 문(door)과 같은 역할)
		 * (아파치 > html 구동 80포트, 스프링 8080포트)
		 * 포트 : IP 주소와 함께 사용됨. 0 ~65535
		 * ex : 192.168.0.10:80
		 * 
		 * 2. 클라이언트 소켓 생성 : 클라이언트는 서버의 IP주소 + 포트번호를 사용해서 서버와 연결 시도
		 * 
		 * 3. 연결 수립 : 클라이언트가 서버에 연결하면, 서버는 클라이언트의 연결을 수락하고, 데이터 교신 가능
		 * 
		 * 4. 데이터 송수신 : 데이터를 주고 받으며 통신을 진행
		 * 
		 * 5. 연결 종료 : 종료
		 */					

		System.out.println("서버가 시작되었다.");

		try (ServerSocket serverSocket = new ServerSocket(111)) {

			while (true) {

				new ClientHandler(serverSocket.accept()).start();

			}

		} catch (IOException e) {

			// TODO: handle exception

			e.printStackTrace();

		}

	}

 

	private static class ClientHandler extends Thread {

		public ClientHandler(Socket socket) {

			// do something

		}

		public void run() {}

	}

 

}

 


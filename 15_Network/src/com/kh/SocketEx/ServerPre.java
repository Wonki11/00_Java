package com.kh.SocketEx;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//채팅 시작 주최자
//port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			System.out.println("서버 오픈");
			
			Socket s = server.accept();
			System.out.println("입장");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			
			out.print("hi server!");
			
			String message = in.readLine();
			System.out.println("send success : " + message);
			
			//for문 whiled 사용해서 출력을 확인
			
			for(int i =0; i<3; i++) {
				out.print(i);
				String t = in.readLine();
				System.out.println("send success : " + t); 
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//파티참가자
public class ClientEx {
	public static void main(String[] args) {
		
		
		
		try {
			//					localhost = 127.0.01은 내 컴퓨터주소라는 의미
			//						접속 하고자하는 컴퓨터 주소, 서버의 포트번호
			Socket c = new Socket("localhost",          12349    );
			
			//주최자와 대화를 하기 위한 입출력 스트림 생성
			//1.참가자.getInputStream() : 참가자가 작성한 데이터를 읽어오기 위한 입력 스트림을 가져옴(숫자값으로 대화를 가져옴)
			//2.InputStreamReader : 하나씩된 단어들을 숫자에서 문자로 변환하는데 사용
			//3.BufferedReader : 하나씩 된 데이터를 한 번에 가져오고 읽을 수 있도록 도와줌
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			//작성한 내용을 눈으로 볼 수 있게 내보내는 역할을 하고, 눈으로 읽을 수 있게 도와줌
			//1.참가자.getOutputStream(),true : 참가자가 작성한 내용을 내보내기위해 가져옴
			//										true를 사용함으로써 내보내도ok 라는 의미
			//2.                  PrintWriter() : 텍스트를 출력하는데 불편함 없이 매끄럽게 출력할 수 있도록 도와줌
			//									  flush() : 강제로 출력하는 역할 < true
			PrintWriter out = new PrintWriter(c.getOutputStream(),true);
			
			
			//서버로 메세지 전송
			out.println(" hi server !");
			
			//주최자로부터 받은 메세지 수신 및 출력
			String m ;// in.readLine();
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				
				
				// 
			}
			
			
			
			
			//닫기 내할말을 쓰고 내보내고 주최자 집에서 집가는 순서로 닫기
			in.close();
			out.close();
			c.close();
			
			
			
			
			
			
			
			
			
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

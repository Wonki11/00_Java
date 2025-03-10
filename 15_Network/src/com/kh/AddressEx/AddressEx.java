package com.kh.AddressEx;
/*
IP주소 : 컴퓨터에서 네트워크에 특정 장치를 확인하는데 사용하는 숫자

가장 기본 주소 
우리집주소 = 192.168.0.1 localhost 127.0.0.1

나중에 내 컴퓨터 실제 주소를 알고 싶다면 네이버 검색창에 ip주소 확인

port = 네트워크 에서 데이터를 주고 받을 수 있는 장소
타인의 컴퓨터나 도메인, 또는 특정위치에 들어갈 수 있는 번호 2자리 4자리


InetAddress : Java에서 IP 주소를 나타내는데 사용
	호스트명과 IP주소간의 변환, 집주인에 대한 정보 검색 등을 가능하게 해줌
	
메서드명 : 
getByName(Sting host) : host 명에 대한 정보를 반환

getHostName() : 호스트 명을 가져옴

getHostAddress() : IP주소를 가져옴 

호스트명 : www.google.com
구글 주소 : 142.250.66.100

영어로 된 이름 주소와 숫자로 된 주소가 다른사람이 검색했을 경우와 내가 검색했을 때 숫자 주소가
다르게 나오는 경우는 영어로 된 이름주소 주인이 진자 본인의 실제 숫자 주소를 보호하기 위해
임시로 보여주는 숫자 주소이기 때문에 개인이 다르게 보여지는 것임

 * */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx {
	//최종 실행 메인 메서드
	public static void main(String[] args) {
		//1. naver 에 대해 알아보기
		try {//에러가 생길지는 모르나 일단 시도해보는 것 = try
			
			InetAddress 주소 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트명 : " + 주소.getHostName());
			System.out.println("IP 주소 : " + 주소.getHostAddress());
			
			
		} catch (UnknownHostException e) { // 시도했을 대 예외가 발생하면 보일 내용 = catch
		
			e.printStackTrace();
		}
		
		//2. daum에 대해 알아보기
		
		try {
			InetAddress 다음주소 = InetAddress.getByName("www.daum.net");
			System.out.println("호스트명 : " + 다음주소.getHostName());
			System.out.println("IP주소  : " + 다음주소.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. IP주소로 daum.net 검색하기
		
		try {
			InetAddress 다음IP = InetAddress.getByName("121.53.105.193");
			System.out.println("호스트명 : " + 다음IP.getHostName());
			System.out.println("IP주소 : " + 다음IP.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}

package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
	//필드
	private String title;
	private String singer;
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	//메서드
	
	
	//생성자 기본
	public Music() {
		
	}
	//생성자 필수
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	//목록이나 값이 나오지 않을 경우
	//String 으로 전달해주는 값이 없기 때문
	@Override
	public String toString() {
		return "곡명 : " + title + ", 가수명 : " + singer;
	}
	
	//sort compareTo 비교의 기준을 만들어주자
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.title);
	}
}

package package3.model.vo;

public class Horse extends Animal{
//필드
	private String location;
	private String color;
//메서드
	//getter
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	//setter
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//생성자 기본
	public Horse() {
		
	}
	//생성자 필수
	public Horse(String name,String kind,String location, String color) {
		super(name,kind);
		this.location = location;
		this.color = color;
	}
	
	//오버라이드
	@Override
	public void speak() {
		System.out.println(super.toString()+" 사는 곳은 " + location + " 색상은 " + color + " 입니다.");
	}
}

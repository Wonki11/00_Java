package package3.model.vo;


// abstract 추상 메서드를 쓰기위해서는 class도 추상클래스여야 사용할수있음
public abstract class Animal {
//필드
	private String kind;
	private String name;
	//메서드
	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getKind() {
		return kind;
	}
	
	//생성자 기본
	public Animal() {
		
	}
	//생성자 필수
	public Animal(String name, String kind) {
		this.name = name;
		this.kind = kind;
	}
	@Override //javaAPI 
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kind + "입니다. ";
	}
	
	public abstract void speak();
	
}

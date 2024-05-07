package package3.model.vo;


// Animal extends
public class Rabbit extends Animal{
	//필드
	private int weight;
	private String color;
	//메서드
	//setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//getter
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	
	
	
	
	//생성자 기본
	public Rabbit() {
		
	}
	//생성자 필수
	public Rabbit(String name,String kind,int weight, String color) {
		super(name,kind);
		this.weight = weight;
		this.color = color;
	}
	
	//오버라이드 speak 
	@Override
	public void speak() {
		System.out.println(super.toString() + "무게는 " + weight + " 색상은 " + color + " 입니다.");
	}
}

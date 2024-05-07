package package3.model.vo;

//동물 추상클래스 가져오기
//메서드
public class Dog extends Animal{
	public static final String Place = "애견카페";
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//생성자 기본
	public Dog() {
		
	}
	//생성자 필수
	public Dog(String name, String kind,int weight) {
		super(name,kind); //Animal 밑에 이미있는 name kinds를 바라보게 하기 위해서
		this.weight = weight;
	}
	
	//@Override speak 컨트롤 + 스페이스
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
		
	}

}

package package3.model.vo;

import java.util.Random;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AnimalWorld {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			if(random.nextBoolean()) {
				animals[i] = new Rabbit("래빗 " + i, " 토끼 ", random.nextInt(30) + 1,"하얀색");
			}else {
				animals[i] = new Horse("홀스 " + i, " 말 ", "목장","갈색" );
			}
		}
		//for - each문
		for(Animal a : animals) {
			a.speak();
		}
	}
}

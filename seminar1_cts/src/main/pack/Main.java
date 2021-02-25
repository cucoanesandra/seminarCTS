package main.pack;
import classes.pack.*;

public class Main {
	public static void main(String[] args) {
		Zookeeper keeper=new Zookeeper("Dani");
		Zoo zoo=new Zoo();
		zoo.setZookeeper(keeper);
		
		Giraffe giraffe=new Giraffe("Girafa", 10);
		Giraffe secondgiraffe=new Giraffe("Girafa2", 15, 200);
		
		zoo.addAnimal(giraffe);
		zoo.addAnimal(secondgiraffe);
		
		zoo.feedAllAnimals();
		
		Zebra z1=new Zebra("Zebra1", 7);
		Zebra z2=new Zebra("Zebra 2", 9, 132);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
	}
}

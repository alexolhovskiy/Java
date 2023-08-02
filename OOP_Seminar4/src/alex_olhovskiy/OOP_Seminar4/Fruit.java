package alex_olhovskiy.OOP_Seminar4;

import java.util.Random;

public abstract class Fruit {
	protected static Random rand=new Random(); 
	private String name;
	private float weight;
	
	public Fruit(float weight,String name) {
		this.weight=weight;
		this.name=name;
	}
	
	public String toString() {
		return name+" "+weight;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	
}

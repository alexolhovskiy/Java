package alex_olhovskiy.OOP_Seminar4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Box <T extends Fruit> implements Iterable<T> {
	private ArrayList<T>box=new ArrayList<>();
	private String name;
	
	public Box(String name) {
		this.name=name;
	}
	
	public Iterator<T> iterator(){
		Iterator<T>it=new Iterator<T>() {
			private int index=0;
			@Override
			public boolean hasNext() {
				return index<box.size();
			}

			@Override
			public T next() {
				return box.get(index++);
			}
		};
		return it;
	}
	
	
	public void Add(T fruit) {
		box.add(fruit);
	}
	
	public int getSize() {
		return box.size();
	}

	
	public T Get() {
		return box.remove(0);
	}
	
	public float getWeight() {
		float totalWeight=0;
		for(T fruit:box)
		{
			totalWeight+=fruit.getWeight();
		}
		return totalWeight;
	}
	
	public String toString() {
		return "Box with "+name+"s; Amount is "+box.size()+"; Total weight is "+getWeight();
		//return "Amount is "+box.size()+"; Total weight is "+getWeight();
	}

	
	public boolean compare(Box b) {
		if(getWeight()==b.getWeight())
		{
			return true;
		}
		return false;
	}
	
	
	public void takeAll(Box<T> b) {
		int temp=b.getSize();
		for(int i=0;i<temp;i++)
		{
			Add(b.Get());
		}
	}

}

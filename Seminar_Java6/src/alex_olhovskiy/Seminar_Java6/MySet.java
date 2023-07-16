package alex_olhovskiy.Seminar_Java6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MySet<T> {
	int length=0;
	private HashMap<T,Integer>map=new HashMap<>();
	private static final Object myo=new Object();
	

	public boolean add(T value) {
		boolean b=map.put(value,length)==null;
		length++;
		return b;
	}
	
	public boolean remove(T value) {
		return map.remove(value)==myo;
	}
	
	public String toString() {
		return map.keySet().toString();
	}
	
	public Iterator<T>iterator(){
		return map.keySet().iterator();
	}
	
	public T get(int index){
		for(Map.Entry<T, Integer> item:map.entrySet())
		{
			if(item.getValue()==index) 
			{
				return item.getKey();
			}
		}
		return null;
	}
}

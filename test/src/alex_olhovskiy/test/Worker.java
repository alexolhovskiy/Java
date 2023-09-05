package alex_olhovskiy.test;

public class Worker {
	public String name;
	public Worker(String name) {
		this.name=name;
	}
	
//	public String toString() {
//		return this.name;
//	}
	
	public boolean equals(Object o) {
		return this.name==((Worker)o).name;
	}
}

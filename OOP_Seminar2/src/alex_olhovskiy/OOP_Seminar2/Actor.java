package alex_olhovskiy.OOP_Seminar2;

public abstract class Actor {
	protected String name;
	protected boolean isTakeOrder;
	protected boolean isMakeOrder;
	
	public abstract String getName();
	
	public boolean equals(Object O) {
		return this.name==((Actor)O).name;
	}
	
	public int hashCode()
    {
        return name.hashCode();
    }
	 

}

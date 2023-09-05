package alex_olhovskiy.FirstMultyThread;

public class CommonResource {
	private int index;
	
	public CommonResource(int i) {
		index=i;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex() {
		this.index++;
	}
	
}

package Seminar2;

public class JavaException2 {

	public static void main(String[] args) {
		try {
			System.out.println(divideNumbers(10,0));
		}catch(DevisionByZerroException ex) {
			System.out.println("Error"+ex.getMessage());
		}

	}
	
	public static int divideNumbers(int divedent,int divisor)throws DevisionByZerroException{
		if(divisor==0)
		{
			throw new DevisionByZerroException("Error: division by zerro");
		}
		return divedent/divisor;
	}
	

}

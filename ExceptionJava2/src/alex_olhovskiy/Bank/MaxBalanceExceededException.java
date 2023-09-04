package alex_olhovskiy.Bank;

public class MaxBalanceExceededException extends Exception{
	public MaxBalanceExceededException(String message) {
		super(message);
	}
}

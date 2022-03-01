//3. Write a customized Exception class for a Banking project.
package SBA2;

public class SBA2c {
	public static void main(String[] args) {
		Account act = new Account();
		System.out.println("Current Balance: "+act.balance());
		System.out.println("Withdrawing $200");
		act.withdraw(200);
		System.out.println("Current balance: "+act.balance());
		act.withdraw(1000);
		
	}
}
 class Account{
	private int balance=1000;
	
	public int balance() {
		return balance;
	}
	public void withdraw(int amount) throws NotSufficientFundException{
		if(amount >= balance) {
			throw new NotSufficientFundException(String.format("Current balance %d is less than requested amount %d ", balance, amount));
			
		}
		balance = balance - amount;
	}
	public void deposit(int amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount ));
		}
	}
}
 class NotSufficientFundException extends RuntimeException{
	private String message;
	public NotSufficientFundException(String message) {
		this.message=message;
	}
	public NotSufficientFundException(Throwable cause, String message) {
		super(cause);
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}

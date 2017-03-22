public class BankAccount{
	private double balance;
	public BankAccount(double money){
		balance = money;
	}
	public void debit(double money){
		if(balance<money)
			System.out.printf("substracting %f from account2 balance Debit amount exceeded account banlance\n", money);
		else
			balance=balance - money;
	}
	public void credit(double money){
		balance=balance+money;
	}
	
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double money){
		balance = money;
	}
}
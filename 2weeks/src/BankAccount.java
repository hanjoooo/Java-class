public abstract class BankAccount implements Valuable{
	private double balance;
	public BankAccount(double money){
		balance=money;
	}
	public  void setBalance(double m){
		balance=m;
	}
	public abstract double getWithdrawableAmount();
	public abstract void debit(double x);
	public abstract void passTime(int x);
	public double getBalance(){
		return balance;
	}
	
}
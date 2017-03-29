public abstract class BankAccount{
	private double balance;
	public BankAccount(double money){
		balance=money;
	}
	public abstract double getWithdrawableAccount();
	public  void setBalance(double m){
		balance=m;
	}
	public void debit(double x){}
	public abstract void passTime(int x);
	public double getBalance(){
		return balance;
	}
	
}
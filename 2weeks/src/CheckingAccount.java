public class CheckingAccount extends BankAccount {
	private double credit_limit;
	private double interest;
	private double loan_interest;	
	@Override public void debit(double money){
		if(getBalance()+credit_limit<money)
			System.out.printf("substracting %f from account2 balance Debit amount exceeded account banlance\n", money);
		else
			setBalance(getBalance() - money);
	}
	public void nextMonth(){
		if(getBalance()>0){
			setBalance(getBalance()*interest+getBalance());
		}
		else if(getBalance()<0){
			setBalance(getBalance()*loan_interest+getBalance());
		}
	}
	public CheckingAccount(double money) {
		super(money);
		credit_limit=20.00;
		interest=0.1;
		loan_interest=0.7;
		// TODO Auto-generated constructor stub
	}

}

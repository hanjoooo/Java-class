public class CheckingAccount extends BankAccount {
	private double creditLimit;
	private double interest;
	private double loanInterest;	
	
	@Override public void debit(double money){
		if(getBalance()+creditLimit<money)
			System.out.printf("substracting %f from account2 balance Debit amount exceeded account banlance\n", money);
		else
			setBalance(getBalance() - money);
	}
	@Override public void passTime(int time){
		if(getBalance()>0)
			setBalance(getBalance()*interest*time+getBalance());
		else if(getBalance()<0)
			setBalance(getBalance()*loanInterest*time+getBalance());
	}
	@Override public double getWithdrawableAccount(){
		if(getBalance()+creditLimit<0)
			return 0;
		else	
			return getBalance()+creditLimit;
	}
	public CheckingAccount(double money, double limit, double inst, double loaninst) {
		super(money);
		setBalance(money);
		creditLimit=limit;
		interest=inst;
		loanInterest=loaninst;
		// TODO Auto-generated constructor stub
	}
}

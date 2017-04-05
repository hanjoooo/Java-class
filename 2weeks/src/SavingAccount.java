public class SavingAccount extends BankAccount implements Valuable{
	
	private double interestMonth;
	private int accountTime;

	public SavingAccount(double money, double interest){
		super(money);
		interestMonth = interest;
		accountTime=0;
	}
	@Override public double getWithdrawableAmount(){
		if(accountTime<12)
			return 0;
		else
			return getBalance();
	}
	@Override public void debit(double money){
		if(getBalance()<money)
			System.out.printf("substracting %f from account2 balance Debit amount exceeded account banlance\n", money);
		else if(accountTime<=12)
			System.out.println("만료가 되지 않아 출금할 수 없습니다.");
		else
			setBalance(getBalance() - money);
	}	
	@Override public void passTime(int time){
		accountTime += time;
		if(accountTime<=12)
			setBalance(getBalance()*Math.pow((1+interestMonth),time));	
	}
	@Override
	public double EstimateValue(int month) {
		passTime(6);
		// TODO Auto-generated method stub
		return getBalance();
	}
	public String toString(){
		return String.format("SavingAccount_Balance : %.2f",getBalance());
	}
	
	
}

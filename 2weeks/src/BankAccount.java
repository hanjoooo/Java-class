public class BankAccount{
	private double userMoney;
	public BankAccount(double money){
		userMoney = money;
	}
	public void debit(double money){
		if(userMoney<money)
			System.out.printf("substracting %f from account2 balance Debit amount exceeded account banlance\n", money);
		else
			userMoney=userMoney - money;
	}
	public void credit(double money){
		userMoney=userMoney+money;
	}
	public double balance(){
		return userMoney;
	}
}
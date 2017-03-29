import java.util.Scanner;
public class Bank {
	public static void main(String[] args){
		BankAccount account1=new CheckingAccount(100,50,0.01,0.07);
		BankAccount account2=new SavingAccount(100,0.05);
		Scanner s= new Scanner(System.in);
		double amount;
		
		System.out.printf("account1 balance : %.2f\n",account1.getBalance());
		System.out.printf("account1 현재 출금가능액 : %.2f\n",account1.getWithdrawableAccount());
		System.out.print("Enter withdrawal amount for account1 : ");
		amount = s.nextDouble();
		account1.debit(amount);
		
		System.out.printf("account1 balance : %.2f\n",account1.getBalance());
		System.out.printf("account1 현재 출금가능액 : %.2f\n",account1.getWithdrawableAccount());	
		account1.passTime(1);
		
		System.out.printf("account1 balance : %.2f\n",account1.getBalance());
		System.out.printf("account1 현재 출금가능액 : %.2f\n",account1.getWithdrawableAccount());
		account1.passTime(5);
		
		System.out.printf("account1 balance : %.2f\n",account1.getBalance());
		System.out.printf("account1 현재 출금가능액 : %.2f\n",account1.getWithdrawableAccount());
		
		System.out.println("account1 went Bankrupt!");
		
		System.out.printf("account2 balance : %.2f\n",account2.getBalance());
		System.out.printf("account2 현재 출금가능액 : %.2f\n",account2.getWithdrawableAccount());
		
		
		account2.passTime(6);
		System.out.println("6 Month later!");

		
		System.out.printf("account2 balance : %.2f\n",account2.getBalance());
		System.out.printf("account2 현재 출금가능액 : %.2f\n",account2.getWithdrawableAccount());
		account2.passTime(6);
		System.out.println("6 Month later!");
		account2.debit(50);

		
		System.out.printf("account2 balance : %.2f\n",account2.getBalance());
		System.out.printf("account2 현재 출금가능액 : %.2f\n",account2.getWithdrawableAccount());
		
		account2.passTime(1);
		System.out.println("next 1 Month later!");
		
		account2.debit(50);
		System.out.println("50달러 인출!!");
		
		System.out.printf("account2 balance : %.2f\n",account2.getBalance());
		System.out.printf("account2 현재 출금가능액 : %.2f\n",account2.getWithdrawableAccount());
		
	}
}

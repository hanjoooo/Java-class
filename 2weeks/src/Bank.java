import java.util.Scanner;
public class Bank {
	public static void main(String[] args){
		BankAccount account1=new BankAccount(50.00);
		BankAccount account2=new BankAccount(0.00);
		Scanner s= new Scanner(System.in);
		
		System.out.printf("account1 balance : %f\n",account1.balance());
		System.out.printf("account2 balance : %f\n",account2.balance());
		
		System.out.print("Enter withdrawal amount for account1 : ");
		double money1 = s.nextDouble();
		account1.debit(money1);
		System.out.printf("account1 balance : %f\n",account1.balance());
		System.out.printf("account2 balance : %f\n",account2.balance());
		
		System.out.print("Enter withdrawal amount for account2 : ");
		double money2 = s.nextDouble();
		account2.debit(money2);
		System.out.printf("account1 balance : %f\n",account1.balance());
		System.out.printf("account2 balance : %f\n",account2.balance());
	}
}

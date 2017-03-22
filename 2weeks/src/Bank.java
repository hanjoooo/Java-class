import java.util.Scanner;
public class Bank {
	public static void main(String[] args){
		CheckingAccount account1=new CheckingAccount(100.00);
		CheckingAccount account2=new CheckingAccount(100.00);
		Scanner s= new Scanner(System.in);

		System.out.printf("account1 balance : %f\n",account1.getBalance());
		System.out.printf("account2 balance : %f\n",account2.getBalance());
		
		System.out.print("Enter deposit amount for account1 : ");
		double money1 = s.nextDouble();
		account1.credit(money1);
		System.out.printf("account1 balance : %f\n",account1.getBalance());
		System.out.printf("account2 balance : %f\n",account2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2 : ");
		double money2 = s.nextDouble();
		account2.debit(money2);
		System.out.printf("account1 balance : %f\n",account1.getBalance());
		System.out.printf("account2 balance : %f\n",account2.getBalance());
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("account1 balance : %f\n",account1.getBalance());
		System.out.printf("account2 balance : %f\n",account2.getBalance());
	}
}

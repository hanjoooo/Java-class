import java.util.InputMismatchException;
import java.util.Scanner;
public class ValuableTest {
	public static void main(String[] args){
		BankAccount account1 = new CheckingAccount(100,50,0.01,0.07);
		BankAccount account2 = new SavingAccount(100,0.05);
		
		Scanner scan = new Scanner(System.in);
		Double amount;
		try{
			System.out.println("Enter deposit amount for Accout1: ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.println("Acount1 balance : $" + account1.getBalance());
			
			System.out.println("Enter deposit amount for Accout2: ");
			amount = scan.nextDouble();
			account2.debit(amount);
			System.out.println("Acount1 balance : $" + account1.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요 \n" + e.toString());
		}catch(Exception e){
			e.printStackTrace(System.out);
		}finally{
			account1.passTime(2);
			System.out.println("2 month later accout1 : " + account1.getBalance());
		}
		
		
	}
}

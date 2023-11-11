import java.lang.*;
public class Start1{
	public static void main(String[] args){
		SavingsAccount sa1 = new SavingsAccount(100,800,2);
	    System.out.println("sa1.balance: "+sa1.getBalance());
		sa1.deposit(500);
		sa1.withdraw(200);
		
		SavingsAccount sa2 = new SavingsAccount(369,6700,3);
		sa1.sendMoney(sa2,100);
		System.out.println("sa1.balance: "+sa1.getBalance());
		System.out.println("sa2.balance: "+sa2.getBalance());
		
		CurrentAccount ca1 = new CurrentAccount(666,900,2000);
		
		System.out.println("ca1.balance: "+ca1.getBalance());
		ca1.deposit(1500);
		ca1.withdraw(800);
		CurrentAccount ca2 = new CurrentAccount(777,5000,6969);
		ca2.sendMoney(ca1,300);
		System.out.println("ca1.balance: "+ca1.getBalance());
		System.out.println("ca2.balance: "+ca2.getBalance());
		
		sa1.display();
		sa2.display();
		ca1.display();
		ca2.display();
	}
		
	
}
import java.lang.*;
public class SavingsAccount extends Account{
	private int year;
	public SavingsAccount(int ano, double balance, int year){
		super(ano,balance);
		this.year = year;
	System.out.println("parameterized SavingsAccount");
	}
	public void display(){
		super.display();
	System.out.println("Year: "+year);}
	
	
}
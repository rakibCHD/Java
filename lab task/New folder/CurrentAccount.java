import java.lang.*;
public class CurrentAccount extends Account{
	private double limit;
	public CurrentAccount(int ano,double balance,double limit){
		super(ano, balance);
		this.limit = limit;
	System.out.println("Parameterizad current Account");}
	public void display(){
		super.display();
	System.out.println("limit: "+limit);}
	
}
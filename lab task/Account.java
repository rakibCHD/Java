import java.lang.*;

public class Account
{
	private int accountnumber;
	private String AccountHolderName;
	private double balance;
	
	public void setAccountNumber(int an)
	{
		accountnumber = an;
	}
	public void setAccountHolderName(String ahn)
	{
		AccountHolderName = ahn;
	}
	public void SetBalance(double b)
	{
		balance = b;
	}
	
	
	public int getAccountNumber()
	{
		return accountnumber;
	}
	public String getAccountHolderName()
	{
		return AccountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder Name: " + getAccountHolderName());
		System.out.println("Account Balance: " + getBalance());
		
	}
	
	public static void main(String[] args)
	{
		Account a = new Account();
		a.setAccountNumber(214);
		a.setAccountHolderName("JOhn");
		a.SetBalance(500.00);
		a.showDetails();
	}
}
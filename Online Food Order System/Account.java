
public class Account
{
	private String accNo;
	
	//NEED TO BE SAVED AS DOUBLE, SO NEED TO MAKE NECESSARY CHANGES IN DASHBOARD
	private String balance;
	
	public Account(String accNo, String balance)
	{
		this.accNo = accNo;
		this.balance = balance;
	}
	public String getAccNo()
	{
		return accNo;
	}
	public String balance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println("ACC NO: "+accNo);
		System.out.println("Balancee: "+balance);
	}
}
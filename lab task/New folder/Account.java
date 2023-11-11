import java.lang.*;
public class Account{
	private int ano;
	private double balance;
	public Account (int ano,double balance){
		System.out.println("parameterized Account");
		this.ano =ano;
	this.balance = balance;}
	public void deposit(double amount){
	balance = balance + amount;}
	public void withdraw(double amount){
	balance = balance - amount;}
	public void sendMoney(Account a,double amount){
		this.balance=this.balance-amount;
	a.balance=a.balance+amount;}
	
	public double getBalance(){
	return balance;}
	public void display(){
		System.out.println("ANO: "+ano);
	System.out.println("Balance: "+balance);}
}

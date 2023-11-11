import java.lang.*;

public class Book
{
	private String isbn;
	private  String BookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book(String isbn, String BookTitle, String authorName, double price, int availableQuantity)
	{
		setisbn(isbn);
		setBookTitle(BookTitle);
		setauthorName(authorName);
		setprice(price);
		setavailableQuantity(availableQuantity);
		
	}
	
	
	public void setisbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String BookTitle)
	{
		this.BookTitle = BookTitle;
	}
	public void setauthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	public void setavailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	
	
	public String getisbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return BookTitle;
	}
	public String getauthorName()
	{
		return authorName;
	}
	public double getprice()
	{
	   return price;	
	}
	public int getavailableQuantity()
	{
		return availableQuantity;
	}
	
	
	
	public void addQuantity(int quantity)
	{
		availableQuantity = availableQuantity+quantity;
	}
	public void sellQuantity(int quantity)
	{
		availableQuantity = availableQuantity-quantity;
	}
	public void showDetails()
	{
		System.out.println("ISBN :"+getisbn());
		System.out.println("Book title :"+getBookTitle());
		System.out.println("Author name :"+getauthorName());
		System.out.println("Price :"+getprice());
		System.out.println("Available Quantity :"+getavailableQuantity());
	}
	
}


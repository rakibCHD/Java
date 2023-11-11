import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Book b1 = new Book("123-4322","java","Asiful",499.99,200);
		Book b2 = new Book("123-086","xxxyyy","Abir",599.99,50);
		Book b3 = new Book("564-4566","Calculus","James Stewart",1499.99,100);
		Book b4 = new Book("345-345","Head First Java","Kathy sierra & Bert Bates",299.99,50);
		Book b5 = new Book("97888-452","The Lord of the Rings","J. R. R. Tolkien",550.99,60);
		
		Book books[] = new Book[]{b1,b2,b3,b4,b5};
		
		for(int i=0;i<5;i++)
		{
			books[i].showDetails();
			System.out.println();
			System.out.println();
		}
		}
}

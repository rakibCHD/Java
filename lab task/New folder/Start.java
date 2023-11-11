public class Start{
    public static void main(String[] args) {
        TextBook t1 = new TextBook();

        t1.setIsbn("84562-55-33-44");
        t1.setBookTitle("Java For Dummies");
        t1.setAuthorName("Abdul Rafiq");
        t1.setPrice(100);
        t1.setAvailableQuantity(200);
        t1.setStandard(6);

        System.out.println("ISBN: "+t1.getIsbn());
        System.out.println("Book Title: "+t1.getBookTitle());
        System.out.println("Author Name: "+t1.getAuthorName());
        System.out.println("Price: "+t1.getPrice());
        System.out.println("Standard: "+t1.getStandard());

        TextBook.setDiscountRate(t1.getPrice());
        System.out.println("Discount Rate: "+t1.getDiscountRate());
        t1.addQuantity(10);
        t1.sellQuantity(5);
        System.out.println("Available Quantity: "+t1.getAvailableQuantity());
		
		TextBook t2 = new TextBook(
					"56693-55-22-77",
					"C# For Dummies",
					"Ahmed Fukhrul Hasan",
					15,
					200,
					6);
		t2.showDetails();
		
		t2.addQuantity(20);
        t2.sellQuantity(10);
        System.out.println("Available Quality: "+t2.getAvailableQuantity());
		TextBook.setDiscountRate(t2.getPrice());
        System.out.println("Discount Rate: "+t2.getDiscountRate());
		
		StoryBook s1 = new StoryBook();
        s1.setIsbn("84566-08-12-26");
        s1.setBookTitle("Use of Complex Variable");
        s1.setAuthorName("Abdul Hannan");
        s1.setPrice(14.50);
        s1.setAvailableQuantity(150);
        s1.setCategory("Non-Fiction");

        System.out.println("ISBN: "+s1.getIsbn());
        System.out.println("Book Title: "+s1.getBookTitle());
        System.out.println("Author Name: "+s1.getAuthorName());
        System.out.println("Price: "+s1.getPrice());

        System.out.println("Category: " +s1.getCategory());

        StoryBook.setDiscountRate(s1.getPrice());
        System.out.println("Discount Rate: "+s1.getDiscountRate());

        s1.addQuantity(20);
        s1.sellQuantity(10);
        System.out.println("Available Quality: "+s1.getAvailableQuantity());

        StoryBook s2 = new StoryBook(
                "844566-44-33-22",
                "Statistical Mechanics",
                "Johoor Ahmeed",
                15,
                200,
                "Non-fiction"
        );
		s2.addQuantity(20);
        s2.sellQuantity(10);
        System.out.println("Available Quality: "+s2.getAvailableQuantity());
        StoryBook.setDiscountRate(s2.getPrice());
        System.out.println("Discount Rate: "+s2.getDiscountRate());

        s2.showDetails();
    }
}

import java.lang.*;

public class StoryBook extends Book{
    private String category;
    public StoryBook()
    {
        System.out.println("Empty Constractor");
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
    {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
        System.out.println("Parameterized Constractor");
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

}

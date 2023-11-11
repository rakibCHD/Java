import java.lang.*;
import java.sql.SQLOutput;

public class TextBook extends Book {
    private int standard;

    public TextBook()
    {
        System.out.println("Empty Constractor");
    }
    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
    {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
        System.out.println("Parameterized Constractor");
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

}

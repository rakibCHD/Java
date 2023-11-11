import java.lang.*;

public class Start {
    public static void main(String[] args) {
        StoryBook st1 = new StoryBook(
                "258-7798-859-77",
                "Book for java",
                "karlo",
                29.50,
                30,
                "StoryBook");

        st1.addQuantity(20);
        st1.sellQuantity(15);
       

        st1.showDetails();

        StoryBook st2 = new StoryBook(
                "2797-582-1122-1",
                "Java Book",
                "Jarvis",
                45.00,
                80,
                "StoryBook");

        st2.addQuantity(20);
        st2.sellQuantity(15);
        
        st2.showDetails();

        TextBook tx1 = new TextBook(
                "6589-4478-112-3",
                "Math Book",
                "Tony Stark",
                500.00,
                20,
                5);
        tx1.addQuantity(50);
        tx1.sellQuantity(25);
       

        tx1.showDetails();

        TextBook tx2 = new TextBook(
                "756-4562-1262-4",
                "Java TextBook",
                "David",
                175.50,
                10,
                4);
        tx2.addQuantity(50);
        tx2.sellQuantity(25);
       

        tx2.showDetails();
    }
}

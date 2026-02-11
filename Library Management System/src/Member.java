import java.util.ArrayList;

public class Member {
    private final String name;
    private final String memberId ;
    private ArrayList<Book> boworrowedBooks;
    public Member(String name, String memberId)
    {
        this.name = name;
        this.memberId = memberId;
        boworrowedBooks = new ArrayList<Book>();

    }
    public String getName()
    {
        return this.name;
    }
    public void getInfo()
    {
        System.out.println("Name : " + name);
        System.out.println("Id : " + memberId);
        System.out.println("List of all boworrowedBooks with info ");
        for(Book B : boworrowedBooks)
        {
            B.getInfo();
        }

    }
    public void borrowBook(Book book)
    {
        book.borrow();
        boworrowedBooks.add(book);

    }
    public void returnBook(Book book)
    {
        book.returnBook();
        boworrowedBooks.remove(book);

    }

}

import java.util.ArrayList;

public class LibrarySystem {
    private final String name;
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public LibrarySystem(String name)
    {
        this.name =name;
        books = new ArrayList<Book>();
        members = new ArrayList<Member>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void registerMember(Member member)
    {
        members.add(member);
    }
    public void lendBook(Member member,String isbn)
    {

        for(Book B : books)
        {
            if(B.getIsbn().equals(isbn)) {
                member.borrowBook(B);
                System.out.println(member.getName() + "   borrowed: " + B.getTitle() );
            }
        }


    }
    public void receiveBook(Member member, String isbn)
    {
        for (Book B : books) {
            if (B.getIsbn().equals(isbn))
                member.returnBook(B);
        }

    }
    public void displayAvailableBooks(){
        System.out.println("--------------------------------------------------------------");

        for(Book B: books)
        {
            B.getInfo();
        }
        System.out.println("--------------------------------------------------------------");

    }
    public static void main(String[] args)
    {
        // Create a library
        LibrarySystem library = new LibrarySystem("City Central Library");

// Create books
        Book book1 = new Book("Design Patterns", "Gang of Four", "978-0201633610");
        Book book2 = new Book("Clean Code", "Robert Martin", "978-0132350884");
        Book book3 = new Book("The Pragmatic Programmer", "Andy Hunt", "978-0135957059");

// Add books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

// Register members
        Member member1 = new Member("Alice Johnson", "M001");
        Member member2 = new Member("Bob Smith", "M002");

        library.registerMember(member1);
        library.registerMember(member2);

// Display available books
        library.displayAvailableBooks();

// Member borrows a book
        library.lendBook(member1, "978-0201633610");

// Display available books again
        library.displayAvailableBooks();

// Member returns a book
        library.receiveBook(member1, "978-0201633610");

    }
}

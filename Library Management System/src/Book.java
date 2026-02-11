public class Book {

    private final  String title;
    private final  String author;
    private final String isbn;
    public boolean isAvalaible;

    public Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvalaible = true;
    }
    public String getIsbn()
    {
        return this.isbn;
    }


    public String getTitle()
    {
        return this.title;
    }
    public void getInfo(){
        //Design Patterns by Gang of Four (ISBN: 978-0201633610)
        System.out.println( title + "by" + author + "(ISBN: " + isbn + ") , " +  (isAvalaible? "Avalaible" : "Not Avalaible") );



    }
    public void borrow()
    {
        if(isAvalaible)
            isAvalaible = false;
        else
            System.out.println("book already borrowed");

    }
    public void returnBook()
    {
        if(!isAvalaible)
            isAvalaible = true;
    }


}

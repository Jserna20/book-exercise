/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    // Extra field from 2.85
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // Edit in constructor to include page number
    public Book(String bookAuthor, String bookTitle, int pageNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;
    }

    // Add the methods here ...
    
    // Return author name
    public String getAuthor()
    {
        return author;
    }
    
    // Return title name
    public String getTitle()
    {
        return title;
    }
    
    // Accessor from 2.85
    // Returns page number
    public int getPages()
    {
        return pages;
    }
    
    // Methods added from 2.84
    
    // Prints author name
    public void printAuthor()
    {
        System.out.print(author + ", ");
    }
    
    // Prints title name
    public void printTitle()
    {
        System.out.print(title + ", ");
    }
    
    // Added for consistency
    // Prints page number
    public void printPages()
    {
        System.out.print(pages + ", ");
    }
    
    //Method from 2.87
    //Prints all details
    public void printDetails()
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Pages: " + getPages());
    }
}

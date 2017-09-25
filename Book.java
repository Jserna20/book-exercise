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
    // Extra field from 2.88
    private String refNumber;
    //Extra field from 2.91
    private int borrowed;

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
        refNumber = "";
        borrowed = 0;
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
    
    // Methods from 2.88
    public void setRefNumber(String ref)
    {
        // Modification from 2.90
        if (ref.length() >= 3)
        refNumber = ref;
        else
        {
            System.out.println("Error!! Reference number could not be found. Enter a number with at least 3 characters");
            refNumber = "";
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //Methods from 2.91
    public void borrow()
    {
        borrowed = ++borrowed;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    // Methods added from 2.84
    
    // Prints author name
    public void printAuthor()
    {
        System.out.print(author + " ");
    }
    
    // Prints title name
    public void printTitle()
    {
        System.out.print(title + " ");
    }
    
    // Added for consistency
    // Prints page number
    public void printPages()
    {
        System.out.print(pages + " ");
    }
    
    // Prints reference number
    public void printRefNumber()
    {
        if (refNumber.length() >= 3)
        System.out.print(refNumber + " ");
        else
        System.out.print("ZZZ ");
    }
    
    // Prints number of times borrowed
    public void printBorrowed()
    {
        System.out.print(borrowed + " ");
    }
    
    // Method from 2.87
    // Prints all details
    public void printDetails()
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Pages: " + getPages());
        // Modification from 2.89
        if (refNumber.length() >= 3)
        System.out.println("Reference Number: " + getRefNumber());
        else
        System.out.println("Reference Number: ZZZ ");
        System.out.println("Number of times borrowed: " + getBorrowed());
        //Skip extra line
        System.out.println("");
    }
}

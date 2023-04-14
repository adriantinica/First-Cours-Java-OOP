/**
 * LibraryApp
 */
public class LibraryApp {

    public static void main(String[] args) {

    Book b1 = new Book((byte)1,"Basics of Java","John Doe", (short)2000);
    Book b2 = new Book((byte)2,"Java Advanced", "John Doe", (short)2001);
    Book b3 = new Book((byte)3, "Atomic Habits", "James Clear", (short)2018);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
        
    }
}


class Book{

    private short order;
    private String title;
    private String author;
    private short year;
   

   
       // constructor
    public Book(byte order, String title, String author, short year){
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setOrder(order);
    
    }

    ///Getters and setters 
    public void setOrder(short order) {
        this.order = order;
    }

    public short getOrder() {
        return order;
    }
   
   
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title != null && title.length()>3){
            this.title = title;
        }
       
    }


    public void setAuthor(String author) {
        if(author != null && author.length()>4 && author.contains(" ")){  // dont let the author to be null, at least 5 characteres
            this.author = author;
        }
          //// check if it contains 1 space
    }
    public String getAuthor() {
        return author;
    }
    

     public void setYear(short year) {
        if(year >= 1900 || year <= 2023){  // dont allow values under 1900 and over 2023
            this.year = year;
        }
       
    }
    public short getYear() {
        return year;
    }
    
    
    public String toString(){
        return "Book " + order +":\n\ttitle: " + title +"\n\tauthor: " + author + "\n\tyear: " + year;
    }

}

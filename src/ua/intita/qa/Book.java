package ua.intita.qa;

public class Book
{
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;

public Book(int id, String title, String author, String publishingHouse, int year){
    this.id = id;
    this.title = title;
    this.author = author;
    this.publishingHouse = publishingHouse;
    this.author = author;
}
public Book(String title,String author)
{
    this.title = title;
    this.author = author;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                '}';
    }
    public static void listOfBookAuthor(Book[]b,String author){
        for (int i=0;i<b.length;i++){
            if(author.equals(b[i].author)){
                System.out.println(b[i].author + " " + b[i].title);
            }
        }
    }
    public static void listOfBookPublishingHouse(Book[]b,String publishingHouse){
        for (int i=0;i<b.length;i++){
            if(publishingHouse.equals(b[i].publishingHouse)){
                System.out.println(b[i].publishingHouse + " " + b[i].title);
            }
        }
    }
    public static void ListAfterYear(Book[] b,int year){
        System.out.println(" Born  after " + year);
        for (int i=0;i<b.length;i++){
            if(b[i].year > year){
                System.out.println(b[i].year + " " + b[i].title);
            }
        }
    }
}

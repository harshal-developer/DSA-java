package Exerciess;

public class Book {

    int book_no;
    String book_name;
    String book_type;

    public Book(int book_no, String book_name, String book_type) {
        this.book_no = book_no;
        this.book_name = book_name;
        this.book_type = book_type;
    }

    public void getbooks(){
        System.out.println("book id: "+ book_no);
        System.out.println("book id: "+ book_name);
        System.out.println("book id: "+ book_type);
        System.out.println("---------------------------");
    }
    public void updateBookName(String name){
        this.book_name = name;
    }
    public void updateBookType(String type){
        this.book_type = type;
    }
}

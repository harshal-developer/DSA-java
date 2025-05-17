package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class library {
    private String book_name;
    private int book_id;

    public library(String book_name, int book_id){
        this.book_name = book_name;
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    @Override
    public String toString(){
        return "book id : " + book_id + " and book name : " + book_name;
    }
}



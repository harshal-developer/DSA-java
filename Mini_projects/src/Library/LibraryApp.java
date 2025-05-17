package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp{
    private static ArrayList<library> app = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> lib = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Add book");
            System.out.println("2. Search book");
            System.out.println("3. Delete book");
            System.out.println("Enter you choice : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter book name ; ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter book id");
                    int id = sc.nextInt();
                    addNewBook(id, name);
                    break;
                case 2 :
                    System.out.println("Enter book id : ");
                    int search_id = sc.nextInt();
                    searchBook(search_id);
                    break;
                case 3 :
                    System.out.println("Enter book id");
                    int book_id = sc.nextInt();
                    sc.nextLine();
                    deleteBook(book_id);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    private static void deleteBook(int bookId) {
        boolean bookfound = false;
        for(library book : app){
            if(book.getBook_id() == bookId){
                bookfound = true;
                app.remove(book);
                System.out.println(bookId + " deleted sucessfully");
                break;
            }
        }
        if(!bookfound){
            System.out.println(bookId +  " not found");
        }
    }

    private static void searchBook(int id) {
        boolean found = false;
        for(library book : app){
            if(book.getBook_id() == id){
                System.out.println("book found : " + book);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("book with id : " + id + " not found");
        }
    }

    private static void addNewBook(int bookId, String bookName) {
        app.add(new library(bookName, bookId));
        System.out.println(bookName + " has been added successfully........");
    }
}

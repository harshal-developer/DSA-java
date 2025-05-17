package Exerciess;

import java.util.Scanner;

public class BookManagementSystem {
    static Book[] books = new Book[100];
    static int bookcount = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("Books Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Update Book Details");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    updateBook(sc);
                    break;
                case 4:
                    searchBook(sc);
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    public static void addBook(Scanner sc){
        System.out.println("Enter book no : ");
        int book_no = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter book name : ");
        String book_name = sc.nextLine();

        System.out.println("Enter book type : ");
        String book_type = sc.nextLine();

        books[bookcount] = new Book(book_no, book_name, book_type);
        bookcount++;
        System.out.println("Book added successfully!");
    }

    public static void displayAllBooks(){
        if(bookcount == 0){
            System.out.println("No books available.........");
        }else{
            for(int i = 0; i < books.length; i++){
                books[i].getbooks();
            }
        }
    }

    public static void searchBook(Scanner sc){
        System.out.print("Enter the book name : ");
        String name = sc.nextLine();

        boolean studentFound = false;
        for(int i = 0; i < bookcount; i++){
            if(books[i].book_name.equalsIgnoreCase(name)){
                books[i].getbooks();
                studentFound = true;
            }
        }
        if(!studentFound){
            System.out.println("Book with the name " + name + " not found.");
        }
    }

    public static void updateBook(Scanner sc){
        System.out.println("Enter a book id to udpate : ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean bookfound = false;
        for(int i = 0; i < bookcount ; i++){
            if(books[i].book_no == id){
                bookfound = true;

                System.out.println("1.Want ot update book name");
                System.out.println("2.Want ot update book tppe");
                System.out.println("Enter your chcoice : ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1 :
                        System.out.println("Enter a new name : ");
                        String new_name = sc.nextLine();
                        books[i].updateBookName(new_name);
                        System.out.println("Book name updated successfully");
                        break;
                    case 2 :
                        System.out.println("Enter a new book type : ");
                        String new_type = sc.nextLine();
                        books[i].updateBookType(new_type);
                        System.out.println("Book type updated successfully");
                        break;
                }
            }
        }
    }
}

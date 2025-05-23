import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManagement manager = new BookManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add book");
            System.out.println("2. Remove book by ISBN");
            System.out.println("3. Find book by ISBN");
            System.out.println("4. Find book by genre");
            System.out.println("5. List all book");
            System.out.println("0. Exit!");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    int id = sc.nextInt();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.println("Enter genre: ");
                    String genre = sc.nextLine();
                    System.out.println("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    manager.addBook(new Book(id, title, author,genre, quantity));
                    break;

                case 2:
                    System.out.print("Enter ISBN need delete: ");
                    int isbn = sc.nextInt();
                    manager.removeBookByISBN(isbn);
                    break;

                case 3:
                    System.out.print("Enter ISBN you want find: ");
                    int ISBN_de = sc.nextInt();
                    manager.findBookByISBN(ISBN_de);
                    break;

                case 4:
                    System.out.print("Enter genre you want find: ");
                    String Genre = sc.nextLine();
                    manager.findBookByGenre(Genre);
                    break;
                case 5:
                    System.out.println("List book: ");
                    manager.displayAllBooks();
                case 0:
                    System.out.println("Exit.");
                    break;

                default:
                    System.out.println("Option no available.");
            }

        } while (choice != 0);
    }
}

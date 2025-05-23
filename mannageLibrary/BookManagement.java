import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManagement {
    private static List<Book> books = new ArrayList<>();
    // thêm sách nếu trùng iSBN thi quantity + them
//    public void addBook(Book book) {
//        books.add(book);
//        System.out.println("Add book successful");
//    }

    public void addBook(Book newBook) {
        //if ISBN existed, update quantity
        for (Book book : books) {
            if (book.getISBN() == newBook.getISBN()) {
                int updatedQuantity = book.getQUANTITY() + newBook.getQUANTITY();
                book.setQUANTITY(updatedQuantity);
                System.out.println("Book already exists. Quantity updated.");
                return;
            }
        }
        // if ISBN not existed, add new
        books.add(newBook);
        System.out.println("Book added successfully.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("List book is empty!");
        } else {
            for (Book book : books) {
                book.showInfo();
            }
        }
    }

    public void removeBookByISBN(int id) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getISBN() == id) {
                it.remove();
                System.out.println("Remove successful.");
                return;
            }
        }
        System.out.println("No book found with ISBN: " + id);
    }

    public void findBookByISBN(int id) {
        boolean found = false;
        for (Book book : books) {
            if (book.getISBN() == id) {
                System.out.println("Found successfully:");
                book.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with ISBN: " + id);
        }
    }

    public void findBookByGenre(String genre) {
        boolean found = false;
        for (Book book : books) {
            if (book.getGENRE().equalsIgnoreCase(genre)) {
                System.out.println("Found successfully:");
                book.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with genre: " + genre);
        }
    }
}

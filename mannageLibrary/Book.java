public class Book {
    private int ISBN;
    private String TITLE;
    private String AUTHOR;
    private String GENRE;
    private int QUANTITY;

    public Book(int ISBN,String title, String author, String gender, int quantity) {
        this.ISBN = ISBN;
        this.TITLE = title;
        this.AUTHOR = author;
        this.GENRE = gender;
        this.QUANTITY = quantity;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public String getGENRE() {
        return GENRE;
    }

    public void setGENRE(String GENRE) {
        this.GENRE = GENRE;
    }

    public int getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(int QUANTITY) {
        this.QUANTITY = QUANTITY;
    }


    public void showInfo() {
        System.out.printf("ISBN: %d | Title: %s |Author: %s |Genre: %s |Quantity: %d \n", ISBN, TITLE, AUTHOR, GENRE,QUANTITY);
    }
}

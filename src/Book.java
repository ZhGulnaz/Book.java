public class Book {
    private int quantity;
    private String nameOfBook;
    private int id;
    private String name;
    private String surname;
    public Book(int quantity, String nameOfBook){
        this.quantity = quantity;
        this.nameOfBook = nameOfBook;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }
}

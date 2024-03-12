package ra.bussiness;

import java.util.Scanner;
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean status;
    public Book() {
    }
    public Book(int bookId, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = (float)(exportPrice - importPrice);
        this.status = status;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    public double getImportPrice() {
        return importPrice;
    }
    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }
    public double getExportPrice() {
        return exportPrice;
    }
    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách: ");
        bookName = scanner.nextLine();
        System.out.println("Nhập tác giả: ");
        author = scanner.nextLine();
        System.out.println("Nhập giá nhập: ");
        importPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá xuất: ");
        exportPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Trạng thái: ");
        status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Trạng thái: " + (status ? "Còn sách" : "Hết sách"));
    }
}
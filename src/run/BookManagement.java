package run;

import ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {
    private static Book[] books = new Book[100];
    private static int bookCount = 3;

    static {
        books[0] = new Book(1, "Sách 1", "A", "Mô tả sách 1", 100, 150, 50, true);
        books[1] = new Book(2, "Sách 2", "B", "Mô tả sách 2", 120, 180, 60, true);
        books[2] = new Book(3, "Sách 3", "C", "Mô tả sách 3", 150, 200, 50, false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số lượng sách thêm mới");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            System.out.println("Mời bạn chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    sortBooksByInterest();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    changeBookInfo();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (true);
    }
    public static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách cần thêm mới: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sách thứ " + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            books[bookCount++] = book;
        }
    }
    public static void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayData();
        }
    }
    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId() == id) {
                System.out.println("Xóa sách " + books[i].getBookName() + " thành công.");
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                bookCount--;
                return;
            }
        }
        System.out.println("Không tìm thấy sách có mã " + id);
    }
}
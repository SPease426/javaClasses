package class16;

public class Book {
    private String bookTitle;
    private int pages;
    private boolean isNovel;

    Book(String bookTitle, int pages){
        this.bookTitle = bookTitle;
        this.pages = pages;
    }

    Book(String bookTitle, int pages, boolean isNovel) {
        this.bookTitle = bookTitle;
        this.pages = pages;
        this.isNovel = isNovel;
    }

    public void printInfo() {
        System.out.println(bookTitle);
        System.out.println(pages);
        System.out.println(isNovel + "\n");
    }

    public static void main(String[] args) {
        Book b1 = new Book("Intro to Linear Algebra", 350);
        Book b2 = new Book("Stargate Atlantis: The Chosen", 325, true);

        b1.printInfo();
        b2.printInfo();
    }


}

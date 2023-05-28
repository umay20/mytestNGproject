package main.practice.day21;

public class Q03 {

    //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
    // information of the book

    String bookName;
    String authorName;
    int numOfPage;
    String bookID;

    static int numOfBooks;

    public static void main(String[] args) {

        Q03 book1 = new Q03("Crime and Punishment", "Dostoyevski", 650);

        //Book Name: Crime and PunishmentAuthor Name: DostoyevskiNumber Of Page650Book ID: Cr1

        Q03 book2 = new Q03("Pride and Prejudice", "Jane Austin", 400);

        book1.display();
        book2.display();//Book Name: Pride and Prejudice Author Name: Jane Austin Number Of Page400 Book ID: Pr2

    }

    Q03(String bookName, String authorName, int numOfPage) {

        this.bookName = bookName;
        this.authorName = authorName;
        this.numOfPage = numOfPage;

        numOfBooks++;

        bookID = bookName.substring(0, 2) + numOfBooks;

        System.out.println("Book Name: " + bookName + " Author Name: " + authorName + " Number Of Page" + numOfPage +
                " Book ID: " + bookID);

    }

    void display() {

        System.out.println("Book Name: " + bookName + " Author Name: " + authorName + " Number Of Page" + numOfPage +
                " Book ID: " + bookID);

    }

}








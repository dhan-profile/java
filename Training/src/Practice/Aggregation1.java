package Practice;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// The Book class has a relation with Library class (HAS-A relation)
// But the Book class can function independently without Library class

class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class Aggregation1 {
    public static void main(String[] args) {
        Book book1 = new Book("Book One");
        Book book2 = new Book("Book Two");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        Library library = new Library(books);

        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}


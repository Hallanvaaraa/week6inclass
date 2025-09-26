package app;

import dao.LibraryDao;
import entity.*;

public class App {

    public static void main(String[] args) {
        LibraryDao dao = new LibraryDao();

        Student student = new Student("Henri Hulkko");
        Author author = new Author("J.K. Rowling");
        Book ebook = new EBook("Harry Potter and the Philosopher's Stone", "exampleurl.com");
        Biography biography = new Biography("J.K. Rowling is not a very nice lady", author);
        Book printedBook = new PrintedBook("Harry Potter and the Chamber of Secrets", 300);
        Borrowedbook borrowedbook = new Borrowedbook(student, printedBook);

        dao.saveStudent(student);

        dao.saveAuthor(author);
        dao.saveBio(biography);
        dao.saveBook(ebook);
        dao.saveBook(printedBook);
        dao.saveBorrowed(borrowedbook);
    }
}

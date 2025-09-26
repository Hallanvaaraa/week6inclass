package entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PRINTED_BOOK")
public class PrintedBook extends Book {

    private int pageCount;

    public PrintedBook() {
    }

    public PrintedBook(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }
}

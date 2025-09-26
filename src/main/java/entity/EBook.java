package entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("EBOOK")
public class EBook extends Book {

    private String downloadLink;

    public EBook() {
    }

    public EBook(String title, String downloadLink) {
        super(title);
        this.downloadLink = downloadLink;
    }
}

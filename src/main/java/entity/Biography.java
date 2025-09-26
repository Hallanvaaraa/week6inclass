package entity;

import jakarta.persistence.*;

@Entity
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;

    @OneToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    public Biography() {}

    public Biography(String details, Author author) {
        this.details = details;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Author getAuthor() {
        return author;
    }
}

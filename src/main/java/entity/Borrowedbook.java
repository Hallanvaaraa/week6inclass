package entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Borrowedbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private Date borrowedDate;

    public Borrowedbook() {
    }

    public Borrowedbook(Student student, Book book) {
        this.student = student;
        this.book = book;
        this.borrowedDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public String toString() {
        return "Borrowedbook{id=" + id + ", student=" + student.getName() + ", book=" + book.getTitle() + ", borrowedDate=" + borrowedDate + "}";
    }
}

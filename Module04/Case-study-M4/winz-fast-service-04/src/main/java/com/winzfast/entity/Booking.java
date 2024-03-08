package com.winzfast.entity;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author ADMIN
 */
@Entity
@Table(name = "booking")

@Getter
@Setter
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "view_date")
    private Date viewDate;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Booking(Long id, LocalDate bookingDate, Date viewDate, String comment, User user, Product product) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.viewDate = viewDate;
        this.comment = comment;
        this.user = user;
        this.product = product;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getViewDate() {
        return viewDate;
    }

    public void setViewDate(Date viewDate) {
        this.viewDate = viewDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

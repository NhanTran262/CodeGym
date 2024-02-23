package com.winzfast.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author ADMIN
 */
public class BookingDTO {
    private Long id;
    private LocalDate bookingDate;
    private Date viewDate;
    private String comment;

    public BookingDTO(Long id, LocalDate bookingDate, Date viewDate, String comment) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.viewDate = viewDate;
        this.comment = comment;
    }

    public BookingDTO() {
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
}

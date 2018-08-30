package com.CarRental.CarRental.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {

    private Long id;
    private User user;
    private Car car;
    private Date rented_from;
    private Date rented_to;
    private boolean confirmed;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getRented_from() {
        return rented_from;
    }

    public void setRented_from(Date rented_from) {
        this.rented_from = rented_from;
    }

    public Date getRented_to() {
        return rented_to;
    }

    public void setRented_to(Date rented_to) {
        this.rented_to = rented_to;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }


}

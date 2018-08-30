package com.CarRental.CarRental.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CarType {

    private Long id;
    private String mark;
    private String model;

    private List<Car> cars;

    public CarType() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @OneToMany(mappedBy = "carType")
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", cars=" + cars +
                '}';
    }
}

package ita3.car.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private long id;
    @Column(name= "car_brand", nullable = false, length = 50)
    private String brand;

    @Column(name = "car_model", nullable = false, length = 60)
    private String model;

    @Column(name="rental_price_day")
    private double pricePrDay;

    @Column(name="max_discount")
    private int bestDiscount;

}

package org.vadym.demo.model;

import org.vadym.demo.WatchType;

import java.time.LocalDate;

public class Watch {
    private WatchType type;
    private String brand;
    private double price;
    private String color;
    private LocalDate arrivalDate;
    private String material;
    private boolean isWaterproof;

    Watch(WatchType type, String brand, double price, String color,
          LocalDate arrivalDate, String material, boolean isWaterproof) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.arrivalDate = arrivalDate;
        this.material = material;
        this.isWaterproof = isWaterproof;
    }

    //Getters and Setters
    public WatchType getType() {
        return type;
    }

    public void setType(WatchType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "type=" + type +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", material='" + material + '\'' +
                ", isWaterproof=" + isWaterproof +
                '}';
    }
}

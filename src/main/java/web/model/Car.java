package web.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private final String model;
    private final int series;
    private final double price;

    @Autowired
    public Car(String model, int series, double price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

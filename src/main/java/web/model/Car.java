package web.model;

public class Car {
    private String model;
    private int series;

    private double price;


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

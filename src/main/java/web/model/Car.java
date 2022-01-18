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

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

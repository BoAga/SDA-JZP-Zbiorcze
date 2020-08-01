package pl.sda.ex12;

import java.util.List;

public class Car {
    private String name;
    private String model;
    private double price;
    private int productionYear;
    private List<Manufacturer> manufacturers;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Car))
            return false;

        Car car = (Car) o;

        if (Double.compare(car.getPrice(), getPrice()) != 0)
            return false;
        if (getProductionYear() != car.getProductionYear())
            return false;
        if (!getName().equals(car.getName()))
            return false;
        if (!getModel().equals(car.getModel()))
            return false;
        return getManufacturers().equals(car.getManufacturers());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + getModel().hashCode();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getProductionYear();
        result = 31 * result + getManufacturers().hashCode();
        return result;
    }
}

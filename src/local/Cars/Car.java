package local.Cars;

import local.Interfaсe.Movable;
import local.Store.Purchaseble;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class Car implements Movable, Purchaseble {

    protected String name;
    protected int number;
    protected String color;
    protected Calendar dateRelease;
    protected Brand brand;
    protected int price;
    protected final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d MMMM yyyy");

    Car() {

    }

    Car(String name, int number, String color, int price, int year, int month, int day, Brand brand) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.dateRelease = new Calendar.Builder().setDate(year, month, day).build();

    }

    public abstract boolean move();

    public abstract boolean brake();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateRelease() {
        return DATE_FORMAT.format(dateRelease.getTime());
    }

    public void setDateRelease(Calendar dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Car{").append("name='").append(name).append("'")
                .append(", number=").append(number)
                .append(", color='").append(color).append("'")
                .append(", dateRelease=").append(dateRelease)
                .append(", brand=").append(brand)
                .append(", DATE_FORMAT=").append(DATE_FORMAT)
                .append('}');
        return out.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return number == car.number &&
                Objects.equals(name, car.name) &&
                Objects.equals(color, car.color) &&
                Objects.equals(dateRelease, car.dateRelease) &&
                brand == car.brand &&
                Objects.equals(DATE_FORMAT, car.DATE_FORMAT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, color, dateRelease, brand, DATE_FORMAT);
    }
}

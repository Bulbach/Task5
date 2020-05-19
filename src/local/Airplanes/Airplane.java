package local.Airplanes;

import local.Interfaсe.Movable;
import local.Store.Purchaseble;

import java.util.Objects;

public class Airplane implements Movable, Purchaseble {

    private String typeOfAircraft;
    private String model;
    private int maximumTake_OffWeight;
    private int rangeOfFlight;
    private int numberOfPassengers;
    private int price;
    private int minimumSpeedTake_Off;
    private int minimumRunwayLength;


    public Airplane(String typeOfAircraft, String model, int maximumTake_OffWeight, int rangeOfFlight, int numberOfPassengers
            , int minimumSpeedTake_Off, int minimumRunwayLength, int price) {
        this.typeOfAircraft = typeOfAircraft;
        this.model = model;
        this.maximumTake_OffWeight = maximumTake_OffWeight;
        this.rangeOfFlight = rangeOfFlight;
        this.numberOfPassengers = numberOfPassengers;
        this.minimumSpeedTake_Off = minimumSpeedTake_Off;
        this.minimumRunwayLength = minimumRunwayLength;
        this.price = price;
    }

    public void takeOff() {
        takeOff(-1, -1);

    }

    public void takeOff(int speed, int runwayLength) {
        if (speed == -1 && runwayLength == -1) {
            System.out.println("Параметры некоректны. Самолет не известен. Взлет запрещен!");
        } else if ((runwayLength * 0.9) >= minimumRunwayLength) {
            while (speed < minimumSpeedTake_Off) {
                speed += 50;
                if (speed >= minimumSpeedTake_Off) {
                    System.out.println("Ура мы взлетели");
                }
            }
        } else {
            System.out.println("Слишком короткая полоса");
        }
    }

    public void landing(int speed, int runwayLength) {
        if (runwayLength >= minimumRunwayLength) {
            while (speed > 0) {
                speed -= 10;
                if (speed <= 0) System.out.println("Ура мы сели!");
            }
        } else {
            System.out.println("Слишком короткая полоса");
        }
    }


    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaximumTake_OffWeight() {
        return maximumTake_OffWeight;
    }

    public void setMaximumTake_OffWeight(int maximumTake_OffWeight) {
        this.maximumTake_OffWeight = maximumTake_OffWeight;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getMinimumSpeedTake_Off() {
        return minimumSpeedTake_Off;
    }

    public void setMinimumSpeedTake_Off(int minimumSpeedTake_Off) {
        this.minimumSpeedTake_Off = minimumSpeedTake_Off;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    public void setMinimumRunwayLength(int minimumRunwayLength) {
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Airplane{")
                .append("typeOfAircraft='").append(typeOfAircraft).append("'")
                .append(", model='").append(model).append("'")
                .append(", maximumTake_OffWeight=").append(maximumTake_OffWeight)
                .append(", rangeOfFlight=").append(rangeOfFlight)
                .append(", numberOfPassengers=").append(numberOfPassengers)
                .append(", price=").append(price)
                .append(", minimumSpeedTake_Off=").append(minimumSpeedTake_Off)
                .append(", minimumRunwayLength=").append(minimumRunwayLength)
                .append('}');
        return out.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;
        Airplane airplane = (Airplane) o;
        return maximumTake_OffWeight == airplane.maximumTake_OffWeight &&
                rangeOfFlight == airplane.rangeOfFlight &&
                numberOfPassengers == airplane.numberOfPassengers &&
                price == airplane.price &&
                minimumSpeedTake_Off == airplane.minimumSpeedTake_Off &&
                minimumRunwayLength == airplane.minimumRunwayLength &&
                Objects.equals(typeOfAircraft, airplane.typeOfAircraft) &&
                Objects.equals(model, airplane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAircraft, model, maximumTake_OffWeight, rangeOfFlight, numberOfPassengers, price
                , minimumSpeedTake_Off, minimumRunwayLength);
    }

    @Override
    public String getName() {
        String name;
        return name = model;
    }
}

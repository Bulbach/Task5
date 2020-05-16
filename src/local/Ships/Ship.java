package local.Ships;

import local.Interfaсe.Movable;
import local.Store.Purchaseble;

import java.util.Objects;

public class Ship implements Movable, Purchaseble {

    private String typeOfShip;
    private String name;
    private int shipLength;
    private int shipWidth;
    private int draftShip;
    private int powerEngine;
    private int carryingCapacity;
    private int price;
    static boolean anchorInBoard = true;

    public Ship(String typeOfShip, String name, int shipLength, int shipWidth, int draftShip
            , int powerEngine, int carryingCapacity, int price) {
        this.typeOfShip = typeOfShip;
        this.shipLength = shipLength;
        this.shipWidth = shipWidth;
        this.name = name;
        this.draftShip = draftShip;
        this.powerEngine = powerEngine;
        this.carryingCapacity = carryingCapacity;
        this.price = price;
    }

    public void raiseTheAnchor(int speed) {
        if (anchorInBoard && speed <= 2) {
            System.out.println("Условия подходящие. Можно бросить якорь");
            anchorInBoard = false;
        } else {
            System.out.println("Слишком быстро. Притормози!");
        }
    }


    public void lowerAnchor() {
        if (anchorInBoard) {
            System.out.println("Якорь за бортом. Поднять якорь ");
        } else {
            System.out.println("Не тупим. Полный вперед!");
        }
    }


    public String getTypeOfShip() {
        return typeOfShip;
    }

    public void setTypeOfShip(String typeOfShip) {
        this.typeOfShip = typeOfShip;
    }

    public float getShipLength() {
        return shipLength;
    }

    public void setShipLength(int shipLength) {
        this.shipLength = shipLength;
    }

    public float getShipWidth() {
        return shipWidth;
    }

    public void setShipWidth(int shipWidth) {
        this.shipWidth = shipWidth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDraftShip() {
        return draftShip;
    }

    public void setDraftShip(int draftShip) {
        this.draftShip = draftShip;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
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
        out.append("Ship{")
                .append(", Name =").append(name)
                .append("typeOfShip='").append(typeOfShip).append("'")
                .append(", shipLength=").append(shipLength)
                .append(", shipWidth=").append(shipWidth)
                .append(", draftShip=").append(draftShip)
                .append(", powerEngine=").append(powerEngine)
                .append(", carryingCapacity=").append(carryingCapacity)
                .append(", price=").append(price)
                .append('}');
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ship)) return false;
        Ship ship = (Ship) o;
        return shipLength == ship.shipLength &&
                shipWidth == ship.shipWidth &&
                draftShip == ship.draftShip &&
                powerEngine == ship.powerEngine &&
                carryingCapacity == ship.carryingCapacity &&
                price == ship.price &&
                Objects.equals(typeOfShip, ship.typeOfShip) &&
                Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfShip, name, shipLength, shipWidth, draftShip, powerEngine, carryingCapacity, price);
    }


}

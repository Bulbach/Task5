package local;

public class FamilyCar extends Car {

    private String carBodyType;
    private String engineType;
    private int luggageBootVolume;
    private int numberOfSeats;
    private int price;
    private boolean childSeat;

    public FamilyCar(String name, int number, String color, int year, int month, int day, Brand brand, String carBodyType
            , String engineType, int luggageBootVolume, int numberOfSeats, int price) {
        super(name, number, color, day, month, year, brand);
        this.carBodyType = carBodyType;
        this.engineType = engineType;
        this.luggageBootVolume = luggageBootVolume;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.childSeat = false;
    }

    public void installationOfAChildSeats() {
        if (childSeat) {
            System.out.println("Перевозка не безопасна. Устанивите детское сиденье ");
        } else {
            childSeat = true;
            System.out.println("Все в порядке можно ехать");
        }
    }

    public void foldSeat() {

        for (; numberOfSeats > 5; numberOfSeats--) {
            luggageBootVolume += 75;
        }
        System.out.println("Место в багажнике стало : " + luggageBootVolume);

    }

    public void unFoldSeat() {
        for (; numberOfSeats < 8; numberOfSeats++) {
            luggageBootVolume -= 75;
        }
        System.out.println("Место в багажнике стало : " + luggageBootVolume);
    }


    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getLuggageBootVolume() {
        return luggageBootVolume;
    }

    public void setLuggageBootVolume(int luggageBootVolume) {
        this.luggageBootVolume = luggageBootVolume;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
    public boolean brake() {
        return false;
    }
}

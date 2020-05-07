package local;

public class Truck extends Car{

    private int carryingCapacity;
    private int enginePower;
    private int fuelTankVolume;
    private int price;
    private boolean loaded;

    public Truck(String name, int number, String color,int year, int month, int day, Brand brand, int carryingCapacity
                 , int enginePower,int fuelTankVolume,int price){
        super(name, number, color, day, month, year, brand);
        this.carryingCapacity = carryingCapacity;
        this.enginePower = enginePower;
        this.fuelTankVolume = fuelTankVolume;
        this.price = price;
        this.loaded = false;
    }

    public void load(){
        if (loaded) {
            System.out.println("Машина загружена, погрузка невозможна");
        }
        else {
            loaded = true;
            System.out.println("Машина порожняя,погрузка начата");
        }
    }

    public void unLoad(){
        if (loaded){
            System.out.println("Машина загружена , приступаем к выгрузке");
            loaded = false;
        }
        else {
            System.out.println("Машина порожняя. Выгружать нечего");
        }
    }


    public void getCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }

    public int setCarryingCapacity(){
        return carryingCapacity;
    }

    public void getEnginePower(int enginePower){
        this.enginePower = enginePower;
    }

    public int setEnginePower(){
        return enginePower;
    }

    public void getFuelTankVolume(int fuelTankVolume){
        this.fuelTankVolume = fuelTankVolume;
    }

    public int setFuelTankVolume(){
        return fuelTankVolume;
    }

    public void getPrise(int price){
        this.price = price;
    }

    public int setPrice(){
        return price;
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

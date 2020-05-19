package local;

import local.Airplanes.Airplane;
import local.Cars.Brand;
import local.Cars.FamilyCar;
import local.Cars.Truck;
import local.Interfaсe.Movable;
import local.Ships.Ship;
import local.Store.Store;

import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Truck volvoFN12 = new Truck("FN12", 2312, "Red", 2012, Calendar.AUGUST, 20, Brand.VOLVO
                , 8500, 490, 1180, 300000);
        System.out.println(volvoFN12);
        volvoFN12.load();
        volvoFN12.load();
        volvoFN12.unLoad();
        volvoFN12.unLoad();

        FamilyCar peugeotTraveler = new FamilyCar("Трэвелер", 38150, "Navy_Blue", 2017, Calendar.APRIL
                , 26, Brand.PEUGEOT, "Minivan", "disel", 603, 8, 50000);
        System.out.println(peugeotTraveler);
        peugeotTraveler.foldSeat();
        peugeotTraveler.installationOfAChildSeats();
        peugeotTraveler.unFoldSeat();

        Movable Boeing = new Airplane("Пассажирский", "Boeing747-400", 362875
                , 13430, 660, 270, 3020, 380_000_000);
        System.out.println((Airplane) Boeing);
        ((Airplane) Boeing).takeOff(0, 3500);
        ((Airplane) Boeing).landing(970, 3200);
        ((Airplane) Boeing).takeOff();

        Ship dryCargoShip = new Ship("Сухогруз", "BergeStahl", 342, 63, 23
                , 27610, 365000, 115_000_00);
        System.out.println(dryCargoShip);
        dryCargoShip.raiseTheAnchor(5);
        dryCargoShip.lowerAnchor();
        dryCargoShip.raiseTheAnchor(2);
        dryCargoShip.lowerAnchor();

        Truck volvoFH16 = new Truck("VolvoFH16", 30219, "Red", 2012, 12, 20, Brand.VOLVO
                , 88000, 600, 900, 136000);
        Truck[] experiment = new Truck[]{(Truck) volvoFH16, volvoFN12};
        Store<Truck> VolvoTrucks = new Store<>(500_000, experiment);


        System.out.println("Денег в кассе магазина: " + VolvoTrucks.getAmountOfMoneyInBox());

        System.out.println("Список товаров: ");
        VolvoTrucks.printProduct(experiment);

        System.out.println("Желаете этот товар?");
        VolvoTrucks.purchase(0, 200_000);
        VolvoTrucks.productDelete(0);
        System.out.println("Новый список: " + Arrays.toString(experiment));

        System.out.println("Приобретем этот тавар?");
        VolvoTrucks.sell(volvoFH16, 100_000);
        VolvoTrucks.productStand(volvoFH16);

        System.out.println("Новый список");
        VolvoTrucks.printProduct(experiment);


    }
}

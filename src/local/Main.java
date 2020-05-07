package local;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

      Truck volvoFN12 = new Truck( "FN12", 2312,"Red",2012, Calendar.AUGUST,20,Brand.VOLVO
      ,8500,490,1180,300000);
      volvoFN12.load();
      volvoFN12.load();
      volvoFN12.unLoad();
      volvoFN12.unLoad();
      FamilyCar peugeotTraveler = new FamilyCar("Трэвелер",38150,"Navy_Blue",2017,Calendar.APRIL
      ,26,Brand.PEUGEOT,"Minivan","disel",603,8,50000);
      peugeotTraveler.foldSeat();
      peugeotTraveler.installationOfAChildSeats();
      peugeotTraveler.unFoldSeat();
      Movable Boeing = new Airplane("Пассажирский","Boeing747-400",362875
              ,13430,660,270,3020,380_000_000);
      ((Airplane)Boeing).takeOff(0,3500);
      ((Airplane)Boeing).landing(970,3200);
    }
}

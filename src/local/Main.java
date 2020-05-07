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
    }
}

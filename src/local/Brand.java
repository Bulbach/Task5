package local;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public enum Brand {

    VOLVO("Вольво","Швеция", 1927,Calendar.APRIL,14),
    TOYOTA("Тойота","Япония",1937,Calendar.AUGUST,28),
    HONDA("Хонда","Япония",1948, Calendar.SEPTEMBER,24),
    DODGE("Додж","США",1900,Calendar.NOVEMBER,14),
    PEUGEOT("Пежо","Франция",1896,Calendar.APRIL,2);

    private final String NAME;
    private final String COUNTRY;
    private final Calendar FOUNDATION;

    Brand(String NAME, String COUNTRY, int year, int month, int day) {
        this.NAME = NAME;
        this.COUNTRY = COUNTRY;
        this.FOUNDATION = new Calendar.Builder().setDate(year, month, day).build();
    }


    public String getNAME() {
        return NAME;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public String getFOUNDATION() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(FOUNDATION.getTime());
    }


}

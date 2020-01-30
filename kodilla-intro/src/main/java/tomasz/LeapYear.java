package tomasz;

public class LeapYear {

    int year;

    public LeapYear(int year) {

        this.year = year;
    }

    public boolean isLeap() {

        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);

    }

}
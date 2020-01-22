package tomasz;

public class LeapYear {

    int leapYear;

    public LeapYear(int leapYear) {
        this.leapYear = leapYear;
    }

    public boolean checkLeapYear() {
        if ((leapYear % 400 == 0) || (leapYear % 4 == 0) && (leapYear % 100 != 0)) {
            return true;
        } else
            return false;
    }
}


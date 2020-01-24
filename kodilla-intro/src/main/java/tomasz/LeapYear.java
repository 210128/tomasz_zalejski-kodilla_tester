package tomasz;

public class LeapYear {

    int leapYear;

    public LeapYear(int leapYear) {
        this.leapYear = leapYear;
    }

    public boolean checkLeapYear() {
        /*TODO: REVIEW kdrzazga
         * 'napisz metodę, która na podstawie przekazanego roku zwróci wartość boolean z informacją...'
         *  please pass a year as a parameter to the method
         *  suggested method name: isLeap(int year)
         */
        if ((leapYear % 400 == 0) || (leapYear % 4 == 0) && (leapYear % 100 != 0)) {
            return true;
        } else
            return false;

        /*TODO: REVIEW kdrzazga
        *  Pls simplify. "if ... return true" is not a clean code
        *  return (leapYear % 400 == 0) || (leapYear % 4 == 0) && (leapYear % 100 != 0)
        *  looks better*/
    }
}


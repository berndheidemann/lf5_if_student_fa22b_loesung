package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (day > 29) {
                return false;
            }
            if (day == 29 && !isLeapYear(year)) {
                return false;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                return false;
            }
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

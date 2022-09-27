package maexchen;

public class Maexchen {

    public int calculatePoints(int throw1, int throw2) {
        if (throw1 < 1 || throw1 > 6 || throw2 < 1 || throw2 > 6) {
            return -1;
        }
        if (throw1 == 1 && throw2 == 2 || throw1 == 2 && throw2 == 1) {
            return 1000;
        }
        if (throw1 == throw2) {
            return 100 * throw1;
        }
        if (throw1 > throw2) {
            return 10 * throw1 + throw2;
        }
        return 10 * throw2 + throw1;

    }
}

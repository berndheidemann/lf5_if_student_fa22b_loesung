package weather;

import java.util.Scanner;

public class Weather {
    // "Heute ist ein schöner Tag"  ----      24.0 oder 18.2 oder 10.9, etc.
    public String evaluateWeather(double temperature) {
        if (temperature < 22) {
            return "Heute ist es nicht so schön!";
        } else {
            return "Heute ist ein schöner Tag!";
        }
    }
}

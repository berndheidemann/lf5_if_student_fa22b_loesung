package weather;

import java.util.Scanner;

public class WeatherUI {

    public static void main(String[] args) {
        System.out.print("Geben Sie eine Temperatur ein: ");
        Scanner scan = new Scanner(System.in);
        double temperatureInput = scan.nextDouble();

        // Weather-Objekt instanziieren "basteln"
        Weather w = new Weather();

        // Methode aufrufen und Temperatur übergeben
        String response = w.evaluateWeather(temperatureInput);

        System.out.println(response);

    }
}

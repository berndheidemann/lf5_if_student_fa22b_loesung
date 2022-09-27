package calculator;

public class Calculator {

    public String calculate(double number1, double number2, char operator) {

        String response = "" + number1;
        if (operator == '+') {
            response += " + " + number2 + " = " + (number1 + number2);
        } else if (operator == '-') {
            response += " - " + number2 + " = " + (number1 - number2);
        } else if (operator == '*') {
            response += " x " + number2 + " = " + (number1 * number2);
        } else if (operator == '/') {
            if (number2 == 0) {
                response = "Division durch 0 nicht möglich!";
            } else {
                response += " : " + number2 + " = " + (number1 / number2);
            }
        } else {
            response = "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
        }
        return response;

    }
}


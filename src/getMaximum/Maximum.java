package getMaximum;

public class Maximum{
    public int getMaximum(int number1, int number2, int number3){
        int maximum = number1;
        if (number2 > maximum) {
            maximum = number2;
        }
        if (number3 > maximum) {
            maximum = number3;
        }
        return maximum;
    }
}


import numbers.Calculator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int number = new Random().nextInt(40) - 20;

        System.out.printf("Generated number %d is%s prime", number, (Calculator.isPrime(number) ? "" : " not"));
    }
}
package numbers;

public class Calculator {

    public static boolean isPrime(int number) {
        int iterator = (int) Math.sqrt(number);

        return isPrime(number, iterator);
    }

    private static boolean isPrime(int number, int iterator) {
        if(number <= 1) return false;

        if(iterator == 1) return true;

        return (number % iterator != 0) && isPrime(number, iterator - 1);
    }
}

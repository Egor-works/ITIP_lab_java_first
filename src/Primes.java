// программа находящая простые числа
public class Primes {
    public static void main(String[] args) {
        for(int n = 2; n <= 100; n++) {
            if (IsPrime(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    // метод проверяющий является ли число простым
    public static boolean IsPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
        }
        return true;
    }
}
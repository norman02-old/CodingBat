package recursion;

/**
 * Computes the factorial of a number n
 * @author John Norman
 * @version 2020-2-4
 */
public class Factorial {
    /**
     * find the factorial of n
     * @param n integer to factorial
     * @return the factorial of n
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }

}

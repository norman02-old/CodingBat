package recursion;

public class SumDigits {
    public int sumDigits(int n) {
        if (n / 10 == 0) return n;
        return rightMostDigit(n) + sumDigits(n/10);
    }

    private int rightMostDigit(int n) {
        return n % 10;
    }
}

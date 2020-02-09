package recursion;

public class CountEight {
    public int count8(int n) {
        int count = 0;
        int digit = n % 10;
        if (digit == 8) {
            count++;
            if (rightDigit(n) == 8) {
                count++;
                
            }
        }
        if (n / 10 == 0)
            return count;
        return count + count8(n / 10);
    }

    private int rightDigit(int n) {
        return (n / 10) % 10;
    }
}

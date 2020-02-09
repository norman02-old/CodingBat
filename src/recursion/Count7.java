package recursion;

public class Count7 {
    public int count7(int n) {
        int count = 0;
        int digit = n % 10;
        if (digit == 7) count++;
        if (n / 10 == 0) return count;
        return count + count7(n / 10);
    }
}

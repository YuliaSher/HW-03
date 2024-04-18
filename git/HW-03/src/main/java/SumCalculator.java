public class SumCalculator {

    public int sum(int n) {
        int result = 0;

        if (n > 0) {
            for (int i = n; i > 0; i--) {
                result = result + i;
            }
        }else {
            throw new IllegalArgumentException();
        }
        return result;
    }
}

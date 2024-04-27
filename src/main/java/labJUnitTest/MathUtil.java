package labJUnitTest;

public class MathUtil {
    public static Double exp(Double x) {
        Double sum = 1d;
        double epsilon = 0.000001;
        double x_ = x;
        int n = 1;
        while (x_ > epsilon){
            x_ = (x*x)/n;
            n++;
            sum += x;
        }
        return sum;
    }
}

package labParallelStream;

public class SumPart extends Thread {
    private double a;
    private  double b;
    private  double sum = 0;
    private Double func(Double x){
        return Math.sin(x * x);
    }
    public static  final  int N = 100;

    @Override
    public void run() {
        double h = (b - a) / N;
        for (int i = 0; i < N; i++){
            sum += h * func(a + i * h + h/2);
        }
    }

    public SumPart(double a, double b) {
        this.a = a;
        this.b = b;
        this.sum = sum;
    }

    public double getPartSum(){
        return sum;
    }
}

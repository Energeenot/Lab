package Lab2;


public class task3 {
    public static void main(String[] args) {
        System.out.printf("%.2f", integralkv(0, 1, x -> { return Math.pow(Math.E, Math.sin(x));}));
        }


    public static double integralkv(double a, double b, Function function){
        double area = 0;
        double h = 0.0001;
        for (int i = 0; i < (b-a)/h; i++) {
            area += h * function.function(a + i * h);
        }
        return area;
    }
}
interface Function{
    public double function (double x);
}
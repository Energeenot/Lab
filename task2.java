package Lab2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        double n = scanner.nextDouble();
        double p = 1;
        double result = 0;
        for ( double m = 2; m<= n; m++){
            result += Math.pow(Math.sin(p + m), 2);
        }
        System.out.println(result);
    }
}

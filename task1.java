package Lab2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int i = 1;
        while (i <= n){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            String result = getResult(x, y);
            System.out.println(result);
            if (result == "Попало"){
                count++;
            }
            if (i == n){
                System.out.println("Количество попавших точек " + count);
            }
            i++;
        }
    }
    public static String getResult(double x, double y){
        if ((x >= -4 && x*x + y*y <= 64 && y < 8-2*x) || (y > 8-2*x && y < 0 && x*x + y*y <= 64)){
            return "Попало";
        }
        else{
            return "Не попало";
        }
    }
}
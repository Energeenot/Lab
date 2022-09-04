package Lab2;

import java.util.Scanner;

public class clwt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                int i = 0;
                double f;
                while (i<=100){
                    System.out.println(i);
                    f = 1.8 * i + 32;
                    System.out.println(f);
                    i += 10;
                }
                break;
            case "b":
                double d = 0;
                do {
                    System.out.println(Math.log10(d+1) * Math.sin(d));
                    d += 0.5;
                }while (d <= 5);
                break;
            case "c":
                for (double j= 0; j < 2 * Math.PI; j += Math.PI / 6){
                    System.out.println(Math.cos(j));
                }
                break;
            case "d":
                for (double k = -1.5; k <= 1.5; k += 0.25){
                    if (k > 1){
                        System.out.println(1 + Math.sqrt(Math.abs(Math.cos(k))));
                    }
                    else if (-0.5 <= k && k <= 1){
                        System.out.println(k+1);
                    }
                    else if (k < -0.5){
                        System.out.println(1-k*k);
                    }
                }
                break;
        }
    }
}
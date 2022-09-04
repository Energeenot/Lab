package Lab2;

import java.util.Scanner;

public class clwt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        double sum = 0;
        switch (letter){
            case "a":
                System.out.println("Введите число");
                int n = scanner.nextInt();
                for (int i = 1; i<=n;i++){
                    sum += 1.0/(i*2);
                }
                System.out.println(sum);
                break;
            case "b":
                System.out.println("ничего не понял");
        }
    }
}

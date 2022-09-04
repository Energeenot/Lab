package Lab2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        int sum2 = 0;
        int count = 0;
        int var = scanner.nextInt();
        switch (var){
            case 1:
                while (i <= n) {
                    i++;
                    int f = scanner.nextInt();
                    if (f % 100 == 22) {
                        sum += f;
                    }
                }
                System.out.println(sum);
                break;
            case 2:
                while (i <= n) {
                    int f = scanner.nextInt();
                    if (f % 5 == 0){
                        System.out.println(i);
                    }
                    i++;
                }
                break;

            case 3:
                while (i <= n) {
                    i++;
                    int f = scanner.nextInt();
                    while (f >= 100);{
                        f /= 10;
                    }
                    if (f == 44){
                        sum2 += f;
                }
                }
                System.out.println(sum2);
                break;
        }

    }
}

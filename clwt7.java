package Lab2;

import java.util.Scanner;

public class clwt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int count = 0;
        int element = 5;
        while (element != 0){
            element = scanner.nextInt();
            if (element > max){
                max = element;
                count = 1;
            }
            else if (element == max){
                count += 1;
            }
        }
        System.out.println(count);
    }
}

package Lab2;

import java.util.Scanner;

public class clwt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа будет выводить числа пока вы не откажитесь от ввода, отказ от ввода '1', продолжить '0'");
        int count = 0;
        for (int i = 0; i< 100000000; i++){
            System.out.println(i);
            if ((i | 1) > i){
                count += 1;
            }
            System.out.println("Продолжить?");
            int answer = scanner.nextInt();
            if (answer == 1){
                System.out.println("Количество чётных " + count + "(ноль тоже чётный элемент)");
                break;
            }
        }
    }
}

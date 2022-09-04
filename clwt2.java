package Lab2;

import java.util.Scanner;

public class clwt2 {
    public static void main(String[] args) {
        int[] array;
        int count = 0;
        int sum = 0;
        int naim = 100000000;
        Scanner scanner = new Scanner(System.in);
        array = new int[7];
        System.out.println("Введите подпункт, который нужно выполнить");
        String letter = scanner.nextLine();
        switch (letter){
            case "a":
                System.out.println("Введите 7 чисел");
                for (int i = 0;  i < 7; i++){
                    array[i] = scanner.nextInt();
                    if (array[i] < 0){
                        count += 1;
                    }
                }
                System.out.println("Количество отрицательных чисел " + count);
                break;
            case "b":
                System.out.println("Введите 7 чисел");
                for (int i = 0;  i < 7; i++) {
                    array[i] = scanner.nextInt();
                    if (array[i] > 9) {
                        sum += array[i];
                    }
                }
                System.out.println("Сумма двухзначных чисел " + sum);
                break;
            case "c":
                System.out.println("Введите 7 чисел");
                for (int i = 0;  i < 7; i++){
                    array[i] = scanner.nextInt();
                    if (i >= 1){
                        if (array[i-1]<array[i] && array[i-1]<= naim){
                            naim = array[i-1];
                        }
                        else if (array[i-1]>array[i] && array[i]<0){
                            naim = array[i];
                        }
                    }
                }
                System.out.println("Наименьшее число " + naim);
                break;
        }

    }
}

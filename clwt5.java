package Lab2;

import java.util.Scanner;

public class clwt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вершин");
        int n = scanner.nextInt();
        int x;
        int y;
        int[] arrx = new int[n];
        int[] arry = new int[n];
        double P = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Введите координаты вершины, сначала х потом у");
            arrx[i] = scanner.nextInt();
            arry[i] = scanner.nextInt();
            if (i>=1){
                P += Math.sqrt(Math.pow((arrx[i] - arrx[i-1]), 2) + Math.pow(arry[i] - arry[i-1], 2));
            }
        }
        System.out.println(P);
    }
}

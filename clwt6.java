package Lab2;

public class clwt6 {
    public static void main(String[] args) {
        String[][] matrix = new String[8][8];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (i % 2 == 0 && j % 2 == 0){
                    matrix[i][j] = "0";
                }
                if (i % 2 != 0 && j % 2 != 0){
                    matrix[i][j] = "0";
                }
                if (i % 2 != 0 && j % 2 == 0){
                    matrix[i][j] = "*";
                }
                if (i % 2 == 0 && j % 2 != 0){
                    matrix[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

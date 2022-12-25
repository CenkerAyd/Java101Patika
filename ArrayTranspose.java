public class ArrayTranspose {
    public static void main(String[] args)
    {
        int[][]matrix={{1,2,3},{4,5,6}};
    display2D(matrixTranspose(matrix));


    }
    static  int[][]matrixTranspose(int[][]matrix){
        int[][] result=new int[matrix[0].length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return  result;
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }
    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }
}

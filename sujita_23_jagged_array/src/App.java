public class App {

    public static void main(String[] args) {
        int [][] matrix=new int[][] {{1,2,3},{4,5,6,8},{9,10}};//jagged array has non uniform length
        for (int i = 0; i < matrix.length; i++) {
            int sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] +"");
                sum+=matrix[i][j];
            }
            System.out.println("Sum of the row:" +sum);
        }
    }
}
public class App {

    public static void main(String[] args) {
        int [][]matrix=new int[][] {{2,3,5},{1,4,9,5},{2,4,5}};
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] +"");
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum of the elements:" +sum);
    }
}
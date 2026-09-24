import java.util.Scanner;
public class rowsum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int [][] matrix= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];

            }
            System.out.println("row sum is"+" "+sum);
        }
        
    }
    
}

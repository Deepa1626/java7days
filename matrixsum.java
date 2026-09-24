import java.util.Scanner;
public class matrixsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();

        int [][] arr= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();

            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
        }
        System.out.println("sum of matrix"+sum);

    }
    
}

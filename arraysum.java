import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int [] arr = new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int e:arr){
            sum+=e;

        }
        System.out.println("sum of element"+sum);

    }
    
}

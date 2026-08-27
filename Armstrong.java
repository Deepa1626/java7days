import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original=n;
        int count=0;
        while(n >0){
            count ++;
            n/=10;
        }
        double sum=0;
        while(original >0){
            int digit = original % 10;
            sum+=Math.pow(digit,count);
            original/=10;

        }
        System.out.println(sum);


        
    }
}

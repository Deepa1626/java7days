import java.util.Scanner;
public class sumdigit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        while(num > 0){
            int digit = num % 10 ;
            sum +=digit;
            num/=10;
        }
        System.out.println(sum);

        
    }
    

}
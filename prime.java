import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        boolean IsPrime = true;
        if(n<2){
            IsPrime=false;

        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n % i==0){
                    IsPrime=false;
                    break;
                }
            }
        }
        if(IsPrime){
            System.out.println("Is prime number");
        }
        else{
            System.out.println("Is not prime number");
        }
    }
    
}

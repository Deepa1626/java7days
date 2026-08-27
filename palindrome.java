import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
    int n = in.nextInt();
    int original=n;
    int reverse=0;
    while(n>0){
        int digit = n % 10;
        reverse=reverse*10+ digit;
        n/=10;
    }
    if(original==reverse){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
        
    }
}
    
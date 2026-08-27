import java.util.Scanner;
public class Frequencyofdigit {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    n=Math.abs(n);
    int [] feq=new int[10];
    while(n>0){
        int digit = n %10;
        feq[digit]++;
        n/=10;
    }
    for(int i=0;i<10;i++){
        if(feq[i]>0){
            System.out.println("Digit"+i+":"+feq[i]);
        }
    }

        
    }
    
    
}

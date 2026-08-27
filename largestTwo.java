import java.util.Scanner;
public class largestTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstnum= in.nextInt();
        int secondnum=in.nextInt();
        if(firstnum>secondnum){
            System.out.println(firstnum+"Is largest of two");
        }
        else{
            System.out.println(secondnum+"Is largest of two");
        }

        
    }
    
}

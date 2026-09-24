import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int [] arr = {10,20,30,40,50};
        int target=s.nextInt();
        

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println("element found at index"+i);
                break;
            }
        }
    }
    
}

public class seclar {
    public static void main(String[] args) {
        int [] arr={10,20,5,45,30};
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>large){
                secondlarge=large;
                large=x;
            }
            else if(x>secondlarge && x != large){
                secondlarge=x;
            }
        }
        System.out.println("second largest element"+" "+secondlarge);
    
    }
    
}

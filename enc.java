public class enc {
    private String name;
        private int marks;
        public void setName(String name){
            this.name=name;
        } 
        public String getName(){
            return name;
        }
        public void setMarks(int marks){
            if(marks>=00 && marks<=100){
                this.marks=marks;
            }
        }
        public int getMarks(){
            return marks;
        }
    public static void main(String[] args) {
        
        enc s= new enc();
        s.setName("Deepa");
        s.setMarks(-500);
        System.out.println(s.getName());
        System.out.println(s.getMarks());

    }
    
}

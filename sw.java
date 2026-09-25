class Animal{
    String name="Animal";
}
class Dog extends Animal{
    String name="DOg";
    void Display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class sw {
    public static void main(String[] args) {
        Dog D= new Dog();
        D.Display();
        
    }
    
}

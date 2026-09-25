  class Animal{
        void eat(){
            System.out.println("Eating");
        }
    }
     class Dog extends Animal{
        void bark(){
            System.out.println("barking");
        }
    }
public class inheri {
   

    public static void main(String[] args) {
        Dog D = new Dog();
        D.eat();
        D.bark();

        
    }
    
}

package SingleInheritance;

public class Cat extends Animal {

    public void  display(){
        System.out.println("I am " + name);
    }

    public void food(){
        System.out.println("I can eat anything apart from grass");
    }
    public void sound(){
        System.out.println("I can " + sound);
    }
}

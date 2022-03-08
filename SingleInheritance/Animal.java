package SingleInheritance;

public class Animal {
    protected String name;
    public String sound;

    public void Youngones(){
        String setname =  "offspring";
        System.out.println(setname + "Is the name of my youngone");
    }
    
    public void food(){
        System.out.println("I can eat");
    }

    public void sound(){
        System.out.println("I can make a sound");
    }
}

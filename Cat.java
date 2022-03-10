package MethodOveroading;

public class Cat extends Animal implements Food {

    public void Foodtype(){
        System.out.println("The cat eats both meat and vegetables"); 
    }

    public void animalSound (String Sound){
        System.out.println("The   cat " + Sound);
    }

    
}

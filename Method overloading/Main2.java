
package MethodOveroading;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        //This code prompts the user to enter the sound a cow makes.
        System.out.print("Which sound does a cow make?:");

        Scanner sound= new Scanner(System.in);  
        String cow1= sound.nextLine();    

                //Owino is an object of the class Cow i.e Owino is the name of a cow.
                Cow Owino = new Cow();
                Owino.animalSound(cow1);



        //This code prompts the user to enter the sound a pig makes.
        System.out.print("Which sound does a pig make?:");

        Scanner sound1= new Scanner(System.in);  
        String pig1= sound1.nextLine();    

                //Anguro is an object  of the class Pig i.e name of  a pig.
                Pig Anguro= new Pig();
                Anguro.animalSound(pig1);



        //This code prompts the user to enter the sound a cat makes.
        System.out.print("Which sound does a cat make?:");

        Scanner sound2= new Scanner(System.in);  
        String Cat1= sound1.nextLine();  
        
                //cat1 is an object of the class Cat i.e cat1 is the name of a cat
                Cat cat1 = new Cat();
                cat1.Foodtype();
                cat1.animalSound(Cat1);



    }
    
}

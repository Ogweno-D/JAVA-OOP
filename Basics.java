import java.util.Scanner;

public class Basics {

    //Program that prompts the user's input (name)
    Scanner Name= new Scanner(System.in);
    String name= Name.nextLine();

    //Program that prompts the user to enter the age.
    Scanner Age= new Scanner(System.in);
    int age= Age.nextInt();

    //Program that prompts the user to enter the YearOfBirth.
    Scanner YOB= new Scanner(System.in);
    int YearOfBirth= YOB.nextInt();


   //The main program.
    public static void main(String[] args) {

    System.out.println("The following are the credentials of  a certain campus student.");
            Basics Student1 = new Basics();//Creates an object student of the class Basics.

                System.out.println("The  name of the student is  " + Student1.name);//Prints out the student's name
                System.out.println("The age of " + Student1.name + " is: " + Student1.age);//Prints out /displays the students's age.  
                System.out.println("The student was born in : " + Student1.YearOfBirth);//Prints out/ Displays the year the Student was born in.

    }

    
}

import java.util.Scanner;

public abstract class pettingZoo 
{
   
    String[] animals = {"Capybara", "Giraffe", "Goat"}; 
    String petSelection; 

    public abstract void makeNoise();
    

public void zooWelcome()    
{
    Boolean petting = true; 
    Scanner input = new Scanner(System.in);
do
{
    System.out.println("Welcome to the petting zoo!\nWould you like to see our animals? (Y/N)"); 
    String answer = input.nextLine(); 

    if (answer.toLowerCase().trim().equals("y"))
    {
        System.out.println("Choose to pet any one of our animals! (Enter the name of the animal)");
        for (int i = 0; i < animals.length; i++)
        {      
            System.out.println( (i +1) + ": " + animals[i]);
        }
        System.out.println();
    }
    else
    {
        petting = false;
        System.out.println("Goodbye!");
        break;
    }

    petSelection = input.nextLine();
    pet(petSelection);
    System.out.println();
} while(petting);

    input.close();
}
            
public void pet (String petAnimal)
{
    petSelection = petAnimal;
    
    switch (petSelection.toLowerCase().trim())
    {
        case "capybara":
            Capybara capy = new Capybara();
            capy.makeNoise();
            break;

        case "giraffe":
            Giraffe jeffy = new Giraffe();
            jeffy.makeNoise();
            break;

        case "goat":
            Goat LeBron = new Goat();
            LeBron.makeNoise();
            break;
        default:
            System.out.println("Animal not recognized.");
    }
}
    
    
static class Capybara extends pettingZoo
{
    public void makeNoise() 
    {
        System.out.println("Squeak! Squeak!");
    }
}
    
    
static class Giraffe extends pettingZoo
{
    public void makeNoise() 
    {
        System.out.println("snort...");
    }
}
    
static class Goat extends pettingZoo
{

    public void makeNoise() 
    {
        System.out.println("bleat...maaa");
    }
}
    
}

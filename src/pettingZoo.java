import java.util.Scanner;

public abstract class pettingZoo 
{
   
    String[] animals = {"Capybara", "Giraffe", "Goat"}; 
    String petSelection; 

    public abstract void makeNoise();
    

public void zooWelcome()    
{
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the petting zoo!\nWould you like to see our animals? (Y/N)"); 
    String answer = input.nextLine(); 

    if (answer.toLowerCase().trim() == "Y")
    {
        System.out.println("Choose to pet any one of our animals! (Enter the name of the animal)");
        for (int i = 0; i < animals.length; i++)
        {      
            System.out.println(i + ": " + animals[i]);
        }
        System.out.println();
    }
    else
    {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    petSelection = input.nextLine();
}
            
public void pet (String petAnimal)
{
    petSelection = petAnimal;
    
    switch (petSelection.toLowerCase().trim())
    {
        case "capybara":
            Capybara capy = new Capybara();
            capy.makeNoise();

        case "giraffe":
            Giraffe jeffy = new Giraffe();
            jeffy.makeNoise();

        case "goat":
            Goat LeBron = new Goat();
            LeBron.makeNoise();
    }
}
    
    
static class Capybara extends pettingZoo
{
    public void makeNoise() 
    {
        
    }
}
    
    
static class Giraffe extends pettingZoo
{
    public void makeNoise() 
    {
        
    }
}
    
static class Goat extends pettingZoo
{

    public void makeNoise() 
    {
        
    }
}
    
}

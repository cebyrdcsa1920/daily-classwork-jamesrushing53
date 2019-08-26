import java.util.Scanner;

public class TestClass
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is you favorite food? ");
        String food = keyboard.nextLine();
        System.out.println("Your favorite food is " + food);
        keyboard.close();
    }
}
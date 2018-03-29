import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int input;

        System.out.printf("%s", "Please enter a number from 1 to 3: ");

        input = reader.nextInt();

        if (input < 1 || input > 3)
        {
            do
            {
                System.out.printf("%s", "Please enter a number from 1 to 3: ");
                input = reader.nextInt();
            } while (input < 1 || input > 3);
        }

        Random rand = new Random();
        int ranVal = rand.nextInt(3) + 1;
        System.out.printf("%s%d\n", "The user value is: ", input);
        System.out.printf("%s%d\n", "The random value is: ", ranVal);

        if (input == ranVal)
        {
            System.out.printf("You guessed correctly\n");
        }
        else
        {
            System.out.printf("You did not guess correctly\n");
        }
    }
}

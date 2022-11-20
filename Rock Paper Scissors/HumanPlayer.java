import java.util.Scanner;

public class HumanPlayer extends GamePlayer
{
    public HumanPlayer(String name)
    {
        super(name);
    }

    @Override
    public void makeChoice()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Choice (Rock - 1, Paper - 2, Scissors - 3): ");
        setChoice(s.nextInt());
    }
}

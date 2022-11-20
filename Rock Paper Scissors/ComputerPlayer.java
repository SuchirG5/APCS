public class ComputerPlayer extends GamePlayer
{
    public ComputerPlayer(String name)
    {
        super(name);
    }

    @Override
    public void makeChoice()
    {
        setChoice((int)(Math.random() * 3) + 1);
    }
}

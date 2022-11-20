import java.awt.*;

public class Square2 extends Shape
{
    int width;
    public Square2(int x, int y, int width, Color color)
    {
        super(x, y, color);
        this.width = width;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getX() - getX()/2, getY() - getY()/2, width, width);
    }
}

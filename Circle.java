import java.awt.*;
public class Circle extends Shape 
{
    int diameter;
    public Circle(int x, int y, int diameter, Color color)
    {
        super(x, y, color);
        this.diameter = diameter;
    }
    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getX(), getX(), diameter, diameter);
    }
}

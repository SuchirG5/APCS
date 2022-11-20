import java.awt.*;
//COMMIT TEST
public abstract class Shape 
{
    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g);

public int getX() {
	return this.x;
}
public void setX(int x) {
	this.x = x;
}


    public int getY() {
    	return this.y;
    }
    public void setY(int y) {
    	this.y = y;
    }



    public Color getColor() {
    	return this.color;
    }
    public void setColor(Color color) {
    	this.color = color;
    }


    
}

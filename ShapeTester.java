import java.awt.Color;
import java.awt.Graphics;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ShapeTester extends JPanel {

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final Color BACKGROUND = Color.GRAY;

	private BufferedImage image;
	private Graphics buffer;

	public ShapeTester() {
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		buffer = image.getGraphics();

		drawBackground();

		Circle topLeftCircle = new Circle(0, 0, 50, Color.BLUE);
		Circle middleCircle = new Circle(200, 400, 120, Color.GREEN.brighter());
		Square2 leftSquare = new Square2(0, 100, 100, Color.YELLOW);
		Square2 square = new Square2(500, 200, 100, Color.RED);
		//Triangle leftTriangle = new Triangle(300, 100, 100, Color.PINK);
		//Triangle Triangle = new Triangle(500, 200, 100, Color.YELLOW);
		

		topLeftCircle.draw(buffer);	// ensure only 25% of the blue circle appears on screen 
		middleCircle.draw(buffer);
		//leftTriangle.draw(buffer);	// ensure only 50% of the yellow square appears on the screen
		//Triangle.draw(buffer);
		
		

	}

	/**
	 * Draws the background
	 */
	public void drawBackground() {
		buffer.setColor(BACKGROUND);
		buffer.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Shape Tester");
		frame.setSize(800, 600);
		frame.setLocation(50, 100);
		frame.setContentPane(new ShapeTester());
		frame.setVisible(true);
	}

}
  //Programmer:  John Chapin , email: john.chapin@lcps.org
	//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class ArtistPanel extends JPanel
{
   private BufferedImage myImage;
   public ArtistPanel(BufferedImage b)
   {
      myImage = b;
   }
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
}
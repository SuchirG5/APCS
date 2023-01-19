/* This lab is from Lesson 15: Finch Fractals 
 * from https://learn.birdbraintechnologies.com/finch/java/program/lesson-15-finch-fractals?wvideo=rvk8lp96lj
 * */
public class FinchFractals {
	
	//TODO: create a field for your finch; instantiate it here
    private static Finch finch = new Finch();
	
	/* This method calls itself recursively to draw a Koch fractal. */
   
	public static void drawFractal(int order, double distance) {
	   //TODO: create the drawFractal method
       if(order == 0)
       {
            finch.setMove("F", distance, 40);
       }
       else{
       drawFractal(order - 1, distance/3);
       finch.setTurn("L", 60, 50);
       drawFractal(order - 1, distance/3);
       finch.setTurn("R", 120, 50);
       drawFractal(order - 1, distance/3);
       finch.setTurn("L", 60, 50);
       drawFractal(order - 1, distance/3);
       }
	}
	
    public static void main(String[] args) {
    	//call the drawFractal method for an order and distance
        for(int i = 0; i < 1; i++)
        {
    	   // drawFractal(2, 20);
            //finch.setTurn("R", 60, 40);
        }
    	//TODO: Draw two more fractals to create a snowflake
    	
    	//TODO: Close connection to your finch
    }
}
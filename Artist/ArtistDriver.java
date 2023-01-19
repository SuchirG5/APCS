
//Programmer:   John Chapin	
//email:  john.chapin@lcps.org
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class ArtistDriver {
	public static void printArray(Artist[] printArr) {
		System.out.print("{");
		for (int i = 0; i < printArr.length; i++) {
			System.out.println(printArr[i].toString());
		}
		System.out.println("}");
	}

	public static Artist[] readFile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Filename (Including .txt)? Example: artist.txt:");
		String filename = sc.next();
		Scanner infile = null;
		int numOfArtists = 0;

		try {
			infile = new Scanner(new File(filename));
		} catch (IOException e) {
			System.out.println("oops");
		}

		// read in the number of objects on first line
		if (infile.hasNext()) {
			numOfArtists = infile.nextInt();
			infile.nextLine();
		} else {
			System.out.println("file is empty!");
		}
		//create array the size that was read in
		Artist[] myArray = new Artist[numOfArtists];

		// read in each object
		for (int index = 0; index < numOfArtists; index++) {
			// Artists have 4 data fields
			// 4 input lines for each Artist
			String artistName = "";
			String songName = "";
			Long songSales = 0L;
			String artistImage = "";
			if (infile.hasNext()) {
				artistName = infile.nextLine();
			} else {
				System.out.println("Infile does not have artist name.");
				break;
			}

			if (infile.hasNext()) {
				songName = infile.nextLine();
			} else {
				System.out.println("Infile does not have song name.");
				break;
			}

			if (infile.hasNext()) {
				artistImage = infile.nextLine();
			} else {
				System.out.println("Infile does not have song name.");
				break;
			}

			if (infile.hasNext()) {
				songSales = infile.nextLong();
				if (infile.hasNext())
					infile.nextLine();
			} else {
				System.out.println("Infile does not have  name.");
				break;
			}
			myArray[index] = new Artist(artistName, songName, artistImage, songSales);

		} // for loop for each artist
		infile.close();
		return myArray;

	}



	public static void main(String[] args) {

		// input
		Artist[] myArray = readFile();
		//  print the array before sorting
		printArray(myArray);

		// sort the array
		//*************   Your code here   ********


		//print the array after sorting
		//*************   Your code here   ********

		// Panel Output
		final int N = 1600;
		final int imgSize = N / myArray.length;
		BufferedImage image;
		image = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
		Graphics buffer = image.getGraphics();
		buffer.setColor(Color.blue);
		buffer.fillRect(0, 0, N, N);
		buffer.setColor(Color.yellow);

		//Display each song icon and name on a panel 
		for (int i = 0; i < myArray.length; i++) {
			//draw Artist song Image on Buffer
			// declares and initializes an ImageIcon object referenced by i
			ImageIcon img = new ImageIcon(myArray[i].getArtistImage());
			// draws the scaled image on the panel using Graphics method drawImage
			buffer.drawImage(img.getImage(), i * imgSize, 20, imgSize - 10, imgSize - 10, null);

			//  Draws the name of the song under the Icon
			buffer.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
			buffer.setColor(Color.white);
			buffer.drawString(myArray[i].getSongName(), i * imgSize, imgSize + 20 + 20);
		}

		JFrame frame = new JFrame("Artists");
		frame.setSize(N, N);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ArtistPanel(image));
		frame.setVisible(true);

	}
}
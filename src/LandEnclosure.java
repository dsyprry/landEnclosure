import java.util.Scanner;
import java.text.DecimalFormat;


public class LandEnclosure {

	public static void main(String[] args) {
		
		boolean repeat = false;
		 
		do {
	
		
			Scanner scandra = new Scanner(System.in);
			DecimalFormat newFormat = new DecimalFormat("0.00");
				
			double area = 0;
			double ratioL = 0;
			double ratioW = 0;
			
			
			System.out.println("What will be the square foot area of your land enclosure?");
			area = scandra.nextInt();
			
			System.out.println("What is the ratio of length to width of your enclosure? (l w)");
			ratioL = scandra.nextInt();
			ratioW = scandra.nextInt();
			
			double ratio = (ratioL/ratioW);
			double areaDivRat = (area/ratio);
			double width = (Math.sqrt(areaDivRat));
			double length = (width*ratio);
			
			double perimeter = ((length*2)+(width*2));
			System.out.println("Your enclosure has dimensions of " + newFormat.format(length) + " feet by " + newFormat.format(width) + " feet.\n"
			+ "You will need " + newFormat.format(perimeter) + " feet of fence total. \n\n"
			+ "========================================================\n\n" 
			+ "Start Over [Y/N]");
			
		
		char answer = scandra.next().charAt(0);
		
		if (answer == 'Y' || answer == 'y') {
			repeat = true;
		} else {
			repeat = false;
			System.out.println("Goodbye.");
		}
		
		
		
		} while (repeat == true);
	}

}

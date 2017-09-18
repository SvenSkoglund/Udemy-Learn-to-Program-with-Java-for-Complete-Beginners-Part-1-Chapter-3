// Asks the user for a number and then returns that number squared

package examples;

	public class squares
{
		public static void main(String [] Args)
		{
			//Opens a new scanner
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			
			// Defines variables for the number the user enters and
			// the number returned
			int num = 0;
			int result = 0;
			int count = 0;
			
			//Makes a loop that will ask the user for a new number 5 times
			for (count = 0; count <5; count = count + 1)
			{
			
				// Asks the user for a number
				System.out.print("Please enter a number:");
				
				// Scans for input and stores the next integer as vaiable num
				num = scanner.nextInt();
				
				// Takes the new variable num and squares it, then stores the
				// result in the variable result
				result = num*num;
				

				
				// Informs the user of the result of their input being squared
				if ( num < 46341)
				{
					System.out.println("The result of squaring " + num + " is " + result);
					System.out.println();
				}
				else {
					System.err.println("Input number " + num + " is too large");
					System.out.println();					
				}

			}
		//Closes the scanner
		scanner.close();
		}
}
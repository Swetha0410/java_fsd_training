/*7. Write a program to implement nested try-catch block for NULL Pointer exception
and NumberFormat Exception*/

package SBA7;

public class Exception1 {

	public static void main(String[] args) {
		 String ptr = null;
		 
	        // Checking if ptr.equals null or works fine.
	        try
	        {
	            // This line of code throws NullPointerException
	            // because ptr is null
	            if (ptr.equals("gfg"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.print("NullPointerException Caught");
	        }
	        
		
	}
}

package test_preparation;

public class Exception_prac
{
	public static void main(String args[])
	{
		    System.out.println("Program Start");
		    String name="Lokesh";
		try
		{
		    Thread.sleep(10);
		    int tname = name.length();
		    System.out.println("String length is     " + tname);
		}
		catch(InterruptedException a)
		{
			System.out.println("10 can not be divided by Zero");
			//System.out.println("String length is " + tname);
		}	
            //System.out.println("Program End");
		finally
		{
			System.out.println("This block will execute always");
		}
	}

}

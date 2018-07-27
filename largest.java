import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the three integers");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x>y && x>z)
		System.out.println("x is largest number");
		else if(y>x && y>z)
		System.out.println("y is largest number");
		else if(z>x && z>y)
		System.out.println("z is largest number");
		else
		System.out.println("entered integer are distinct");
	}
}

import java.util.Scanner;
class Strmnplt
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String x,y,z;
		System.out.print("Enter a string:");
		x=s.next();
		System.out.print("Enter next string:");
		y=s.next();
		z=x+" "+y;
		System.out.println("Length of first String: " + x.length());
		System.out.println("Length of second String: " + y.length());
		System.out.println("Comaparison of Strings:"+x.compareTo(y));
		System.out.println("Concatenation of Strings: " +z);
	    System.out.println("Character at position 3 of "+z+":"+z.charAt(3));
	    System.out.println("last index of 'o' is :" + z.lastIndexOf('o'));
		System.out.println("Conversion to UpperCase: " + z.toUpperCase());
		System.out.println("Conversion to LowerCase:" + z.toLowerCase());
	    System.out.println("EndsWith character 'd': " + z.endsWith("r"));
	}
}

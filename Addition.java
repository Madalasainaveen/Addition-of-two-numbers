package p1;
import java.util.*;
public class Addition 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value-A:");
		int a= s.nextInt();
		System.out.println("Enter the value-B:");
		int b= s.nextInt();
		int c = a+b;
		System.out.println("Addition Two Numbers:"+c);
		s.close();
	}

}

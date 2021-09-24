import java.net.*;
import java.io.*;
import java.util.Scanner;
class squarecubeserver
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(8001);
			System.out.println("Server Started...............");
			Socket s = ss.accept();
			DataInputStream in = new DataInputStream(s.getInputStream()); 
			int x= in.readInt();
			DataOutputStream otc = new DataOutputStream(s.getOutputStream()); 
			int y = x;

			int sqr = x*x;
			int cube = y*y*y;
			double sqrtValue = Math.sqrt(x);
       		double cbrtValue = Math.cbrt(y);

			otc.writeUTF("Square root of "+ x +" is = " + sqrtValue);
			otc.writeUTF("Square of "+ x +" is = " + sqr);
			otc.writeUTF("Cube root of "+ y +" is = " + cbrtValue);
			otc.writeUTF("Cube of "+ y +" is = " + cube);
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

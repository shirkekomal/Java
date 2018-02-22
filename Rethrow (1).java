package kk7;
import java.io.*;
import java.util.*;

class Rethrow
{
	static void m1()throws FileNotFoundException
	{
		try{
			File f=new File("ABC.txt");
			FileReader fr=new FileReader(f);
		}
		catch(FileNotFoundException e){
			throw e;
		}
	catch(Exception e)
	{
		System.out.println("|||Exception Found||||");
	}
	}
	public static void main(String args[])
	{
		try{
			m1();
		}catch(FileNotFoundException e)
		{
			System.out.println("Main !!!!!!");
		}
	}
}
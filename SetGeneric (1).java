package kk7;
import java.io.*;
import java.util.*;
class SetGeneric
{
	public static void main(String args[])
	{
		
		System.out.println("********GENERIC SET-hashset********");
		Set <String>l=new HashSet<>();
		l.add("komal");
		l.add("shirke");
		l.add("Abhi");
		l.add("kshitij");
		l.add("kiran");
		
		for(String s:l)
		{
			System.out.println(s);
		}
		
		l.remove("kiran");
		//Integer i=l.indexOf("kshitij");
		//System.out.println("Index"+i);
		System.out.println("......After Remove......");
		for(String s:l)
		{
			System.out.println(s);
		}
	}
}
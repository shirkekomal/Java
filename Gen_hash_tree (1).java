package kk7;
import java.io.*;
import java.util.*;

class Gen_hash_tree
{
	public static void main(String args[])
	{
	LinkedHashSet<Integer> l=new LinkedHashSet<>();
	l.add(10);
	l.add(30);
	l.add(20);
	l.add(50);
	l.add(70);
	
	System.out.println(l);
	System.out.println("*************************");
	for(Integer i:l)
	{
		System.out.println(i);
	}
	LinkedHashSet<String> ll=new LinkedHashSet<>();
	ll.add("komal");
	ll.add("palak");
	ll.add("Versha");
	ll.add("Manoj");
	ll.add("kunal");
	
	System.out.println(ll);
	System.out.println("*************************");
	for(String i:ll)
	{
		System.out.println(i);
	}
	}
}
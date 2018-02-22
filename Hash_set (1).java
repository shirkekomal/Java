package kk7;
import java.io.*;
import java.util.*;
class Hash_set{
	
	public static void main(String args [])
	{
		Set<Integer> l=new HashSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("HashSet"+l);
		
		System.out.println("+++++++++++++++");
		for(Integer k:l)
		{
			System.out.println(k);
		}
		l.remove(10);
		System.out.println("+++++++++++++++");
		for(Integer k:l)
		{
			System.out.println(k);
		}
		System.out.println("+++++++++++++++");
			System.out.println(l.contains(50));
		System.out.println("+++++++++++++++");
	}
}
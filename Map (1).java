package kk7;
//import java.io.*;
//import java.util.*;

import java.util.Map;
import java.util.HashMap;

class student
{
	int id;
	int roll;
	String name;
	
	public String toString()
	{
		return this.id+"--"+this.roll+"--"+this.name;
	}
}


class Map
{
	public static void main(String args[])
	{
		student s=new student();
		s.id=1;
		s.roll=32;
		s.name="KOmal";
		
		student s1=new student();
		s1.id=2;
		s1.roll=33;
		s1.name="Kiran";
		
		Map<Integer,student> map=new HashMap<>();
		map.put(1,s);
		map.put(2,s1);
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
	}
}
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India", 1);
		hm.put("Nigeria",2);
		hm.put("Canada",3);
		hm.put("USA",4);
		hm.put("Turkey",5);
		
		System.out.println(hm.get("USA"));
		System.out.println(hm.get("Turkey"));
		System.out.println(hm.containsKey("USA"));
		System.out.println(hm.containsKey("France"));
		System.out.println(hm);
		
		Set<String> set_first=hm.keySet();     //set_first
		System.out.println(set_first);
		
		for(String s: set_first)
		{
		    int k=hm.get(s);
		    System.out.println(s+" "+k);
		}
		
		
	}
}

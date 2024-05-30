/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//output ---g
import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String str="boeinggggggg";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(hm.containsKey(ch))
		    {
		        int of=hm.get(ch);
		        int nf=of+1;
		        hm.put(ch,nf);
		    }
		    else{
		        hm.put(ch,1);
		    }
		}
		
		char maxch=str.charAt(0);
	for(Character val: hm.keySet())
	{
	    int a=hm.get(val);
	    if(a>hm.get(maxch))
	    maxch=val;
	}
	
	System.out.println(maxch);
		
	}
}

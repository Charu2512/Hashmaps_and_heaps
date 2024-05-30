/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
11
10
5
9
1
11
8
6
15
3
12
2
 
5
8

*/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++)
		{
		    arr1[i]=scn.nextInt();
		}
		
		HashMap<Integer,Boolean> hm=new HashMap<>();
		for(int val:arr1)
		{
		    hm.put(val,true);
		}
		
		for(int val:arr1)
		{
		    if(hm.containsKey(val-1))
		    hm.put(val,false);
		}
		int maxl=0;
		int maxval=arr1[0];
		System.out.println(" ");
		for(int val:arr1)
		{
		    if(hm.get(val)==true)
		    {
		        int tl=1;
		        int tv=val;
		        while(hm.containsKey(tv+tl))
		        {
		            tl++;
		        }
		        if(tl>maxl)
		        {maxl=tl;
		        maxval=tv;}
		        
		    }
		}
		System.out.println(maxl);
		System.out.println(maxval);
		
		
		
		
		
		
	}
}

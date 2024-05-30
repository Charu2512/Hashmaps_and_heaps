/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Output 
/*
7
1
1
2
2
2
3
5
7
1
1
1
2
2
4
5
 
1
1
2
2
5
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
		
		int n2=scn.nextInt();
		int[] arr2=new int[n2];
		for(int i=0;i<n2;i++)
		{
		    arr2[i]=scn.nextInt();
		}
		
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n1;i++)
		{
		    if(hm.containsKey(arr1[i]))
		    {
		        int of=hm.get(arr1[i]);
		        int nf=of+1;
		        hm.put(arr1[i],nf);
		    }
		    else{
		        hm.put(arr1[i],1);
		    }
		}
		System.out.println(" ");
		for(int val: arr2)
		{
		    if(hm.containsKey(val) && hm.get(val)>0)
		    {
		        System.out.println(val);
		        int of=hm.get(val);
		        int nf=of-1;
		        hm.put(val,nf);
		    }
		}
		
		
	}
}

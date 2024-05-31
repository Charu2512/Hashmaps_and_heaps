/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Output
2
9
2
3
1
4
6
7
5
8
9
 
1
2
3
4
5
6
7
8
9
*/

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner scn=new Scanner(System.in);
		int k=scn.nextInt();
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=scn.nextInt();
		}
		System.out.println(" ");
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		while(i<=k)
		{
		    pq.add(arr[i]);
		    i++;
		    
		}
		while(i<n)
		{
		   System.out.println(pq.peek());
		   pq.remove();
		   pq.add(arr[i]);
		    i++;
		}
		
		
		while(pq.size()>0)
		{
		    System.out.println(pq.peek());
		    pq.remove();
		}
		
	}
}


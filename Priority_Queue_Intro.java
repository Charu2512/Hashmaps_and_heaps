/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Remove Collections.reverseOrder()---to print the sequence in ascending order
//output
/*
5
3
4
2
8
1
 
8
4
3
2
1
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
		System.out.println(" ");
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int val:arr1)
		{
		    pq.add(val);
		}
		while(pq.size()>0)
		{
		    System.out.println(pq.peek());
		    pq.remove();
		}
		
		
		
		
		
	}
}

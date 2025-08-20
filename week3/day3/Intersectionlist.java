package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class Intersectionlist {
	public static void main(String[] args) {
	int firstarr[]= {3, 2, 11, 4, 6, 7};
	int secondarr[]= {1, 2, 8, 4, 9, 7};
	
	List<Integer> firstlist=new ArrayList<Integer>();
	List<Integer> secondlist=new ArrayList<Integer>();
	//creating the first list
	for (Integer first : firstarr)
	{
	firstlist.add(first);
	}
 System.out.println(firstlist);
 //creating the second list
 for (Integer second :secondarr)
	{
	 secondlist.add(second);
	}
System.out.println(secondlist);

for(int i=0;i<firstlist.size();i++)
{
	for(int j=0;j<secondlist.size();j++)
	{
		if(firstlist.get(i)==secondlist.get(j))
		{
			System.out.println("The numbers are:"+(firstlist.get(i)));
		}
	}
}

}
}

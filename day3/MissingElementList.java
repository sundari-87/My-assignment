package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,10,6,8};
		List<Integer> num=new ArrayList<Integer>();
		for (Integer each : numbers) {
			num.add(each);
		}
		Collections.sort(num);
         System.out.println(num);
         
         for(int i=0;i<num.size()-1;i++)
         {
        	 int j=num.get(i)+1;
        	 if(j==num.get(i+1))
        	 {
        		 continue;
        	 }
        	 else
        		 System.out.println("Missing element is :"+(num.get(i)+1));
        	 
		}
         
	}

}

package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3, 2, 11, 4, 6, 7};
		List<Integer> secondlarge=new ArrayList<Integer>();
for (Integer large : num) {
	secondlarge.add(large);
}
		System.out.println(secondlarge);
		Collections.sort(secondlarge);
		System.out.println(secondlarge);
		int number=secondlarge.size();
		System.out.println("Second largest number is:"+(secondlarge.get(number-2)));
	}

}

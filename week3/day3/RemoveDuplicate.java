package week3.day3;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String companyname="google";
		char[] name=companyname.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		// TODO Auto-generated method stub
		for(int i=0;i<name.length;i++)
		{
			set.add(name[i]);
		}
System.out.println(set);
	}

}

package week2.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text="We learn Java basics as part of java sessions in java week1";
		
		String[] split=text.split(" ");
		String[] split1=split;
		
		
		for (int i = 0; i <=split.length-1; i++) {
	for (int j = i+1; j <= split.length-1; j++) {
		if (split[i].equalsIgnoreCase(split[j])) {
			
			  split1[i]=split[i].replace(split[i], " ");
			  
			}
		
	}
	
}
for (int k= 0; k <= split1.length-1; k++) {
	System.out.println(split1[k]);;
}
	
	
}

	}



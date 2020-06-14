package Runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	
	public static void main(String[] args)
	{
		Collection<Integer> values= new ArrayList<>();
		
		values.add(10);
		values.add(85);
		values.add(78);
		values.remove(55);
		//values.add("fff")
	//	int i;
		for (int i : values)
		{
			System.out.println(i);
		}
	}
	

}
 
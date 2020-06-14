package Runner;

class StaticFunct
{
	
	static void display ()
	{
		System.out.println("In Static Function Display");
	}
}

public class StaticFunctDemo {
	
	
	
	
	 public static void main(String[] args) 
	    { 
	      
		 StaticFunct obj1= new StaticFunct();
		 obj1.display();
		 		
		 StaticFunct.display();	 
	    }

}

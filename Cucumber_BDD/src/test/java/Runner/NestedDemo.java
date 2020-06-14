package Runner;

class outer 
{
	static class inner
	{
		int i=5;
	  static void display()
		{
			System.out.println("Inside inner class");
		}
	}
}

public class NestedDemo {
	
	

	public static void main(String[] args) {
		
		outer o1= new outer();
		outer.inner i1=  new outer.inner();
		i1.display();
		
		outer.inner.display();
		//outer.inner.i;
		//outer
		//outer.inner.display();
		// TODO Auto-generated method stub

	}

}

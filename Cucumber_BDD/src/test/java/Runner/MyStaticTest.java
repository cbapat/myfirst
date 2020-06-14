package Runner;

class MyClass {
	
	  void  myStaticMethod()
	{
      System.out.println("In Super Static");		
	}
	
	public void show()
	{
		//static int a=10;
		System.out.println("In super show");
	}
	
}

interface IntF
{
	void show();
}
class MySubClass extends MyClass
{
	   void  myStaticMethod()
	{
      System.out.println("In Sub Static");		
	}
}

public class MyStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	 MyClass myObject = new MyClass();
		// myObject.myStaticMethod();
		 // should be written as
		// MyClass.myStaticMethod();
		 
		 //MyClass M1;
		 //myObject= new MySubClass();
		 //myObject.myStaticMethod();
		 // because it is not dispatched on myObject
		 //MySubClass myObject1= new MySubClass();
		 //myObject1.myStaticMethod();
		 //MySubClass.myStaticMethod();
		 
		 //IntF obj = new MySubClass();
		 
    StaticOverload();
    int a=StaticOverload(10);
    
	}
	
	
	public static void StaticOverload()
	{
	    System.out.println("in void StaticOverload");	
	}
	
	public static int StaticOverload(int a)
	{
	    System.out.println("in void StaticOverload with params");	
	    return 	0;
	}
	
}	

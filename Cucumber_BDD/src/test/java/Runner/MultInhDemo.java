package Runner;



	class Supercls implements IntF1 
	{
		public void show()
		{
			System.out.println("In Super class");
			
		}
	  public static void allowedtoo()
	{
		System.out.println("In Super class allowedtoo");
	}
	
	public void allowed()
	{
		System.out.println("In Super class allowed");
	}
		
	}
	
	interface IntF1
	{
		void show();
		default  void allowed()
		{
			System.out.println(" This is allowed");
		}
		/*static void allowedtoo()
		{
			System.out.println("This is allowed too in  interface");
		}*/
	}
	
	class SubCls  extends Supercls
	{
		public void show()
		{
			System.out.println("In Sub class");
		}
		
		
		
		public static void abc ()
		{
			System.out.println("DFSFSFFS");
		}
		
		public static void allowedtoo()
		{
			System.out.println("In Sub class allowedtoo");
		}
		
	}
	
	
	public class MultInhDemo  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MultInhDemo md = new MultInhDemo();
		SubCls sb1= new SubCls();
		//sb1.show();
		IntF1 iF1 =  new SubCls();   // WebDriver driver = new ChromeDriver();
		
		iF1.allowed();
		iF1.show();
		
		Supercls.allowedtoo();
	
		
		
	    //IntF1 iF2= new Supercls();
	
		//iF1.show();
		
		//iF1.allowed();
		//MultInhDemo md = new MultInhDemo();
		
		
		
	}
	 /*public   void show()
		{
			System.out.println("dfsdfsfsf");
		}*/
		//iF1.all
		//IntF1
	    //sb1.allowed();
	   // sb1.allowedtoo();
		
	}




//int a
//IntF1 if1

   //A        B
   
     //   C



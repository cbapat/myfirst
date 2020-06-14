package Runner;




class Test 
{ 
    // static variable 
    static int a = 10; 
      
    int x= m3();
   
   int v=m1();

    // instance variable 
    int b = 20; 

    static Test t = new Test();
    
    

    
    //m2();
      
    // static method 
    static int m1() 
    { 
        a = a+20; 
        System.out.println("from m1, value of a is "+a); 
        
          
         // Cannot make a static reference to the non-static field b 
       //  b = 10; // compilation error 
                  
         // Cannot make a static reference to the  
                 // non-static method m2() from the type Test 
         //m2();  // compilation error 
        return 10;
           
         //  Cannot use super in a static context 
         //System.out.println(super.a); // compiler error  
    } 
      
    static int m3() 
    { 
    	System.out.println("Inside M3: ");
      return 20;
    }
    // instance method 
    void m2() 
    {     
        System.out.println("from m2"); 
    } 
      
      
   
    
    public static void main(String[] args) 
    { 
        // main method  
    	//m1();()
    	new Test().m2();
    	new Test().m1();
    	new Test().m3();
    	//new Test().m1

    	t.m2();
    	
    	
        System.out.println(t.b);
    	
    	Test t1=new Test();
    	t1.m1();
        t1.m2();
        t1.m3();
    	
    } 
}   

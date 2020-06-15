package Runner;

public class AbsDemo {
	
	
	 
		abstract class Shape
		{
		String color;
		abstract double area();
		
		public Shape(String col)
		{
			System.out.println("Inside Shape Constructor");
			this.color=col;
		}
		

	}

	class Circle extends Shape
	{
		double radious;

		public Circle(String col, double radious) {
			super(col);
			System.out.println("Inside Circle Constructor");
			this.radious=radious;
			System.out.println("Color of Circle is "+super.color);
		}

		@Override
		double area() {
			// TODO Auto-generated method stub
			
			
			return Math.PI * Math.pow(radious, 2);
			
			//return 0;
		}
		
	}

	class Rectangle extends Shape
	{
	   int len;
	   int wid;
		public Rectangle(String col, int l, int w) {
			super(col);
			this.len =l;
			this.wid =w;
			System.out.println("Inside Rectangle Constructor");
			System.out.println("Color of Rectangle is "+super.color);
			// TODO Auto-generated constructor stub
		}

		@Override
		double area() {
			// TODO Auto-generated method stub
			
			return len*wid;
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsDemo a=new AbsDemo();
		Shape s1=a.new Circle("Red",12.5);
		Shape s2=a.new Rectangle("Blue",15,25);
		System.out.println("Area of Circle is "+s1.area());
		System.out.println("Area of Rectangle is "+s2.area());
		System.out.println("Hello");

	}

}

class Box1
{
	double width,height,depth;
	Box1()
	{
		
		
		
		System.out.println("Default contructor called");
		width=4;
		height=5;
		depth=6;
	}
	
	Box1(double w,double h,double d)
	{
		System.out.println("Parameterized Consturctor");
		width=w;
		height=h;
		depth=d;
	}
	Box1(Box1 b)
	{ 
		System.out.println("copy constructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
		
	}
	
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}
public class Constructor {

	public static void main(String[] args) {
		Box1 b1=new Box1();
		b1.volume();
		
		Box1 b2=new Box1(5,6,7);
		b2.volume();
		Box1 b3=new Box1(b2);
		b3.volume();
		

	}

}

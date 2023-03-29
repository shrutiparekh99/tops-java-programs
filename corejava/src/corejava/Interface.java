package corejava;
interface RBI
{
	void roi(double r);
}
	class SBI implements RBI
{
	public void roi(double r)
	{
		System.out.println("SBI Rate of Interest:"+r);
	}
}
	class BOB implements RBI
	{
	public void roi(double r) 
	{
		System.out.println("BOB rate of interest:"+r);
		
	}
		
	}	
public class Interface {
	public static void main(String[] args) {
		SBI s=new SBI();
		s.roi(6.3);
		BOB b=new BOB();
		b.roi(5.2);
		
	}

}

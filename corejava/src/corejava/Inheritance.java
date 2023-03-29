package corejava;
import java.util.Scanner;
class A2
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
	class B2 extends A2
	{
		int b;
		void getB()
		{
			Scanner sc=new Scanner(System.in);
		   System.out.println("Enter B :");
		   b=sc.nextInt();
		}
		   void putB()
			{
				System.out.println("B : "+b);
			}
	}
		   class C2 extends A2
			{
				int c;
				void getC()
				{
					Scanner sc=new Scanner(System.in);
				   System.out.println("Enter C :");
				   c=sc.nextInt();
				}
				   void putC()
					{
						System.out.println("C : "+c);
					}   
		}
	public class Inheritance {

	public static void main(String[] args) {
    B2 b=new B2();
    C2 c=new C2();
    b.getA();
    b.getB();
    c.getC();
    c.putA();
    b.putB();
    c.putC();
    
    
    
	}

}

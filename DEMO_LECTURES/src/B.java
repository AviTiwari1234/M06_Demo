
class B
{
	static int a;
	
	static void m()
	{
		System.out.println("static method");
		
	}
	static
	{
		System.out.println("static block");
		
	}
	static
	{
		System.out.println("static block2");
		
	}
	public static void main(String[] args)
	{B b=new B();
		System.out.println("main method");
		m();
		
			System.out.println(a);
			System.out.println(b.a);
			
	
		
	}
}

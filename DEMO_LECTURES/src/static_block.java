
public class static_block {
	static int a;

	public static void main(String[] args) {
		System.out.println("Executing the main block" );
		System.out.println(a);
	

	}
	static void m()
	{
		System.out.println("I am static Method()");
		
	}
	static
	{
		System.out.println("India is best");
		static_block.m();	
	}

	static
	{
		System.out.println("Vande Mataram");
		
	}
	static
	{
		System.out.println("Jai Hind");
	}

}


public class outer {
	static int x;
	
	static class Nested_class
	{
		
		public void method_demo()
		{
			System.out.println("This is my nested class");
			x=100;
			System.out.println("Variable of outer class= "+x);
		}
	}
	

	public static void main(String[] args) {
		
		
	outer.Nested_class obj=new outer.Nested_class();
	obj.method_demo();


	}

}

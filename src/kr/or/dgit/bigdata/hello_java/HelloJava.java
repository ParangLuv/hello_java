package kr.or.dgit.bigdata.hello_java;

import kr.or.dgit.bigdata.hello_java.func.Gugudan;

public class HelloJava {
	public static void main(String[] args)

	{
		
		
		System.out.println("Hello Java");

		int result = add(3, 4);
		
		System.out.println("Galaxy Note " + result);
		
		Gugudan g = new Gugudan();
			for(int dan=2; dan < 10 ; dan++)
			{
			
				g.calGugudan(dan);
			
			}
		
		
	}
	
	private static int add(int i, int j)

	{
		

		int sum = i + j;
		return sum;
		
		
	}

}
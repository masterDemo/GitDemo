package packageDemo;

public class Test2 {


	public static void main(String[] args) {
		
		
		Calc c1=new Calc();
		int f=c1.add(10, 20);
		System.out.println("sum is "+f);
		int r=c1.sub(30,20);
		System.out.println("sub is "+r);
		
		
		
		
	
		

	}
	
}
class Calc
	{

	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int e, int f)
	{
		int h=e-f;
		return h;
	}
	
	
}

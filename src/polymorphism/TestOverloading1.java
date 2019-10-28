package polymorphism;

class Adder{  
static double add(double a,int b)
    {
	return a+b;
	}  

static double add1(double a,int b)
    {
	return a-b;
	}  
}  
public class TestOverloading1 
{
	public static void main(String[] args)
	    {  
		System.out.println(Adder.add(11.2,11));
		System.out.println(Adder.add1(11.2,11));
		}
	} 

